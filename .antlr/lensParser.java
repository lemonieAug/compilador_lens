// Generated from c:/Users/augus/compilador_lens/lens.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class lensParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		START=1, END=2, LET=3, PRINT=4, INPUT=5, IF=6, ELSEIF=7, ELSE=8, FOR=9, 
		WHILE=10, IN=11, INT_TYPE=12, STRING_TYPE=13, DUPONT=14, POINT2=15, DOT2=16, 
		VIRG=17, EQUALS=18, P_N=19, P_I=20, C_N=21, C_I=22, MUL=23, DIV=24, ADD=25, 
		SUB=26, EQ=27, NEQ=28, LT=29, GT=30, LTE=31, GTE=32, AND=33, OR=34, STRING=35, 
		INT=36, VAR=37, COMENTARIO=38, WS=39;
	public static final int
		RULE_lens = 0, RULE_comando = 1, RULE_impressao = 2, RULE_entrada = 3, 
		RULE_condicional = 4, RULE_if_stmt = 5, RULE_elseif_stmt = 6, RULE_else_stmt = 7, 
		RULE_lacofor = 8, RULE_lacowhile = 9, RULE_expressao = 10, RULE_expressao_logica = 11, 
		RULE_expressao_comparacao = 12, RULE_expressao_arit = 13, RULE_termo_arit = 14, 
		RULE_fator = 15, RULE_literal = 16, RULE_condicao = 17, RULE_op_adicao = 18, 
		RULE_op_multiplicacao = 19, RULE_op_logico = 20, RULE_op_comparacao = 21, 
		RULE_declaracao = 22, RULE_tipo = 23, RULE_atribuicao = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"lens", "comando", "impressao", "entrada", "condicional", "if_stmt", 
			"elseif_stmt", "else_stmt", "lacofor", "lacowhile", "expressao", "expressao_logica", 
			"expressao_comparacao", "expressao_arit", "termo_arit", "fator", "literal", 
			"condicao", "op_adicao", "op_multiplicacao", "op_logico", "op_comparacao", 
			"declaracao", "tipo", "atribuicao"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'@start'", "'@end'", "'let'", "'print'", "'input'", "'if'", "'elseif'", 
			"'else'", "'for'", "'while'", "'in'", "'int'", "'String'", "'::'", "':'", 
			"'..'", "','", "'='", "'('", "')'", "'{'", "'}'", "'*'", "'/'", "'+'", 
			"'-'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "START", "END", "LET", "PRINT", "INPUT", "IF", "ELSEIF", "ELSE", 
			"FOR", "WHILE", "IN", "INT_TYPE", "STRING_TYPE", "DUPONT", "POINT2", 
			"DOT2", "VIRG", "EQUALS", "P_N", "P_I", "C_N", "C_I", "MUL", "DIV", "ADD", 
			"SUB", "EQ", "NEQ", "LT", "GT", "LTE", "GTE", "AND", "OR", "STRING", 
			"INT", "VAR", "COMENTARIO", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "lens.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public lensParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LensContext extends ParserRuleContext {
		public TerminalNode START() { return getToken(lensParser.START, 0); }
		public TerminalNode END() { return getToken(lensParser.END, 0); }
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public LensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lens; }
	}

	public final LensContext lens() throws RecognitionException {
		LensContext _localctx = new LensContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_lens);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(START);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 137438955128L) != 0)) {
				{
				{
				setState(51);
				comando();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComandoContext extends ParserRuleContext {
		public DeclaracaoContext declaracao() {
			return getRuleContext(DeclaracaoContext.class,0);
		}
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public ImpressaoContext impressao() {
			return getRuleContext(ImpressaoContext.class,0);
		}
		public EntradaContext entrada() {
			return getRuleContext(EntradaContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public LacoforContext lacofor() {
			return getRuleContext(LacoforContext.class,0);
		}
		public LacowhileContext lacowhile() {
			return getRuleContext(LacowhileContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_comando);
		try {
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LET:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				declaracao();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				atribuicao();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				impressao();
				}
				break;
			case INPUT:
				enterOuterAlt(_localctx, 4);
				{
				setState(62);
				entrada();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 5);
				{
				setState(63);
				condicional();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 6);
				{
				setState(64);
				lacofor();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 7);
				{
				setState(65);
				lacowhile();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImpressaoContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(lensParser.PRINT, 0); }
		public TerminalNode DUPONT() { return getToken(lensParser.DUPONT, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<TerminalNode> VIRG() { return getTokens(lensParser.VIRG); }
		public TerminalNode VIRG(int i) {
			return getToken(lensParser.VIRG, i);
		}
		public ImpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impressao; }
	}

	public final ImpressaoContext impressao() throws RecognitionException {
		ImpressaoContext _localctx = new ImpressaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_impressao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(PRINT);
			setState(69);
			match(DUPONT);
			setState(70);
			expressao();
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRG) {
				{
				{
				setState(71);
				match(VIRG);
				setState(72);
				expressao();
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EntradaContext extends ParserRuleContext {
		public TerminalNode INPUT() { return getToken(lensParser.INPUT, 0); }
		public TerminalNode P_N() { return getToken(lensParser.P_N, 0); }
		public TerminalNode VAR() { return getToken(lensParser.VAR, 0); }
		public TerminalNode P_I() { return getToken(lensParser.P_I, 0); }
		public EntradaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entrada; }
	}

	public final EntradaContext entrada() throws RecognitionException {
		EntradaContext _localctx = new EntradaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_entrada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(INPUT);
			setState(79);
			match(P_N);
			setState(80);
			match(VAR);
			setState(81);
			match(P_I);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionalContext extends ParserRuleContext {
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public List<Elseif_stmtContext> elseif_stmt() {
			return getRuleContexts(Elseif_stmtContext.class);
		}
		public Elseif_stmtContext elseif_stmt(int i) {
			return getRuleContext(Elseif_stmtContext.class,i);
		}
		public Else_stmtContext else_stmt() {
			return getRuleContext(Else_stmtContext.class,0);
		}
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			if_stmt();
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(84);
				elseif_stmt();
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(90);
				else_stmt();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_stmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(lensParser.IF, 0); }
		public TerminalNode P_N() { return getToken(lensParser.P_N, 0); }
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public TerminalNode P_I() { return getToken(lensParser.P_I, 0); }
		public TerminalNode C_N() { return getToken(lensParser.C_N, 0); }
		public TerminalNode C_I() { return getToken(lensParser.C_I, 0); }
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_if_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(IF);
			setState(94);
			match(P_N);
			setState(95);
			condicao();
			setState(96);
			match(P_I);
			setState(97);
			match(C_N);
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 137438955128L) != 0)) {
				{
				{
				setState(98);
				comando();
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
			match(C_I);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Elseif_stmtContext extends ParserRuleContext {
		public TerminalNode ELSEIF() { return getToken(lensParser.ELSEIF, 0); }
		public TerminalNode P_N() { return getToken(lensParser.P_N, 0); }
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public TerminalNode P_I() { return getToken(lensParser.P_I, 0); }
		public TerminalNode C_N() { return getToken(lensParser.C_N, 0); }
		public TerminalNode C_I() { return getToken(lensParser.C_I, 0); }
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public Elseif_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseif_stmt; }
	}

	public final Elseif_stmtContext elseif_stmt() throws RecognitionException {
		Elseif_stmtContext _localctx = new Elseif_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_elseif_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(ELSEIF);
			setState(107);
			match(P_N);
			setState(108);
			condicao();
			setState(109);
			match(P_I);
			setState(110);
			match(C_N);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 137438955128L) != 0)) {
				{
				{
				setState(111);
				comando();
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
			match(C_I);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Else_stmtContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(lensParser.ELSE, 0); }
		public TerminalNode C_N() { return getToken(lensParser.C_N, 0); }
		public TerminalNode C_I() { return getToken(lensParser.C_I, 0); }
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public Else_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_stmt; }
	}

	public final Else_stmtContext else_stmt() throws RecognitionException {
		Else_stmtContext _localctx = new Else_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_else_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(ELSE);
			setState(120);
			match(C_N);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 137438955128L) != 0)) {
				{
				{
				setState(121);
				comando();
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(127);
			match(C_I);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LacoforContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(lensParser.FOR, 0); }
		public TerminalNode VAR() { return getToken(lensParser.VAR, 0); }
		public TerminalNode IN() { return getToken(lensParser.IN, 0); }
		public List<Expressao_aritContext> expressao_arit() {
			return getRuleContexts(Expressao_aritContext.class);
		}
		public Expressao_aritContext expressao_arit(int i) {
			return getRuleContext(Expressao_aritContext.class,i);
		}
		public TerminalNode DOT2() { return getToken(lensParser.DOT2, 0); }
		public TerminalNode C_N() { return getToken(lensParser.C_N, 0); }
		public TerminalNode C_I() { return getToken(lensParser.C_I, 0); }
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public LacoforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lacofor; }
	}

	public final LacoforContext lacofor() throws RecognitionException {
		LacoforContext _localctx = new LacoforContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_lacofor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(FOR);
			setState(130);
			match(VAR);
			setState(131);
			match(IN);
			setState(132);
			expressao_arit();
			setState(133);
			match(DOT2);
			setState(134);
			expressao_arit();
			setState(135);
			match(C_N);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 137438955128L) != 0)) {
				{
				{
				setState(136);
				comando();
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(142);
			match(C_I);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LacowhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(lensParser.WHILE, 0); }
		public TerminalNode P_N() { return getToken(lensParser.P_N, 0); }
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public TerminalNode P_I() { return getToken(lensParser.P_I, 0); }
		public TerminalNode C_N() { return getToken(lensParser.C_N, 0); }
		public TerminalNode C_I() { return getToken(lensParser.C_I, 0); }
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public LacowhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lacowhile; }
	}

	public final LacowhileContext lacowhile() throws RecognitionException {
		LacowhileContext _localctx = new LacowhileContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_lacowhile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(WHILE);
			setState(145);
			match(P_N);
			setState(146);
			condicao();
			setState(147);
			match(P_I);
			setState(148);
			match(C_N);
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 137438955128L) != 0)) {
				{
				{
				setState(149);
				comando();
				}
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(155);
			match(C_I);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoContext extends ParserRuleContext {
		public Expressao_logicaContext expressao_logica() {
			return getRuleContext(Expressao_logicaContext.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expressao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			expressao_logica();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expressao_logicaContext extends ParserRuleContext {
		public List<Expressao_comparacaoContext> expressao_comparacao() {
			return getRuleContexts(Expressao_comparacaoContext.class);
		}
		public Expressao_comparacaoContext expressao_comparacao(int i) {
			return getRuleContext(Expressao_comparacaoContext.class,i);
		}
		public List<Op_logicoContext> op_logico() {
			return getRuleContexts(Op_logicoContext.class);
		}
		public Op_logicoContext op_logico(int i) {
			return getRuleContext(Op_logicoContext.class,i);
		}
		public Expressao_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_logica; }
	}

	public final Expressao_logicaContext expressao_logica() throws RecognitionException {
		Expressao_logicaContext _localctx = new Expressao_logicaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expressao_logica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			expressao_comparacao();
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(160);
				op_logico();
				setState(161);
				expressao_comparacao();
				}
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expressao_comparacaoContext extends ParserRuleContext {
		public List<Expressao_aritContext> expressao_arit() {
			return getRuleContexts(Expressao_aritContext.class);
		}
		public Expressao_aritContext expressao_arit(int i) {
			return getRuleContext(Expressao_aritContext.class,i);
		}
		public Op_comparacaoContext op_comparacao() {
			return getRuleContext(Op_comparacaoContext.class,0);
		}
		public Expressao_comparacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_comparacao; }
	}

	public final Expressao_comparacaoContext expressao_comparacao() throws RecognitionException {
		Expressao_comparacaoContext _localctx = new Expressao_comparacaoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expressao_comparacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			expressao_arit();
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8455716864L) != 0)) {
				{
				setState(169);
				op_comparacao();
				setState(170);
				expressao_arit();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expressao_aritContext extends ParserRuleContext {
		public List<Termo_aritContext> termo_arit() {
			return getRuleContexts(Termo_aritContext.class);
		}
		public Termo_aritContext termo_arit(int i) {
			return getRuleContext(Termo_aritContext.class,i);
		}
		public List<Op_adicaoContext> op_adicao() {
			return getRuleContexts(Op_adicaoContext.class);
		}
		public Op_adicaoContext op_adicao(int i) {
			return getRuleContext(Op_adicaoContext.class,i);
		}
		public Expressao_aritContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_arit; }
	}

	public final Expressao_aritContext expressao_arit() throws RecognitionException {
		Expressao_aritContext _localctx = new Expressao_aritContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expressao_arit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			termo_arit();
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==SUB) {
				{
				{
				setState(175);
				op_adicao();
				setState(176);
				termo_arit();
				}
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Termo_aritContext extends ParserRuleContext {
		public List<FatorContext> fator() {
			return getRuleContexts(FatorContext.class);
		}
		public FatorContext fator(int i) {
			return getRuleContext(FatorContext.class,i);
		}
		public List<Op_multiplicacaoContext> op_multiplicacao() {
			return getRuleContexts(Op_multiplicacaoContext.class);
		}
		public Op_multiplicacaoContext op_multiplicacao(int i) {
			return getRuleContext(Op_multiplicacaoContext.class,i);
		}
		public Termo_aritContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo_arit; }
	}

	public final Termo_aritContext termo_arit() throws RecognitionException {
		Termo_aritContext _localctx = new Termo_aritContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_termo_arit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			fator();
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MUL || _la==DIV) {
				{
				{
				setState(184);
				op_multiplicacao();
				setState(185);
				fator();
				}
				}
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FatorContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode VAR() { return getToken(lensParser.VAR, 0); }
		public TerminalNode P_N() { return getToken(lensParser.P_N, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode P_I() { return getToken(lensParser.P_I, 0); }
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_fator);
		try {
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				literal();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				match(VAR);
				}
				break;
			case P_N:
				enterOuterAlt(_localctx, 3);
				{
				setState(194);
				match(P_N);
				setState(195);
				expressao();
				setState(196);
				match(P_I);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(lensParser.INT, 0); }
		public TerminalNode STRING() { return getToken(lensParser.STRING, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CondicaoContext extends ParserRuleContext {
		public Expressao_logicaContext expressao_logica() {
			return getRuleContext(Expressao_logicaContext.class,0);
		}
		public CondicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicao; }
	}

	public final CondicaoContext condicao() throws RecognitionException {
		CondicaoContext _localctx = new CondicaoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_condicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			expressao_logica();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Op_adicaoContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(lensParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(lensParser.SUB, 0); }
		public Op_adicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_adicao; }
	}

	public final Op_adicaoContext op_adicao() throws RecognitionException {
		Op_adicaoContext _localctx = new Op_adicaoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_op_adicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			_la = _input.LA(1);
			if ( !(_la==ADD || _la==SUB) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Op_multiplicacaoContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(lensParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(lensParser.DIV, 0); }
		public Op_multiplicacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_multiplicacao; }
	}

	public final Op_multiplicacaoContext op_multiplicacao() throws RecognitionException {
		Op_multiplicacaoContext _localctx = new Op_multiplicacaoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_op_multiplicacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			_la = _input.LA(1);
			if ( !(_la==MUL || _la==DIV) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Op_logicoContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(lensParser.AND, 0); }
		public TerminalNode OR() { return getToken(lensParser.OR, 0); }
		public Op_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_logico; }
	}

	public final Op_logicoContext op_logico() throws RecognitionException {
		Op_logicoContext _localctx = new Op_logicoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_op_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Op_comparacaoContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(lensParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(lensParser.NEQ, 0); }
		public TerminalNode LT() { return getToken(lensParser.LT, 0); }
		public TerminalNode GT() { return getToken(lensParser.GT, 0); }
		public TerminalNode LTE() { return getToken(lensParser.LTE, 0); }
		public TerminalNode GTE() { return getToken(lensParser.GTE, 0); }
		public Op_comparacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_comparacao; }
	}

	public final Op_comparacaoContext op_comparacao() throws RecognitionException {
		Op_comparacaoContext _localctx = new Op_comparacaoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_op_comparacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8455716864L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracaoContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(lensParser.LET, 0); }
		public TerminalNode VAR() { return getToken(lensParser.VAR, 0); }
		public TerminalNode POINT2() { return getToken(lensParser.POINT2, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(lensParser.EQUALS, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_declaracao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(LET);
			setState(213);
			match(VAR);
			setState(214);
			match(POINT2);
			setState(215);
			tipo();
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(216);
				match(EQUALS);
				setState(217);
				expressao();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(lensParser.INT_TYPE, 0); }
		public TerminalNode STRING_TYPE() { return getToken(lensParser.STRING_TYPE, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			_la = _input.LA(1);
			if ( !(_la==INT_TYPE || _la==STRING_TYPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtribuicaoContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(lensParser.VAR, 0); }
		public TerminalNode EQUALS() { return getToken(lensParser.EQUALS, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Op_adicaoContext op_adicao() {
			return getRuleContext(Op_adicaoContext.class,0);
		}
		public Op_multiplicacaoContext op_multiplicacao() {
			return getRuleContext(Op_multiplicacaoContext.class,0);
		}
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_atribuicao);
		try {
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				match(VAR);
				setState(223);
				match(EQUALS);
				setState(224);
				expressao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				match(VAR);
				setState(226);
				op_adicao();
				setState(227);
				match(EQUALS);
				setState(228);
				expressao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(230);
				match(VAR);
				setState(231);
				op_multiplicacao();
				setState(232);
				match(EQUALS);
				setState(233);
				expressao();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\'\u00ee\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0001\u0000\u0001\u0000\u0005\u00005\b\u0000\n\u0000\f\u00008\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001C\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002J\b\u0002"+
		"\n\u0002\f\u0002M\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0005\u0004V\b\u0004\n\u0004\f\u0004"+
		"Y\t\u0004\u0001\u0004\u0003\u0004\\\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005d\b\u0005\n\u0005"+
		"\f\u0005g\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006q\b\u0006\n\u0006"+
		"\f\u0006t\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0005\u0007{\b\u0007\n\u0007\f\u0007~\t\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0005\b\u008a\b\b\n\b\f\b\u008d\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0005\t\u0097\b\t\n\t\f\t\u009a\t\t\u0001\t"+
		"\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0005\u000b\u00a4\b\u000b\n\u000b\f\u000b\u00a7\t\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0003\f\u00ad\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0005"+
		"\r\u00b3\b\r\n\r\f\r\u00b6\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0005\u000e\u00bc\b\u000e\n\u000e\f\u000e\u00bf\t\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u00c7\b\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0003\u0016\u00db\b\u0016\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0003\u0018\u00ec\b\u0018\u0001\u0018\u0000\u0000\u0019\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.0\u0000\u0006\u0001\u0000#$\u0001\u0000\u0019\u001a\u0001\u0000"+
		"\u0017\u0018\u0001\u0000!\"\u0001\u0000\u001b \u0001\u0000\f\r\u00ec\u0000"+
		"2\u0001\u0000\u0000\u0000\u0002B\u0001\u0000\u0000\u0000\u0004D\u0001"+
		"\u0000\u0000\u0000\u0006N\u0001\u0000\u0000\u0000\bS\u0001\u0000\u0000"+
		"\u0000\n]\u0001\u0000\u0000\u0000\fj\u0001\u0000\u0000\u0000\u000ew\u0001"+
		"\u0000\u0000\u0000\u0010\u0081\u0001\u0000\u0000\u0000\u0012\u0090\u0001"+
		"\u0000\u0000\u0000\u0014\u009d\u0001\u0000\u0000\u0000\u0016\u009f\u0001"+
		"\u0000\u0000\u0000\u0018\u00a8\u0001\u0000\u0000\u0000\u001a\u00ae\u0001"+
		"\u0000\u0000\u0000\u001c\u00b7\u0001\u0000\u0000\u0000\u001e\u00c6\u0001"+
		"\u0000\u0000\u0000 \u00c8\u0001\u0000\u0000\u0000\"\u00ca\u0001\u0000"+
		"\u0000\u0000$\u00cc\u0001\u0000\u0000\u0000&\u00ce\u0001\u0000\u0000\u0000"+
		"(\u00d0\u0001\u0000\u0000\u0000*\u00d2\u0001\u0000\u0000\u0000,\u00d4"+
		"\u0001\u0000\u0000\u0000.\u00dc\u0001\u0000\u0000\u00000\u00eb\u0001\u0000"+
		"\u0000\u000026\u0005\u0001\u0000\u000035\u0003\u0002\u0001\u000043\u0001"+
		"\u0000\u0000\u000058\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u0000"+
		"67\u0001\u0000\u0000\u000079\u0001\u0000\u0000\u000086\u0001\u0000\u0000"+
		"\u00009:\u0005\u0002\u0000\u0000:\u0001\u0001\u0000\u0000\u0000;C\u0003"+
		",\u0016\u0000<C\u00030\u0018\u0000=C\u0003\u0004\u0002\u0000>C\u0003\u0006"+
		"\u0003\u0000?C\u0003\b\u0004\u0000@C\u0003\u0010\b\u0000AC\u0003\u0012"+
		"\t\u0000B;\u0001\u0000\u0000\u0000B<\u0001\u0000\u0000\u0000B=\u0001\u0000"+
		"\u0000\u0000B>\u0001\u0000\u0000\u0000B?\u0001\u0000\u0000\u0000B@\u0001"+
		"\u0000\u0000\u0000BA\u0001\u0000\u0000\u0000C\u0003\u0001\u0000\u0000"+
		"\u0000DE\u0005\u0004\u0000\u0000EF\u0005\u000e\u0000\u0000FK\u0003\u0014"+
		"\n\u0000GH\u0005\u0011\u0000\u0000HJ\u0003\u0014\n\u0000IG\u0001\u0000"+
		"\u0000\u0000JM\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000KL\u0001"+
		"\u0000\u0000\u0000L\u0005\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000"+
		"\u0000NO\u0005\u0005\u0000\u0000OP\u0005\u0013\u0000\u0000PQ\u0005%\u0000"+
		"\u0000QR\u0005\u0014\u0000\u0000R\u0007\u0001\u0000\u0000\u0000SW\u0003"+
		"\n\u0005\u0000TV\u0003\f\u0006\u0000UT\u0001\u0000\u0000\u0000VY\u0001"+
		"\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000"+
		"X[\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000Z\\\u0003\u000e\u0007"+
		"\u0000[Z\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\\t\u0001"+
		"\u0000\u0000\u0000]^\u0005\u0006\u0000\u0000^_\u0005\u0013\u0000\u0000"+
		"_`\u0003\"\u0011\u0000`a\u0005\u0014\u0000\u0000ae\u0005\u0015\u0000\u0000"+
		"bd\u0003\u0002\u0001\u0000cb\u0001\u0000\u0000\u0000dg\u0001\u0000\u0000"+
		"\u0000ec\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fh\u0001\u0000"+
		"\u0000\u0000ge\u0001\u0000\u0000\u0000hi\u0005\u0016\u0000\u0000i\u000b"+
		"\u0001\u0000\u0000\u0000jk\u0005\u0007\u0000\u0000kl\u0005\u0013\u0000"+
		"\u0000lm\u0003\"\u0011\u0000mn\u0005\u0014\u0000\u0000nr\u0005\u0015\u0000"+
		"\u0000oq\u0003\u0002\u0001\u0000po\u0001\u0000\u0000\u0000qt\u0001\u0000"+
		"\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000su\u0001"+
		"\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000uv\u0005\u0016\u0000\u0000"+
		"v\r\u0001\u0000\u0000\u0000wx\u0005\b\u0000\u0000x|\u0005\u0015\u0000"+
		"\u0000y{\u0003\u0002\u0001\u0000zy\u0001\u0000\u0000\u0000{~\u0001\u0000"+
		"\u0000\u0000|z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}\u007f"+
		"\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000\u007f\u0080\u0005\u0016"+
		"\u0000\u0000\u0080\u000f\u0001\u0000\u0000\u0000\u0081\u0082\u0005\t\u0000"+
		"\u0000\u0082\u0083\u0005%\u0000\u0000\u0083\u0084\u0005\u000b\u0000\u0000"+
		"\u0084\u0085\u0003\u001a\r\u0000\u0085\u0086\u0005\u0010\u0000\u0000\u0086"+
		"\u0087\u0003\u001a\r\u0000\u0087\u008b\u0005\u0015\u0000\u0000\u0088\u008a"+
		"\u0003\u0002\u0001\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u008a\u008d"+
		"\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008c"+
		"\u0001\u0000\u0000\u0000\u008c\u008e\u0001\u0000\u0000\u0000\u008d\u008b"+
		"\u0001\u0000\u0000\u0000\u008e\u008f\u0005\u0016\u0000\u0000\u008f\u0011"+
		"\u0001\u0000\u0000\u0000\u0090\u0091\u0005\n\u0000\u0000\u0091\u0092\u0005"+
		"\u0013\u0000\u0000\u0092\u0093\u0003\"\u0011\u0000\u0093\u0094\u0005\u0014"+
		"\u0000\u0000\u0094\u0098\u0005\u0015\u0000\u0000\u0095\u0097\u0003\u0002"+
		"\u0001\u0000\u0096\u0095\u0001\u0000\u0000\u0000\u0097\u009a\u0001\u0000"+
		"\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000"+
		"\u0000\u0000\u0099\u009b\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000"+
		"\u0000\u0000\u009b\u009c\u0005\u0016\u0000\u0000\u009c\u0013\u0001\u0000"+
		"\u0000\u0000\u009d\u009e\u0003\u0016\u000b\u0000\u009e\u0015\u0001\u0000"+
		"\u0000\u0000\u009f\u00a5\u0003\u0018\f\u0000\u00a0\u00a1\u0003(\u0014"+
		"\u0000\u00a1\u00a2\u0003\u0018\f\u0000\u00a2\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a0\u0001\u0000\u0000\u0000\u00a4\u00a7\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a6\u0017\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a8\u00ac\u0003\u001a\r\u0000\u00a9\u00aa\u0003*\u0015\u0000\u00aa"+
		"\u00ab\u0003\u001a\r\u0000\u00ab\u00ad\u0001\u0000\u0000\u0000\u00ac\u00a9"+
		"\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u0019"+
		"\u0001\u0000\u0000\u0000\u00ae\u00b4\u0003\u001c\u000e\u0000\u00af\u00b0"+
		"\u0003$\u0012\u0000\u00b0\u00b1\u0003\u001c\u000e\u0000\u00b1\u00b3\u0001"+
		"\u0000\u0000\u0000\u00b2\u00af\u0001\u0000\u0000\u0000\u00b3\u00b6\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001"+
		"\u0000\u0000\u0000\u00b5\u001b\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b7\u00bd\u0003\u001e\u000f\u0000\u00b8\u00b9\u0003"+
		"&\u0013\u0000\u00b9\u00ba\u0003\u001e\u000f\u0000\u00ba\u00bc\u0001\u0000"+
		"\u0000\u0000\u00bb\u00b8\u0001\u0000\u0000\u0000\u00bc\u00bf\u0001\u0000"+
		"\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000"+
		"\u0000\u0000\u00be\u001d\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c7\u0003 \u0010\u0000\u00c1\u00c7\u0005%\u0000\u0000"+
		"\u00c2\u00c3\u0005\u0013\u0000\u0000\u00c3\u00c4\u0003\u0014\n\u0000\u00c4"+
		"\u00c5\u0005\u0014\u0000\u0000\u00c5\u00c7\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c0\u0001\u0000\u0000\u0000\u00c6\u00c1\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c2\u0001\u0000\u0000\u0000\u00c7\u001f\u0001\u0000\u0000\u0000\u00c8"+
		"\u00c9\u0007\u0000\u0000\u0000\u00c9!\u0001\u0000\u0000\u0000\u00ca\u00cb"+
		"\u0003\u0016\u000b\u0000\u00cb#\u0001\u0000\u0000\u0000\u00cc\u00cd\u0007"+
		"\u0001\u0000\u0000\u00cd%\u0001\u0000\u0000\u0000\u00ce\u00cf\u0007\u0002"+
		"\u0000\u0000\u00cf\'\u0001\u0000\u0000\u0000\u00d0\u00d1\u0007\u0003\u0000"+
		"\u0000\u00d1)\u0001\u0000\u0000\u0000\u00d2\u00d3\u0007\u0004\u0000\u0000"+
		"\u00d3+\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005\u0003\u0000\u0000\u00d5"+
		"\u00d6\u0005%\u0000\u0000\u00d6\u00d7\u0005\u000f\u0000\u0000\u00d7\u00da"+
		"\u0003.\u0017\u0000\u00d8\u00d9\u0005\u0012\u0000\u0000\u00d9\u00db\u0003"+
		"\u0014\n\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000"+
		"\u0000\u0000\u00db-\u0001\u0000\u0000\u0000\u00dc\u00dd\u0007\u0005\u0000"+
		"\u0000\u00dd/\u0001\u0000\u0000\u0000\u00de\u00df\u0005%\u0000\u0000\u00df"+
		"\u00e0\u0005\u0012\u0000\u0000\u00e0\u00ec\u0003\u0014\n\u0000\u00e1\u00e2"+
		"\u0005%\u0000\u0000\u00e2\u00e3\u0003$\u0012\u0000\u00e3\u00e4\u0005\u0012"+
		"\u0000\u0000\u00e4\u00e5\u0003\u0014\n\u0000\u00e5\u00ec\u0001\u0000\u0000"+
		"\u0000\u00e6\u00e7\u0005%\u0000\u0000\u00e7\u00e8\u0003&\u0013\u0000\u00e8"+
		"\u00e9\u0005\u0012\u0000\u0000\u00e9\u00ea\u0003\u0014\n\u0000\u00ea\u00ec"+
		"\u0001\u0000\u0000\u0000\u00eb\u00de\u0001\u0000\u0000\u0000\u00eb\u00e1"+
		"\u0001\u0000\u0000\u0000\u00eb\u00e6\u0001\u0000\u0000\u0000\u00ec1\u0001"+
		"\u0000\u0000\u0000\u00116BKW[er|\u008b\u0098\u00a5\u00ac\u00b4\u00bd\u00c6"+
		"\u00da\u00eb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}