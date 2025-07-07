# Generated from lens.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .lensParser import lensParser
else:
    from lensParser import lensParser

# This class defines a complete listener for a parse tree produced by lensParser.
class lensListener(ParseTreeListener):

    # Enter a parse tree produced by lensParser#lens.
    def enterLens(self, ctx:lensParser.LensContext):
        pass

    # Exit a parse tree produced by lensParser#lens.
    def exitLens(self, ctx:lensParser.LensContext):
        pass


    # Enter a parse tree produced by lensParser#comando.
    def enterComando(self, ctx:lensParser.ComandoContext):
        pass

    # Exit a parse tree produced by lensParser#comando.
    def exitComando(self, ctx:lensParser.ComandoContext):
        pass


    # Enter a parse tree produced by lensParser#impressao.
    def enterImpressao(self, ctx:lensParser.ImpressaoContext):
        pass

    # Exit a parse tree produced by lensParser#impressao.
    def exitImpressao(self, ctx:lensParser.ImpressaoContext):
        pass


    # Enter a parse tree produced by lensParser#entrada.
    def enterEntrada(self, ctx:lensParser.EntradaContext):
        pass

    # Exit a parse tree produced by lensParser#entrada.
    def exitEntrada(self, ctx:lensParser.EntradaContext):
        pass


    # Enter a parse tree produced by lensParser#condicional.
    def enterCondicional(self, ctx:lensParser.CondicionalContext):
        pass

    # Exit a parse tree produced by lensParser#condicional.
    def exitCondicional(self, ctx:lensParser.CondicionalContext):
        pass


    # Enter a parse tree produced by lensParser#if_stmt.
    def enterIf_stmt(self, ctx:lensParser.If_stmtContext):
        pass

    # Exit a parse tree produced by lensParser#if_stmt.
    def exitIf_stmt(self, ctx:lensParser.If_stmtContext):
        pass


    # Enter a parse tree produced by lensParser#elseif_stmt.
    def enterElseif_stmt(self, ctx:lensParser.Elseif_stmtContext):
        pass

    # Exit a parse tree produced by lensParser#elseif_stmt.
    def exitElseif_stmt(self, ctx:lensParser.Elseif_stmtContext):
        pass


    # Enter a parse tree produced by lensParser#else_stmt.
    def enterElse_stmt(self, ctx:lensParser.Else_stmtContext):
        pass

    # Exit a parse tree produced by lensParser#else_stmt.
    def exitElse_stmt(self, ctx:lensParser.Else_stmtContext):
        pass


    # Enter a parse tree produced by lensParser#lacofor.
    def enterLacofor(self, ctx:lensParser.LacoforContext):
        pass

    # Exit a parse tree produced by lensParser#lacofor.
    def exitLacofor(self, ctx:lensParser.LacoforContext):
        pass


    # Enter a parse tree produced by lensParser#lacowhile.
    def enterLacowhile(self, ctx:lensParser.LacowhileContext):
        pass

    # Exit a parse tree produced by lensParser#lacowhile.
    def exitLacowhile(self, ctx:lensParser.LacowhileContext):
        pass


    # Enter a parse tree produced by lensParser#expressao.
    def enterExpressao(self, ctx:lensParser.ExpressaoContext):
        pass

    # Exit a parse tree produced by lensParser#expressao.
    def exitExpressao(self, ctx:lensParser.ExpressaoContext):
        pass


    # Enter a parse tree produced by lensParser#expressao_logica.
    def enterExpressao_logica(self, ctx:lensParser.Expressao_logicaContext):
        pass

    # Exit a parse tree produced by lensParser#expressao_logica.
    def exitExpressao_logica(self, ctx:lensParser.Expressao_logicaContext):
        pass


    # Enter a parse tree produced by lensParser#expressao_comparacao.
    def enterExpressao_comparacao(self, ctx:lensParser.Expressao_comparacaoContext):
        pass

    # Exit a parse tree produced by lensParser#expressao_comparacao.
    def exitExpressao_comparacao(self, ctx:lensParser.Expressao_comparacaoContext):
        pass


    # Enter a parse tree produced by lensParser#expressao_arit.
    def enterExpressao_arit(self, ctx:lensParser.Expressao_aritContext):
        pass

    # Exit a parse tree produced by lensParser#expressao_arit.
    def exitExpressao_arit(self, ctx:lensParser.Expressao_aritContext):
        pass


    # Enter a parse tree produced by lensParser#termo_arit.
    def enterTermo_arit(self, ctx:lensParser.Termo_aritContext):
        pass

    # Exit a parse tree produced by lensParser#termo_arit.
    def exitTermo_arit(self, ctx:lensParser.Termo_aritContext):
        pass


    # Enter a parse tree produced by lensParser#fator.
    def enterFator(self, ctx:lensParser.FatorContext):
        pass

    # Exit a parse tree produced by lensParser#fator.
    def exitFator(self, ctx:lensParser.FatorContext):
        pass


    # Enter a parse tree produced by lensParser#literal.
    def enterLiteral(self, ctx:lensParser.LiteralContext):
        pass

    # Exit a parse tree produced by lensParser#literal.
    def exitLiteral(self, ctx:lensParser.LiteralContext):
        pass


    # Enter a parse tree produced by lensParser#condicao.
    def enterCondicao(self, ctx:lensParser.CondicaoContext):
        pass

    # Exit a parse tree produced by lensParser#condicao.
    def exitCondicao(self, ctx:lensParser.CondicaoContext):
        pass


    # Enter a parse tree produced by lensParser#op_adicao.
    def enterOp_adicao(self, ctx:lensParser.Op_adicaoContext):
        pass

    # Exit a parse tree produced by lensParser#op_adicao.
    def exitOp_adicao(self, ctx:lensParser.Op_adicaoContext):
        pass


    # Enter a parse tree produced by lensParser#op_multiplicacao.
    def enterOp_multiplicacao(self, ctx:lensParser.Op_multiplicacaoContext):
        pass

    # Exit a parse tree produced by lensParser#op_multiplicacao.
    def exitOp_multiplicacao(self, ctx:lensParser.Op_multiplicacaoContext):
        pass


    # Enter a parse tree produced by lensParser#op_logico.
    def enterOp_logico(self, ctx:lensParser.Op_logicoContext):
        pass

    # Exit a parse tree produced by lensParser#op_logico.
    def exitOp_logico(self, ctx:lensParser.Op_logicoContext):
        pass


    # Enter a parse tree produced by lensParser#op_comparacao.
    def enterOp_comparacao(self, ctx:lensParser.Op_comparacaoContext):
        pass

    # Exit a parse tree produced by lensParser#op_comparacao.
    def exitOp_comparacao(self, ctx:lensParser.Op_comparacaoContext):
        pass


    # Enter a parse tree produced by lensParser#declaracao.
    def enterDeclaracao(self, ctx:lensParser.DeclaracaoContext):
        pass

    # Exit a parse tree produced by lensParser#declaracao.
    def exitDeclaracao(self, ctx:lensParser.DeclaracaoContext):
        pass


    # Enter a parse tree produced by lensParser#tipo.
    def enterTipo(self, ctx:lensParser.TipoContext):
        pass

    # Exit a parse tree produced by lensParser#tipo.
    def exitTipo(self, ctx:lensParser.TipoContext):
        pass


    # Enter a parse tree produced by lensParser#atribuicao.
    def enterAtribuicao(self, ctx:lensParser.AtribuicaoContext):
        pass

    # Exit a parse tree produced by lensParser#atribuicao.
    def exitAtribuicao(self, ctx:lensParser.AtribuicaoContext):
        pass



del lensParser