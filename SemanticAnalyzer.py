import logging
from colorama import init, Fore, Style
from generated.lensVisitor import lensVisitor
from generated.lensParser import lensParser

init(autoreset=True)  # Ativa cores no terminal automaticamente

class SemanticAnalyzer(lensVisitor):
    """
    Classe responsável pela análise semântica da linguagem Lens.
    Extende o visitor gerado pelo ANTLR para visitar os nós da árvore
    sintática e aplicar validações semânticas.
    """

    def __init__(self):
        self.scope_stack = [{}]  # Pilha de escopos (escopo atual é o último)
        self.errors_found = False

    def error(self, line, msg):
        """Registra um erro semântico, marca que houve erro e imprime em vermelho no terminal."""
        mensagem = f"[Erro Semântico] Linha {line}: {msg}"
        logging.error(mensagem)
        print(Fore.RED + mensagem)
        self.errors_found = True

    def log_action(self, msg):
        """Registra uma ação semântica bem-sucedida no log."""
        logging.info(f"[Semântico] {msg}")

    def declarar_var(self, var_name, tipo, line):
        """Declara uma variável no escopo atual, verificando duplicidade."""
        if var_name in self.scope_stack[-1]:
            self.error(line, f"Variável '{var_name}' já declarada neste escopo.")
        else:
            self.scope_stack[-1][var_name] = {
                "type": tipo,
                "line": line,
                "atribuida": False
            }
            self.log_action(f"Declarada variável '{var_name}' do tipo '{tipo}'.")

    def buscar_var(self, var_name, line):
        """Busca a variável nos escopos e retorna seu símbolo."""
        for escopo in reversed(self.scope_stack):
            if var_name in escopo:
                return escopo[var_name]
        self.error(line, f"Variável '{var_name}' usada sem declaração.")
        return None

    def visitDeclaracao(self, ctx: lensParser.DeclaracaoContext):
        # Tenta múltiplas formas de acessar VAR
        if hasattr(ctx, 'VAR') and ctx.VAR():
            var_name = ctx.VAR().getText()
        else:
            var_name = ctx.getToken(lensParser.VAR, 0).getText()
        
        # Tenta múltiplas formas de acessar tipo
        if hasattr(ctx, 'tipo') and ctx.tipo():
            var_type = ctx.tipo().getText()
        else:
            # Fallback: buscar token de tipo diretamente
            for tipo_token in [lensParser.INT_TYPE, lensParser.STRING_TYPE]:
                token = ctx.getToken(tipo_token, 0)
                if token:
                    var_type = token.getText()
                    break
        
        line = ctx.start.line
        self.declarar_var(var_name, var_type, line)

        if hasattr(ctx, 'expressao') and ctx.expressao():
            self.scope_stack[-1][var_name]["atribuida"] = True
            valor_tipo = self.visit(ctx.expressao())
            
            if ctx.expressao():
                valor_texto = ctx.expressao().getText()
                self.scope_stack[-1][var_name]["valor"] = valor_texto
            
            if valor_tipo and valor_tipo != "erro" and not self.comparar_tipos(var_type, valor_tipo):
                self.error(line, f"Atribuição incompatível: '{var_name}' é '{var_type}', mas recebeu '{valor_tipo}'.")
        return None

    def visitAtribuicao(self, ctx: lensParser.AtribuicaoContext):
        try:
            var_name = ctx.VAR().getText()
        except:
            self.error(ctx.start.line, "Nome de variável não encontrado na atribuição.")
            return None
            
        line = ctx.start.line
        simbolo = self.buscar_var(var_name, line)

        if simbolo:
            self.log_action(f"Atribuição para variável '{var_name}'.")
            simbolo["atribuida"] = True

            valor_tipo = self.visit(ctx.expressao())
            if valor_tipo and valor_tipo != "erro" and not self.comparar_tipos(simbolo["type"], valor_tipo):
                self.error(line, f"Atribuição incompatível: '{var_name}' é '{simbolo['type']}', mas recebeu '{valor_tipo}'.")
                
            if ctx.expressao():
                valor_texto = ctx.expressao().getText()
                if valor_texto.replace('-', '').isdigit():
                    simbolo["valor"] = valor_texto
        return None   

    def visitImpressao(self, ctx: lensParser.ImpressaoContext):
        for expressao in ctx.expressao():
            self.visit(expressao)
        return None

    def visitEntrada(self, ctx: lensParser.EntradaContext):
        var_name = ctx.VAR().getText()
        line = ctx.start.line
        
        # Verificar se a variável existe
        simbolo = self.buscar_var(var_name, line)
        
        if simbolo:
            simbolo["atribuida"] = True  
            self.log_action(f"Variável '{var_name}' recebeu valor via input().")
        
        return None

    def visitCondicional(self, ctx: lensParser.CondicionalContext):
        # Visitar if obrigatório
        if ctx.if_stmt():
            self.visit(ctx.if_stmt())
        
        # Visitar elseifs (pode ter zero ou mais)
        if hasattr(ctx, 'elseif_stmt'):
            elseifs = ctx.elseif_stmt()
            if elseifs:
                if isinstance(elseifs, list):
                    for elseif_stmt in elseifs:
                        self.visit(elseif_stmt)
                else:
                    self.visit(elseifs)
        
        # Visitar else opcional
        if ctx.else_stmt():
            self.visit(ctx.else_stmt())
        return None

    def visitIf_stmt(self, ctx: lensParser.If_stmtContext):
        self.scope_stack.append({})
        
        # Visitar condição
        if ctx.condicao():
            self.visit(ctx.condicao())
        
        # Visitar comandos
        if hasattr(ctx, 'comando'):
            comandos = ctx.comando()
            if comandos:
                if isinstance(comandos, list):
                    for comando in comandos:
                        self.visit(comando)
                else:
                    self.visit(comandos)
        
        self.scope_stack.pop()
        return None

    def visitElseif_stmt(self, ctx: lensParser.Elseif_stmtContext):
        self.scope_stack.append({})
        
        # Visitar condição
        if ctx.condicao():
            self.visit(ctx.condicao())
        
        # Visitar comandos
        if hasattr(ctx, 'comando'):
            comandos = ctx.comando()
            if comandos:
                if isinstance(comandos, list):
                    for comando in comandos:
                        self.visit(comando)
                else:
                    self.visit(comandos)
        
        self.scope_stack.pop()
        return None

    def visitElse_stmt(self, ctx: lensParser.Else_stmtContext):
        self.scope_stack.append({})
        
        # Visitar comandos
        if hasattr(ctx, 'comando'):
            comandos = ctx.comando()
            if comandos:
                if isinstance(comandos, list):
                    for comando in comandos:
                        self.visit(comando)
                else:
                    self.visit(comandos)
        
        self.scope_stack.pop()
        return None

    def visitLacofor(self, ctx: lensParser.LacoforContext):
        # Criar novo escopo para o for
        self.scope_stack.append({})
        
        if hasattr(ctx, 'VAR') and ctx.VAR():
            var_name = ctx.VAR().getText()
            line = ctx.start.line
            
            # Declarar variável de iteração como int (sempre é int nos ranges)
            self.scope_stack[-1][var_name] = {
                "type": "int",
                "line": line,
                "atribuida": True  # Já está atribuída pelo for
            }
            self.log_action(f"Variável de iteração '{var_name}' declarada automaticamente no for.")
        
        # Visitar as expressões do range (início..fim)
        if hasattr(ctx, 'expressao'):
            expressoes = ctx.expressao()
            if expressoes:
                for expr in expressoes:
                    self.visit(expr)
        
        # Visitar comandos dentro do for
        if hasattr(ctx, 'comando'):
            comandos = ctx.comando()
            if comandos:
                if isinstance(comandos, list):
                    for comando in comandos:
                        self.visit(comando)
                else:
                    self.visit(comandos)
        
        # Remover escopo do for
        self.scope_stack.pop()
        return None

    def visitLacowhile(self, ctx: lensParser.LacowhileContext):
        self.scope_stack.append({})
        # Visitar condição
        self.visit(ctx.condicao())
        # Visitar comandos
        for comando in ctx.comando():
            self.visit(comando)
        self.scope_stack.pop()
        return None

    # Métodos para expressões
    def visitExpressao(self, ctx: lensParser.ExpressaoContext):
        return self.visit(ctx.expressao_logica())

    def visitExpressao_logica(self, ctx: lensParser.Expressao_logicaContext):
        # Visitar primeira expressão
        tipo_primeiro = self.visit(ctx.expressao_comparacao(0))
        
        if len(ctx.expressao_comparacao()) > 1:
            # Há operações lógicas
            for i in range(1, len(ctx.expressao_comparacao())):
                tipo_expr = self.visit(ctx.expressao_comparacao(i))
                if tipo_primeiro != "int" or tipo_expr != "int":
                    self.error(ctx.start.line, f"Operação lógica requer inteiros (0 ou 1).")
                    return "erro"
            return "int"
        return tipo_primeiro

    def visitExpressao_comparacao(self, ctx: lensParser.Expressao_comparacaoContext):
        tipo_primeiro = self.visit(ctx.expressao_arit(0))
        
        if len(ctx.expressao_arit()) > 1:
            # Há comparação
            tipo_segundo = self.visit(ctx.expressao_arit(1))
            if tipo_primeiro != tipo_segundo:
                self.error(ctx.start.line, f"Comparação inválida entre tipos '{tipo_primeiro}' e '{tipo_segundo}'.")
                return "erro"
            return "int"
        return tipo_primeiro

    def visitExpressao_arit(self, ctx: lensParser.Expressao_aritContext):
        tipo_primeiro = self.visit(ctx.termo_arit(0))
        
        if len(ctx.termo_arit()) > 1:
            # Há operações aritméticas
            tipos = [tipo_primeiro]
            for i in range(1, len(ctx.termo_arit())):
                tipos.append(self.visit(ctx.termo_arit(i)))
            
            if "String" in tipos:
                # Se tem String, só permite + para concatenação
                if hasattr(ctx, 'op_adicao'):
                    for op in ctx.op_adicao():
                        if op.getText() != '+':
                            self.error(ctx.start.line, f"Operação '{op.getText()}' inválida com String. Use apenas '+'.")
                            return "erro"
                return "String"  # Resultado da concatenação é String
            
            return "int"
        return tipo_primeiro

    def visitTermo_arit(self, ctx: lensParser.Termo_aritContext):
        tipo_primeiro = self.visit(ctx.fator(0))
        
        if len(ctx.fator()) > 1:
            # Há operações de multiplicação/divisão
            tipos = [tipo_primeiro]
            for i in range(1, len(ctx.fator())):
                tipos.append(self.visit(ctx.fator(i)))
            
            # String não pode usar * ou /
            if "String" in tipos:
                self.error(ctx.start.line, f"Operação multiplicação/divisão inválida com String.")
                return "erro"
                
            return "int"
        return tipo_primeiro

    # Método auxiliar para buscar variável sem gerar erro
    def buscar_var_silencioso(self, var_name):
        """Busca variável sem gerar erro se não encontrar."""
        for escopo in reversed(self.scope_stack):
            if var_name in escopo:
                return escopo[var_name]
        return None

    def visitFator(self, ctx: lensParser.FatorContext):
        # Método alternativo - verificar texto diretamente
        texto = ctx.getText()
        
        # Verificar se é uma variável (não começa com aspas, não é número)
        if hasattr(ctx, 'VAR') and ctx.VAR():
            var_name = ctx.VAR().getText()
            simbolo = self.buscar_var(var_name, ctx.start.line)
            if simbolo:
                if not simbolo.get("atribuida", False):
                    self.error(ctx.start.line, f"Variável '{var_name}' usada antes de ser atribuída.")
                return simbolo["type"]
            return "indefinido"
        
        # Verificar se é string (começa e termina com aspas)
        elif texto.startswith('"') and texto.endswith('"'):
            return "String"
        
        # Verificar se é inteiro
        elif texto.replace('-', '').isdigit():
            return "int"
        
        # Verificar se é uma expressão entre parênteses
        elif hasattr(ctx, 'expressao') and ctx.expressao():
            return self.visit(ctx.expressao())
        
        # Tentar métodos alternativos do ANTLR
        elif hasattr(ctx, 'INT') and ctx.INT():
            return "int"
        elif hasattr(ctx, 'STRING') and ctx.STRING():
            return "String"
        
        print(f"DEBUG: Fator não reconhecido: '{texto}' - Tipo: {type(ctx)}")
        return "indefinido"
    
    def visitCondicao(self, ctx: lensParser.CondicaoContext):
        return self.visit(ctx.expressao_logica())

    def comparar_tipos(self, tipo_destino, tipo_origem):
        if tipo_destino == tipo_origem:
            return True
        return False

    def report(self):
        """Relatório final da análise semântica."""
        if not self.errors_found:
            logging.info("Análise semântica concluída sem erros.")
        else:
            logging.error(f"Análise semântica encontrou erros.")