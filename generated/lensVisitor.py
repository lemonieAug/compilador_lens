# Generated from lens.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .lensParser import lensParser
else:
    from lensParser import lensParser

# This class defines a complete generic visitor for a parse tree produced by lensParser.

class lensVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by lensParser#lens.
    def visitLens(self, ctx:lensParser.LensContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by lensParser#comando.
    def visitComando(self, ctx:lensParser.ComandoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by lensParser#impressao.
    def visitImpressao(self, ctx:lensParser.ImpressaoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by lensParser#entrada.
    def visitEntrada(self, ctx:lensParser.EntradaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by lensParser#condicional.
    def visitCondicional(self, ctx:lensParser.CondicionalContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by lensParser#if_stmt.
    def visitIf_stmt(self, ctx:lensParser.If_stmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by lensParser#elseif_stmt.
    def visitElseif_stmt(self, ctx:lensParser.Elseif_stmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by lensParser#else_stmt.
    def visitElse_stmt(self, ctx:lensParser.Else_stmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by lensParser#lacofor.
    def visitLacofor(self, ctx:lensParser.LacoforContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by lensParser#lacowhile.
    def visitLacowhile(self, ctx:lensParser.LacowhileContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by lensParser#expressao.
    def visitExpressao(self, ctx:lensParser.ExpressaoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by lensParser#expressao_logica.
    def visitExpressao_logica(self, ctx:lensParser.Expressao_logicaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by lensParser#expressao_comparacao.
    def visitExpressao_comparacao(self, ctx:lensParser.Expressao_comparacaoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by lensParser#expressao_arit.
    def visitExpressao_arit(self, ctx:lensParser.Expressao_aritContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by lensParser#termo_arit.
    def visitTermo_arit(self, ctx:lensParser.Termo_aritContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by lensParser#fator.
    def visitFator(self, ctx:lensParser.FatorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by lensParser#literal.
    def visitLiteral(self, ctx:lensParser.LiteralContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by lensParser#condicao.
    def visitCondicao(self, ctx:lensParser.CondicaoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by lensParser#op_adicao.
    def visitOp_adicao(self, ctx:lensParser.Op_adicaoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by lensParser#op_multiplicacao.
    def visitOp_multiplicacao(self, ctx:lensParser.Op_multiplicacaoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by lensParser#op_logico.
    def visitOp_logico(self, ctx:lensParser.Op_logicoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by lensParser#op_comparacao.
    def visitOp_comparacao(self, ctx:lensParser.Op_comparacaoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by lensParser#declaracao.
    def visitDeclaracao(self, ctx:lensParser.DeclaracaoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by lensParser#tipo.
    def visitTipo(self, ctx:lensParser.TipoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by lensParser#atribuicao.
    def visitAtribuicao(self, ctx:lensParser.AtribuicaoContext):
        return self.visitChildren(ctx)



del lensParser