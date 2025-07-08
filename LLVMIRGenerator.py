import logging
from typing import List, Dict, Any

class LLVMIRGenerator:
    """
    Gerador de código LLVM IR a partir de instruções TAC
    para a linguagem Lens.
    """
    
    def __init__(self, tac_instructions: List[Dict[str, Any]]):
        self.tac_instructions = tac_instructions
        self.llvm_code = []
        self.variables = {}          # Mapeamento de variáveis para tipos LLVM
        self.temp_counter = 0        # Contador para variáveis temporárias
        self.label_counter = 0       # Contador para labels
        self.string_literals = {}    # Mapeamento de strings para globals
        self.string_counter = 0      # Contador para strings globais
        
    def generate(self) -> str:
        """Gera o código LLVM IR completo."""
        self.llvm_code = []
        
        # Cabeçalho do arquivo LLVM
        self._generate_header()
        
        # Declarações de funções externas
        self._generate_external_functions()
        
        # Strings globais
        self._generate_global_strings()
        
        # Função principal
        self._generate_main_function()
        
        return '\n'.join(self.llvm_code)
    
    def _generate_header(self):
        """Gera o cabeçalho do arquivo LLVM."""
        self.llvm_code.extend([
            "; Código LLVM IR gerado para a linguagem Lens",
            "; Gerado automaticamente pelo compilador",
            "",
            "target datalayout = \"e-m:w-p270:32:32-p271:32:32-p272:64:64-i64:64-f80:128-n8:16:32:64-S128\"",
            "target triple = \"x86_64-pc-windows-gnu\"",
            ""
        ])
    
    def _generate_external_functions(self):
        """Gera declarações de funções externas necessárias."""
        self.llvm_code.extend([
            "; Declarações de funções externas",
            "declare i32 @printf(i8*, ...)",
            "declare i32 @scanf(i8*, ...)",
            "declare i32 @puts(i8*)",
            "declare i8* @malloc(i64)",
            "declare void @free(i8*)",
            ""
        ])
    
    def _generate_global_strings(self):
        """Gera strings globais necessárias."""
        # Analisar instruções TAC para encontrar strings
        for instr in self.tac_instructions:
            if instr['op'] == 'PRINT':
                arg = instr['arg1']
                if isinstance(arg, str) and arg.startswith('"') and arg.endswith('"'):
                    self._add_string_literal(arg)
        
        # Formatos para printf e scanf
        self._add_format_string('int_format', '"%d"')
        self._add_format_string('int_format_newline', '"%d\\n"')
        self._add_format_string('string_format', '"%s"')
        self._add_format_string('string_format_newline', '"%s\\n"')
        self._add_format_string('scanf_int', '"%d"')
        self._add_format_string('newline', '"\\n"')
        
        # Gerar as strings globais
        self.llvm_code.append("; Strings globais")
        for name, value in self.string_literals.items():
            # Processar escapes
            escaped_value = self._escape_string(value)
            
            # Calcular tamanho baseado no valor processado
            # Remove aspas do escaped_value para contar bytes
            content = escaped_value[1:-1]  # Remove aspas externas
            # Decodifica escapes LLVM para contar bytes reais
            real_content = content.replace('\\0A', '\n').replace('\\09', '\t').replace('\\0D', '\r').replace('\\00', '\0')
            length = len(real_content.encode('utf-8'))
            
            self.llvm_code.append(f"@{name} = private unnamed_addr constant [{length} x i8] c{escaped_value}, align 1")
        self.llvm_code.append("")
        
    def _add_string_literal(self, string_value: str) -> str:
        """Adiciona uma string literal e retorna seu nome global."""
        if string_value not in self.string_literals.values():
            self.string_counter += 1
            name = f"str_{self.string_counter}"
            self.string_literals[name] = string_value
            return name
        else:
            # Encontrar o nome existente
            for name, value in self.string_literals.items():
                if value == string_value:
                    return name
        return ""
    
    def _add_format_string(self, name: str, value: str):
        """Adiciona uma string de formato."""
        if name not in self.string_literals:
            self.string_literals[name] = value
    
    def _escape_string(self, s: str) -> str:
        """Escapa uma string para LLVM."""
        # Remove aspas externas
        if s.startswith('"') and s.endswith('"'):
            s = s[1:-1]
        
        # Converte escapes para formato LLVM
        s = s.replace('\\n', '\\0A')    # Nova linha
        s = s.replace('\\t', '\\09')    # Tab
        s = s.replace('\\r', '\\0D')    # Carriage return
        s = s.replace('\\\\', '\\5C')   # Backslash literal
        
        # Adiciona null terminator
        return f'"{s}\\00"'
    
    def _generate_main_function(self):
        """Gera a função principal."""
        self.llvm_code.extend([
            "; Função principal",
            "define i32 @main() {",
            "entry:"
        ])
        
        # Analisar todas as variáveis que serão usadas
        self._pre_analyze_variables()
        
        # Gerar todas as declarações de variáveis no início
        self._generate_all_allocas()

        # Processar instruções TAC
        for instr in self.tac_instructions:
            self._process_tac_instruction(instr)
        
        # Retorno da função
        self.llvm_code.extend([
            "  ret i32 0",
            "}"
        ])
    
    def _pre_analyze_variables(self):
        """Analisa todas as instruções TAC para encontrar variáveis que serão usadas."""
        for instr in self.tac_instructions:
            op = instr['op']
            arg1 = instr['arg1']
            arg2 = instr['arg2']
            result = instr['result']
            
            # Coletar todas as variáveis usadas
            if op == 'ASSIGN':
                if not self._is_integer(arg1) and not self._is_string(arg1):
                    self._register_variable(arg1)
                self._register_variable(result)
            
            elif op in ['+', '-', '*', '/', '==', '!=', '<', '<=', '>', '>=', '&&', '||']:
                if not self._is_integer(arg1):
                    self._register_variable(arg1)
                if not self._is_integer(arg2):
                    self._register_variable(arg2)
                self._register_variable(result)
            
            elif op == 'PRINT':
                if not self._is_integer(arg1) and not self._is_string(arg1):
                    self._register_variable(arg1)
            
            elif op == 'read':
                self._register_variable(result)
            
            elif op in ['IF_FALSE', 'IF_TRUE']:
                if not self._is_integer(arg1):
                    self._register_variable(arg1)

    def _register_variable(self, name: str):
        """Registra uma variável para alocação posterior."""
        if name and name not in self.variables:
            # Determinar tipo baseado no nome ou padrão
            if name.startswith('nome') or name.startswith('sobrenome'):
                var_type = 'i8*'
            else:
                var_type = 'i32'
            
            self.variables[name] = {
                'type': var_type,
                'llvm_name': f"%{name}"
            }

    def _generate_all_allocas(self):
        """Gera todas as declarações alloca no início da função."""
        for name, info in self.variables.items():
            var_type = info['type']
            if var_type == 'i32':
                self.llvm_code.append(f"  %{name} = alloca i32")
            elif var_type == 'i8*':
                self.llvm_code.append(f"  %{name} = alloca i8*")

    def _process_tac_instruction(self, instr: Dict[str, Any]):
        """Processa uma instrução TAC e gera código LLVM equivalente."""
        op = instr['op']
        arg1 = instr['arg1']
        arg2 = instr['arg2']
        result = instr['result']
        
        if op == 'ASSIGN':
            self._generate_assign(arg1, result)
        elif op in ['+', '-', '*', '/']:
            self._generate_arithmetic(op, arg1, arg2, result)
        elif op in ['==', '!=', '<', '<=', '>', '>=']:
            self._generate_comparison(op, arg1, arg2, result)
        elif op in ['&&', '||']:
            self._generate_logical(op, arg1, arg2, result)
        elif op == 'PRINT':
            self._generate_print(arg1, arg2)
        elif op == 'read':
            self._generate_read(result)
        elif op == 'LABEL':
            self._generate_label(result)
        elif op == 'GOTO':
            self._generate_goto(result)
        elif op == 'IF_FALSE':
            self._generate_if_false(arg1, result)
        elif op == 'IF_TRUE':
            self._generate_if_true(arg1, result)
        else:
            self.llvm_code.append(f"  ; Operação não implementada: {op}")
    
    def _generate_assign(self, source: str, dest: str):
        """Gera código para atribuição."""
        source_val = self._get_value(source)
        dest_var = self._get_variable(dest)
        
        # Determinar tipo baseado no valor
        if self._is_integer(source):
            self._ensure_variable_type(dest, 'i32')
            self.llvm_code.append(f"  store i32 {source_val}, i32* {dest_var}")
        elif self._is_string(source):
            # Para strings, precisamos de um ponteiro
            self._ensure_variable_type(dest, 'i8*')
            string_name = self._add_string_literal(source)
            string_len = len(self._escape_string(source))
            self.llvm_code.append(f"  store i8* getelementptr inbounds ([{string_len} x i8], [{string_len} x i8]* @{string_name}, i64 0, i64 0), i8** {dest_var}")
        else:
            # Variável temporária ou variável
            if dest.startswith('t') and source in self.variables:
                # Copiar tipo da variável fonte
                source_type = self.variables[source]['type']
                self._ensure_variable_type(dest, source_type)
                if source_type == 'i32':
                    source_loaded = self._load_variable(source, 'i32')
                    self.llvm_code.append(f"  store i32 {source_loaded}, i32* {dest_var}")
                elif source_type == 'i8*':
                    source_loaded = self._load_variable(source, 'i8*')
                    self.llvm_code.append(f"  store i8* {source_loaded}, i8** {dest_var}")
            else:
                # Assumir inteiro por padrão
                self._ensure_variable_type(dest, 'i32')
                self.llvm_code.append(f"  store i32 {source_val}, i32* {dest_var}")
    
    def _generate_arithmetic(self, op: str, left: str, right: str, result: str):
        """Gera código para operações aritméticas."""
        left_val = self._get_value(left)
        right_val = self._get_value(right)
        
        # Carregar valores se necessário
        if left in self.variables:
            left_reg = self._load_variable(left, 'i32')
        else:
            left_reg = left_val
        
        if right in self.variables:
            right_reg = self._load_variable(right, 'i32')
        else:
            right_reg = right_val
        
        # Mapear operação TAC para LLVM
        llvm_op = {
            '+': 'add',
            '-': 'sub',
            '*': 'mul',
            '/': 'sdiv'
        }[op]
        
        result_reg = self._new_temp_reg()
        self.llvm_code.append(f"  {result_reg} = {llvm_op} i32 {left_reg}, {right_reg}")
        
        # Armazenar resultado
        self._ensure_variable_type(result, 'i32')
        result_var = self._get_variable(result)
        self.llvm_code.append(f"  store i32 {result_reg}, i32* {result_var}")
    
    def _generate_comparison(self, op: str, left: str, right: str, result: str):
        """Gera código para comparações."""
        left_val = self._get_value(left)
        right_val = self._get_value(right)
        
        # Carregar valores se necessário
        if left in self.variables:
            left_reg = self._load_variable(left, 'i32')
        else:
            left_reg = left_val
        
        if right in self.variables:
            right_reg = self._load_variable(right, 'i32')
        else:
            right_reg = right_val
        
        # Mapear operação TAC para LLVM
        llvm_op = {
            '==': 'eq',
            '!=': 'ne',
            '<': 'slt',
            '<=': 'sle',
            '>': 'sgt',
            '>=': 'sge'
        }[op]
        
        result_reg = self._new_temp_reg()
        self.llvm_code.append(f"  {result_reg} = icmp {llvm_op} i32 {left_reg}, {right_reg}")
        
        int_reg = self._new_temp_reg()
        self.llvm_code.append(f"  {int_reg} = zext i1 {result_reg} to i32")
        
        # Armazenar resultado
        self._ensure_variable_type(result, 'i32')
        result_var = self._get_variable(result)
        self.llvm_code.append(f"  store i32 {int_reg}, i32* {result_var}")
    
    def _generate_logical(self, op: str, left: str, right: str, result: str):
        """Gera código para operações lógicas."""
        
        left_val = self._get_value(left)
        right_val = self._get_value(right)
        
        # Carregar valores
        if left in self.variables:
            left_reg = self._load_variable(left, 'i32')
        else:
            left_reg = left_val
        
        if right in self.variables:
            right_reg = self._load_variable(right, 'i32')
        else:
            right_reg = right_val
        
        # Converter para boolean
        left_bool = self._new_temp_reg()
        right_bool = self._new_temp_reg()
        self.llvm_code.append(f"  {left_bool} = icmp ne i32 {left_reg}, 0")
        self.llvm_code.append(f"  {right_bool} = icmp ne i32 {right_reg}, 0")
        
        # Operação lógica
        if op == '&&':
            result_bool = self._new_temp_reg()
            self.llvm_code.append(f"  {result_bool} = and i1 {left_bool}, {right_bool}")
        elif op == '||':
            result_bool = self._new_temp_reg()
            self.llvm_code.append(f"  {result_bool} = or i1 {left_bool}, {right_bool}")
        
        # Converter de volta para inteiro
        result_int = self._new_temp_reg()
        self.llvm_code.append(f"  {result_int} = zext i1 {result_bool} to i32")
        
        # Armazenar resultado
        self._ensure_variable_type(result, 'i32')
        result_var = self._get_variable(result)
        self.llvm_code.append(f"  store i32 {result_int}, i32* {result_var}")
    
    def _generate_print(self, arg1: str, arg2: str):
        """Gera código para impressão."""
        if self._is_string(arg1):
            # Imprimir string literal
            string_name = self._add_string_literal(arg1)
            string_len = len(self._escape_string(arg1))
            self.llvm_code.append(f"  call i32 @puts(i8* getelementptr inbounds ([{string_len} x i8], [{string_len} x i8]* @{string_name}, i64 0, i64 0))")
        elif self._is_integer(arg1):
            # Imprimir inteiro literal
            self.llvm_code.append(f"  call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @int_format_newline, i64 0, i64 0), i32 {arg1})")
        elif arg1 in self.variables:
            # Imprimir variável
            var_type = self.variables[arg1]['type']
            if var_type == 'i32':
                val_reg = self._load_variable(arg1, 'i32')
                self.llvm_code.append(f"  call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @int_format_newline, i64 0, i64 0), i32 {val_reg})")
            elif var_type == 'i8*':
                val_reg = self._load_variable(arg1, 'i8*')
                self.llvm_code.append(f"  call i32 @puts(i8* {val_reg})")
        else:
            # Assumir que é uma variável temporária inteira
            self.llvm_code.append(f"  call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @int_format_newline, i64 0, i64 0), i32 {self._get_value(arg1)})")
    
    def _generate_read(self, result: str):
        """Gera código para leitura de entrada."""
        self._ensure_variable_type(result, 'i32')
        result_var = self._get_variable(result)
        self.llvm_code.append(f"  call i32 (i8*, ...) @scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @scanf_int, i64 0, i64 0), i32* {result_var})")
    
    def _generate_label(self, label: str):
        """Gera um label."""
        # Se o último código não é uma instrução de terminação, adicione um branch para este label
        if self.llvm_code and not self._last_instruction_is_terminator():
            self.llvm_code.append(f"  br label %{label}")
        self.llvm_code.append(f"{label}:")

    def _last_instruction_is_terminator(self) -> bool:
        """Verifica se a última instrução é um terminador."""
        if not self.llvm_code:
            return False
        
        last_line = self.llvm_code[-1].strip()
        
        # Instruções de terminação do LLVM
        terminators = ['br ', 'ret ', 'switch ', 'invoke ', 'resume ', 'unreachable']
        
        # Verifica se é um terminador válido (mas NÃO se é um label)
        for term in terminators:
            if last_line.startswith(term):
                return True
        
        return False 

    def _generate_goto(self, label: str):
        """Gera um salto incondicional."""
        self.llvm_code.append(f"  br label %{label}")
    
    def _generate_if_false(self, condition: str, label: str):
        """Gera um salto condicional (se falso)."""
        # Carregar condição
        if condition in self.variables:
            cond_reg = self._load_variable(condition, 'i32')
        else:
            cond_reg = self._get_value(condition)
        
        # Converter para boolean
        bool_reg = self._new_temp_reg()
        self.llvm_code.append(f"  {bool_reg} = icmp eq i32 {cond_reg}, 0")
        
        # Salto condicional
        next_label = self._new_label()
        self.llvm_code.append(f"  br i1 {bool_reg}, label %{label}, label %{next_label}")
        self.llvm_code.append(f"{next_label}:")
    
    def _generate_if_true(self, condition: str, label: str):
        """Gera um salto condicional (se verdadeiro)."""
        # Carregar condição
        if condition in self.variables:
            cond_reg = self._load_variable(condition, 'i32')
        else:
            cond_reg = self._get_value(condition)
        
        # Converter para boolean
        bool_reg = self._new_temp_reg()
        self.llvm_code.append(f"  {bool_reg} = icmp ne i32 {cond_reg}, 0")
        
        # Salto condicional
        next_label = self._new_label()
        self.llvm_code.append(f"  br i1 {bool_reg}, label %{label}, label %{next_label}")
        self.llvm_code.append(f"{next_label}:")
    
    def _get_variable(self, name: str) -> str:
        """Obtém uma variável (deve já estar registrada)."""
        if name not in self.variables:
            # Se não foi registrada na pré-análise, registre agora (fallback)
            self._register_variable(name)
        
        return self.variables[name]['llvm_name']

    def _ensure_variable_type(self, name: str, var_type: str):
        """Garante que uma variável tenha o tipo correto (sem gerar alloca aqui)."""
        if name not in self.variables:
            self.variables[name] = {
                'type': var_type,
                'llvm_name': f"%{name}"
            }
        else:
            self.variables[name]['type'] = var_type
    
    def _load_variable(self, name: str, var_type: str) -> str:
        """Carrega o valor de uma variável."""
        reg = self._new_temp_reg()
        var_name = self.variables[name]['llvm_name']
        self.llvm_code.append(f"  {reg} = load {var_type}, {var_type}* {var_name}")
        return reg
    
    def _get_value(self, value: str) -> str:
        """Obtém o valor LLVM de uma expressão."""
        if self._is_integer(value):
            return value
        elif self._is_string(value):
            return value  
        elif value in self.variables:
            var_type = self.variables[value]['type']
            return self._load_variable(value, var_type)
        else:
            return f"%{value}"
    
    def _is_integer(self, value: str) -> bool:
        """Verifica se um valor é um inteiro."""
        try:
            int(value)
            return True
        except ValueError:
            return False
    
    def _is_string(self, value: str) -> bool:
        """Verifica se um valor é uma string."""
        return isinstance(value, str) and value.startswith('"') and value.endswith('"')
    
    def _new_temp_reg(self) -> str:
        """Gera um novo registrador temporário."""
        self.temp_counter += 1
        return f"%temp_{self.temp_counter}"
    
    def _new_label(self) -> str:
        """Gera um novo label."""
        self.label_counter += 1
        return f"label_{self.label_counter}"
    
    def save_to_file(self, filename: str = "output.ll") -> bool:
        """Salva o código LLVM IR em arquivo."""
        try:
            with open(filename, "w", encoding="utf-8") as f:
                f.write(self.generate())
            logging.info(f"Código LLVM IR salvo em {filename}")
            return True
        except Exception as e:
            logging.error(f"Erro ao salvar LLVM IR: {e}")
            return False