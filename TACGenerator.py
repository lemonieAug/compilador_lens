import logging
from generated.lensVisitor import lensVisitor
from generated.lensParser import lensParser

class TACGenerator(lensVisitor):
    """
    Gerador de Código Intermediário TAC (Three-Address Code)
    para a linguagem Lens.
    """
    
    def __init__(self):
        self.instructions = []      # Lista de instruções TAC
        self.temp_counter = 0       # Contador de temporárias (t1, t2, t3...)
        self.label_counter = 0      # Contador de labels (L1, L2, L3...)
        
    def new_temp(self):
        """Gera uma nova variável temporária."""
        self.temp_counter += 1
        return f"t{self.temp_counter}"
    
    def new_label(self):
        """Gera um novo label."""
        self.label_counter += 1
        return f"L{self.label_counter}"
    
    def emit(self, op, arg1=None, arg2=None, result=None):
        """Emite uma instrução TAC."""
        instruction = {
            'op': op,
            'arg1': arg1,
            'arg2': arg2,
            'result': result
        }
        self.instructions.append(instruction)
        logging.info(f"TAC: {self.format_instruction(instruction)}")
        return instruction
    
    def format_instruction(self, instr):
        """Formata uma instrução TAC para exibição."""
        op = instr['op']
        arg1 = instr['arg1']
        arg2 = instr['arg2']
        result = instr['result']
        
        if op == 'ASSIGN':
            return f"{result} = {arg1}"
        elif op in ['+', '-', '*', '/', '%']:
            return f"{result} = {arg1} {op} {arg2}"
        elif op in ['==', '!=', '<', '<=', '>', '>=']:
            return f"{result} = {arg1} {op} {arg2}"
        elif op in ['&&', '||']:
            return f"{result} = {arg1} {op} {arg2}"
        elif op == 'PRINT':
            if arg2:
                return f"print {arg1}, {arg2}"
            return f"print {arg1}"
        elif op == 'read':
            return f"read {result}"
        elif op == 'LABEL':
            return f"{result}:"
        elif op == 'GOTO':
            return f"goto {result}"
        elif op == 'IF_FALSE':
            return f"if_false {arg1} goto {result}"
        elif op == 'IF_TRUE':
            return f"if_true {arg1} goto {result}"
        else:
            return f"{op} {arg1} {arg2} {result}"
    
    def get_tac_code(self):
        """Retorna o código TAC formatado para exibição."""
        lines = []
        for i, instr in enumerate(self.instructions):
            lines.append(f"{i+1:3d}: {self.format_instruction(instr)}")
        return "\n".join(lines)
    
    def save_to_file(self, filename="output.tac"):
        """Salva o código TAC em arquivo."""
        try:
            with open(filename, "w", encoding="utf-8") as f:
                f.write("// Código Intermediário TAC - Linguagem Lens\n")
                f.write("// Gerado automaticamente pelo compilador\n\n")
                for instr in self.instructions:
                    f.write(self.format_instruction(instr) + "\n")
            return True
        except Exception as e:
            logging.error(f"Erro ao salvar TAC: {e}")
            return False

    def visitLens(self, ctx: lensParser.LensContext):
        """Ponto de entrada principal."""
        
        # Visitar todos os comandos
        for comando in ctx.comando():
            self.visit(comando)
        
        return None

    def visitDeclaracao(self, ctx: lensParser.DeclaracaoContext):
        """Gera TAC para declaração de variável."""
        var_name = ctx.VAR().getText()
        
        # Se há inicialização
        if hasattr(ctx, 'expressao') and ctx.expressao():
            expr_result = self.visit(ctx.expressao())
            self.emit('ASSIGN', expr_result, None, var_name)
        
        return var_name

    def visitAtribuicao(self, ctx: lensParser.AtribuicaoContext):
        """Gera TAC para atribuição simples e composta."""
        var_name = ctx.VAR().getText()
        children_count = ctx.getChildCount()
        
        if children_count == 3:
            expr_result = self.visit(ctx.expressao())
            self.emit('ASSIGN', expr_result, None, var_name)
            
        elif children_count == 4:           
            # Identificar o operador composto
            op_compound = None
            for child in ctx.children:
                child_text = child.getText()
                if child_text in ['+', '-', '*', '/']:
                    op_compound = child_text
                    break
            
            if op_compound:
                expr_result = self.visit(ctx.expressao())
                temp = self.new_temp()
                
                # temp = var op expr
                self.emit(op_compound, var_name, expr_result, temp)
                # var = temp
                self.emit('ASSIGN', temp, None, var_name)
                
            else:
                # Fallback para atribuição simples
                expr_result = self.visit(ctx.expressao())
                self.emit('ASSIGN', expr_result, None, var_name)
        else:
            # Fallback: assumir atribuição simples
            expr_result = self.visit(ctx.expressao())
            self.emit('ASSIGN', expr_result, None, var_name)
        
        return var_name

    def visitImpressao(self, ctx: lensParser.ImpressaoContext):
        """Gera TAC para comando print."""
        if hasattr(ctx, 'expressao') and ctx.expressao():
            expressions = ctx.expressao()
            
            if isinstance(expressions, list):
                if len(expressions) == 1:
                    # print :: expressao
                    expr_result = self.visit(expressions[0])
                    self.emit('PRINT', expr_result, None, None)
                elif len(expressions) >= 2:
                    # print :: expr1, expr2, ...
                    for i, expr in enumerate(expressions):
                        expr_result = self.visit(expr)
                        if i == 0:
                            # Primeira expressão
                            self.emit('PRINT', expr_result, None, None)
                        else:
                            # Expressões subsequentes (separadas por vírgula)
                            self.emit('PRINT', expr_result, None, None)
            else:
                # Objeto único
                expr_result = self.visit(expressions)
                self.emit('PRINT', expr_result, None, None)
        
        return None

    def visitEntrada(self, ctx: lensParser.EntradaContext):
        """Gera TAC para comando input."""
        var_name = ctx.VAR().getText()
        self.emit('read', None, None, var_name)
        return var_name

    def visitExpressao_arit(self, ctx: lensParser.Expressao_aritContext):
        """Gera TAC para expressões aritméticas (+, -)."""
        result = self.visit(ctx.termo_arit(0))
        
        for i in range(1, len(ctx.termo_arit())):
            op = ctx.op_adicao(i-1).getText()  # +, -
            right = self.visit(ctx.termo_arit(i))
            temp = self.new_temp()
            
            self.emit(op, result, right, temp)
            result = temp
        
        return result

    def visitTermo_arit(self, ctx: lensParser.Termo_aritContext):
        """Gera TAC para termos aritméticos (*, /, %)."""
        result = self.visit(ctx.fator(0))
        
        for i in range(1, len(ctx.fator())):
            op = ctx.op_multiplicacao(i-1).getText()  # *, /, %
            right = self.visit(ctx.fator(i))
            temp = self.new_temp()
            
            self.emit(op, result, right, temp)
            result = temp
        
        return result

    def visitFator(self, ctx: lensParser.FatorContext):
        """Gera TAC para fatores."""
        texto = ctx.getText()
        
        # Variável
        if hasattr(ctx, 'VAR') and ctx.VAR():
            return ctx.VAR().getText()
        
        # Literais diretos
        elif hasattr(ctx, 'INT') and ctx.INT():
            return ctx.INT().getText()
        elif hasattr(ctx, 'FLOAT') and ctx.FLOAT():
            return ctx.FLOAT().getText()
        elif hasattr(ctx, 'STRING') and ctx.STRING():
            return ctx.STRING().getText()
        elif hasattr(ctx, 'BOOL') and ctx.BOOL():
            return ctx.BOOL().getText()
        
        # Expressão entre parênteses
        elif hasattr(ctx, 'expressao') and ctx.expressao():
            return self.visit(ctx.expressao())
        
        # Fallback: analisar pelo texto
        elif texto.startswith('"') and texto.endswith('"'):
            return texto
        elif texto in ["True", "False"]:
            return texto
        elif '.' in texto and texto.replace('.', '').replace('-', '').isdigit():
            return texto
        elif texto.replace('-', '').isdigit():
            return texto
        
        return texto

    def visitExpressao_logica(self, ctx: lensParser.Expressao_logicaContext):
        """Gera TAC para expressões lógicas (&&, ||)."""
        result = self.visit(ctx.expressao_comparacao(0))
        
        for i in range(1, len(ctx.expressao_comparacao())):
            op = ctx.op_logico(i-1).getText()  # &&, ||
            right = self.visit(ctx.expressao_comparacao(i))
            temp = self.new_temp()
            
            self.emit(op, result, right, temp)
            result = temp
        
        return result

    def visitExpressao_comparacao(self, ctx: lensParser.Expressao_comparacaoContext):
        """Gera TAC para comparações."""
        result = self.visit(ctx.expressao_arit(0))
        
        if len(ctx.expressao_arit()) > 1:
            op = ctx.op_comparacao().getText()  # <, >, ==, !=, <=, >=
            right = self.visit(ctx.expressao_arit(1))
            temp = self.new_temp()
            
            self.emit(op, result, right, temp)
            result = temp
        
        return result

    def visitExpressao(self, ctx: lensParser.ExpressaoContext):
        """Gera TAC para expressão geral."""
        return self.visit(ctx.expressao_logica())

    def visitCondicao(self, ctx: lensParser.CondicaoContext):
        """Gera TAC para condição."""
        return self.visit(ctx.expressao_logica())
    
    def visitCondicional(self, ctx: lensParser.CondicionalContext):
        """Gera TAC para estruturas condicionais."""
        end_label = self.new_label()
        
        if ctx.if_stmt():
            self.visit_if_statement(ctx.if_stmt(), end_label)
        
        if hasattr(ctx, 'elseif_stmt') and ctx.elseif_stmt():
            elseifs = ctx.elseif_stmt()
            if isinstance(elseifs, list):
                for elseif_stmt in elseifs:
                    self.visit_elseif_statement(elseif_stmt, end_label)
            else:
                self.visit_elseif_statement(elseifs, end_label)
        
        if ctx.else_stmt():
            self.visit_else_statement(ctx.else_stmt())
        
        self.emit('LABEL', None, None, end_label)
        return None

    def visit_if_statement(self, ctx, end_label):
        """Processa statement IF."""
        else_label = self.new_label()
        
        # Avaliar condição
        condition = self.visit(ctx.condicao())
        self.emit('IF_FALSE', condition, None, else_label)
        
        if hasattr(ctx, 'comando') and ctx.comando():
            comandos = ctx.comando()
            if isinstance(comandos, list):
                for comando in comandos:
                    self.visit(comando)
            else:
                self.visit(comandos)
        
        self.emit('GOTO', None, None, end_label)
        self.emit('LABEL', None, None, else_label)

    def visit_elseif_statement(self, ctx, end_label):
        """Processa statement ELSEIF."""
        else_label = self.new_label()
        
        # Avaliar condição
        condition = self.visit(ctx.condicao())
        self.emit('IF_FALSE', condition, None, else_label)
        
        if hasattr(ctx, 'comando') and ctx.comando():
            comandos = ctx.comando()
            if isinstance(comandos, list):
                for comando in comandos:
                    self.visit(comando)
            else:
                self.visit(comandos)
        
        self.emit('GOTO', None, None, end_label)
        self.emit('LABEL', None, None, else_label)

    def visit_else_statement(self, ctx):
        """Processa statement ELSE."""
        if hasattr(ctx, 'comando') and ctx.comando():
            comandos = ctx.comando()
            if isinstance(comandos, list):
                for comando in comandos:
                    self.visit(comando)
            else:
                self.visit(comandos)

    def visitLacowhile(self, ctx: lensParser.LacowhileContext):
        """Gera TAC para laço while (versão corrigida)."""
        start_label = self.new_label()
        end_label = self.new_label()
        
        self.emit('LABEL', None, None, start_label)
        
        # Avaliar condição
        condition = self.visit(ctx.condicao())
        self.emit('IF_FALSE', condition, None, end_label)
        
        if hasattr(ctx, 'comando') and ctx.comando():
            comandos = ctx.comando()
            if isinstance(comandos, list):
                for comando in comandos:
                    self.visit(comando)
            else:
                self.visit(comandos)
        
        self.emit('GOTO', None, None, start_label)
        self.emit('LABEL', None, None, end_label)
        
        return None

    def visitLacofor(self, ctx: lensParser.LacoforContext):
        """Gera TAC para laço for do zero - baseado na gramática."""

        start_label = self.new_label()  # Label para início do loop
        end_label = self.new_label()    # Label para fim do loop
        
        # Extrair nome da variável de controle
        var_name = ctx.VAR().getText()
               
        # Primeira expressão (início do range)
        start_expr_ctx = ctx.expressao_arit(0)  
        start_expr = self.visit(start_expr_ctx)
        
        # Segunda expressão (fim do range) 
        end_expr_ctx = ctx.expressao_arit(1)    
        end_expr = self.visit(end_expr_ctx)
   
        is_decreasing = False
        
        # Tentar determinar se é progressivo ou regressivo
        try:
            # Se ambas são literais numéricas, comparar
            start_text = start_expr_ctx.getText()
            end_text = end_expr_ctx.getText()
            
            if (start_text.replace('-', '').isdigit() and 
                end_text.replace('-', '').isdigit()):
                start_val = int(start_text)
                end_val = int(end_text)
                is_decreasing = start_val > end_val
                
        except:
            # Se não conseguir determinar, assumir progressivo
            is_decreasing = False
     
        # Inicializar variável de controle: var = start_expr
        self.emit('ASSIGN', start_expr, None, var_name)

        # Label para início do loop
        self.emit('LABEL', None, None, start_label)

        # Gerar condição baseada na direção
        temp_cond = self.new_temp()
        
        if is_decreasing:
            # For regressivo: continuar enquanto var >= end_expr
            self.emit('>=', var_name, end_expr, temp_cond)
        else:
            # For progressivo: continuar enquanto var <= end_expr
            self.emit('<=', var_name, end_expr, temp_cond)
        
        # Se condição for falsa, sair do loop
        self.emit('IF_FALSE', temp_cond, None, end_label)

        if hasattr(ctx, 'comando') and ctx.comando():
            comandos = ctx.comando()
            
            if isinstance(comandos, list):
                for comando in comandos:
                    self.visit(comando)
            else:
                self.visit(comandos)

        # Atualizar variável de controle
        temp_inc = self.new_temp()
        
        if is_decreasing:
            # Decrementar: var = var - 1
            self.emit('-', var_name, '1', temp_inc)
        else:
            # Incrementar: var = var + 1
            self.emit('+', var_name, '1', temp_inc)
        
        # Atribuir novo valor à variável
        self.emit('ASSIGN', temp_inc, None, var_name)
        
        # Voltar para o início do loop
        self.emit('GOTO', None, None, start_label)
        
        # Label para fim do loop
        self.emit('LABEL', None, None, end_label)
        
        
        return None