import logging
from antlr4.error.ErrorListener import ErrorListener
from colorama import Fore, Style, init

init(autoreset=True)

class CustomErrorListener(ErrorListener):
    def __init__(self):
        super(CustomErrorListener, self).__init__()
        self.tem_erro = False
        self.erros_lexicos = []
        self.erros_sintaticos = []

    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        self.tem_erro = True
        
        if ("token recognition error" in msg or 
            "extraneous input" in msg or
            "mismatched input" in msg):
            self._handle_lexical_error(offendingSymbol, line, column, msg)
        else:
            self._handle_syntax_error(recognizer, offendingSymbol, line, column, msg, e)

    def _handle_lexical_error(self, offendingSymbol, line, column, msg):
        """Trata erros léxicos com mais precisão."""
        if offendingSymbol:
            simbolo = offendingSymbol.text
        else:
            # Extrair símbolo da mensagem
            if "'" in msg:
                simbolo = msg.split("'")[1]
            else:
                simbolo = "desconhecido"
        
        mensagem = f"ERRO LÉXICO [Linha {line}, Coluna {column}]: Símbolo '{simbolo}' inválido."
        self.erros_lexicos.append((line, column, simbolo))
        
        print(Fore.RED + mensagem)
        logging.error(mensagem)

    def _handle_syntax_error(self, recognizer, offendingSymbol, line, column, msg, e):
        """Trata erros sintáticos com mensagens mais claras."""
        encontrado = offendingSymbol.text if offendingSymbol else "EOF"
        esperado = "elemento válido"

        if hasattr(e, "getExpectedTokens") and e.getExpectedTokens():
            expected_tokens = []
            expected = list(e.getExpectedTokens())
            
            if hasattr(recognizer, "literalNames"):
                for token_type in expected:
                    if (token_type < len(recognizer.literalNames) and 
                        recognizer.literalNames[token_type]):
                        token_name = recognizer.literalNames[token_type].strip("'")
                        expected_tokens.append(token_name)
                    elif (hasattr(recognizer, "symbolicNames") and
                          token_type < len(recognizer.symbolicNames) and
                          recognizer.symbolicNames[token_type]):
                        expected_tokens.append(recognizer.symbolicNames[token_type])
            
            if expected_tokens:
                esperado = "', '".join(expected_tokens[:3])  
                if len(expected_tokens) > 3:
                    esperado += "', ou outros"

        mensagem = f"ERRO SINTÁTICO [Linha {line}, Coluna {column}]: Esperado '{esperado}', encontrado '{encontrado}'."
        self.erros_sintaticos.append((line, column, encontrado, esperado))
        
        print(Fore.RED + mensagem)
        logging.error(mensagem)

    def get_error_summary(self):
        """Retorna resumo dos erros encontrados."""
        return {
            "total": len(self.erros_lexicos) + len(self.erros_sintaticos),
            "lexicos": len(self.erros_lexicos),
            "sintaticos": len(self.erros_sintaticos),
            "detalhes_lexicos": self.erros_lexicos,
            "detalhes_sintaticos": self.erros_sintaticos
        }

    def reset(self):
        """Reseta o estado do listener."""
        self.tem_erro = False
        self.erros_lexicos.clear()
        self.erros_sintaticos.clear()