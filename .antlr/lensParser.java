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
		WHILE=10, IN=11, INT_TYPE=12, FLOAT_TYPE=13, STRING_TYPE=14, BOOL_TYPE=15, 
		DUPONT=16, POINT2=17, DOT2=18, VIRG=19, EQUALS=20, P_N=21, P_I=22, C_N=23, 
		C_I=24, ADD=25, SUB=26, MUL=27, DIV=28, EQ=29, NEQ=30, LT=31, GT=32, LTE=33, 
		GTE=34, AND=35, OR=36, BOOL=37, STRING=38, FLOAT=39, INT=40, VAR=41, COMENTARIO=42, 
		WS=43;
	public static final int
		RULE_lens = 0, RULE_comando = 1, RULE_imprime = 2, RULE_concat = 3, RULE_ler = 4, 
		RULE_condicao = 5, RULE_ifcond = 6, RULE_elifcond = 7, RULE_elcond = 8, 
		RULE_lacofor = 9, RULE_lacowhile = 10, RULE_arit = 11, RULE_aritp = 12, 
		RULE_oparit = 13, RULE_opalogi = 14, RULE_comparacao = 15, RULE_expcomp = 16, 
		RULE_explogi = 17, RULE_expTemplate = 18, RULE_exp = 19, RULE_expcond = 20, 
		RULE_dec = 21, RULE_class = 22, RULE_letvar = 23, RULE_atrsolta = 24, 
		RULE_atr = 25, RULE_rolav = 26, RULE_valor = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"lens", "comando", "imprime", "concat", "ler", "condicao", "ifcond", 
			"elifcond", "elcond", "lacofor", "lacowhile", "arit", "aritp", "oparit", 
			"opalogi", "comparacao", "expcomp", "explogi", "expTemplate", "exp", 
			"expcond", "dec", "class", "letvar", "atrsolta", "atr", "rolav", "valor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'@start'", "'@end'", "'let'", "'print'", "'input'", "'if'", "'elseif'", 
			"'else'", "'for'", "'while'", "'in'", "'int'", "'float'", "'String'", 
			"'bool'", "'::'", "':'", "'..'", "','", "'='", "'('", "')'", "'{'", "'}'", 
			"'+'", "'-'", "'*'", "'/'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", 
			"'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "START", "END", "LET", "PRINT", "INPUT", "IF", "ELSEIF", "ELSE", 
			"FOR", "WHILE", "IN", "INT_TYPE", "FLOAT_TYPE", "STRING_TYPE", "BOOL_TYPE", 
			"DUPONT", "POINT2", "DOT2", "VIRG", "EQUALS", "P_N", "P_I", "C_N", "C_I", 
			"ADD", "SUB", "MUL", "DIV", "EQ", "NEQ", "LT", "GT", "LTE", "GTE", "AND", 
			"OR", "BOOL", "STRING", "FLOAT", "INT", "VAR", "COMENTARIO", "WS"
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
			setState(56);
			match(START);
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2199023257208L) != 0)) {
				{
				{
				setState(57);
				comando();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
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
		public ImprimeContext imprime() {
			return getRuleContext(ImprimeContext.class,0);
		}
		public AtrsoltaContext atrsolta() {
			return getRuleContext(AtrsoltaContext.class,0);
		}
		public DecContext dec() {
			return getRuleContext(DecContext.class,0);
		}
		public LerContext ler() {
			return getRuleContext(LerContext.class,0);
		}
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
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
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				imprime();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				atrsolta();
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 3);
				{
				setState(67);
				dec();
				}
				break;
			case INPUT:
				enterOuterAlt(_localctx, 4);
				{
				setState(68);
				ler();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 5);
				{
				setState(69);
				condicao();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 6);
				{
				setState(70);
				lacofor();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 7);
				{
				setState(71);
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
	public static class ImprimeContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(lensParser.PRINT, 0); }
		public TerminalNode DUPONT() { return getToken(lensParser.DUPONT, 0); }
		public ConcatContext concat() {
			return getRuleContext(ConcatContext.class,0);
		}
		public ImprimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprime; }
	}

	public final ImprimeContext imprime() throws RecognitionException {
		ImprimeContext _localctx = new ImprimeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_imprime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(PRINT);
			setState(75);
			match(DUPONT);
			setState(76);
			concat();
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
	public static class ConcatContext extends ParserRuleContext {
		public List<RolavContext> rolav() {
			return getRuleContexts(RolavContext.class);
		}
		public RolavContext rolav(int i) {
			return getRuleContext(RolavContext.class,i);
		}
		public List<TerminalNode> VIRG() { return getTokens(lensParser.VIRG); }
		public TerminalNode VIRG(int i) {
			return getToken(lensParser.VIRG, i);
		}
		public ConcatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concat; }
	}

	public final ConcatContext concat() throws RecognitionException {
		ConcatContext _localctx = new ConcatContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_concat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			rolav();
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRG) {
				{
				{
				setState(79);
				match(VIRG);
				setState(80);
				rolav();
				}
				}
				setState(85);
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
	public static class LerContext extends ParserRuleContext {
		public TerminalNode INPUT() { return getToken(lensParser.INPUT, 0); }
		public TerminalNode P_N() { return getToken(lensParser.P_N, 0); }
		public TerminalNode VAR() { return getToken(lensParser.VAR, 0); }
		public TerminalNode P_I() { return getToken(lensParser.P_I, 0); }
		public LerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ler; }
	}

	public final LerContext ler() throws RecognitionException {
		LerContext _localctx = new LerContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(INPUT);
			setState(87);
			match(P_N);
			setState(88);
			match(VAR);
			setState(89);
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
	public static class CondicaoContext extends ParserRuleContext {
		public IfcondContext ifcond() {
			return getRuleContext(IfcondContext.class,0);
		}
		public List<ElifcondContext> elifcond() {
			return getRuleContexts(ElifcondContext.class);
		}
		public ElifcondContext elifcond(int i) {
			return getRuleContext(ElifcondContext.class,i);
		}
		public ElcondContext elcond() {
			return getRuleContext(ElcondContext.class,0);
		}
		public CondicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicao; }
	}

	public final CondicaoContext condicao() throws RecognitionException {
		CondicaoContext _localctx = new CondicaoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_condicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			ifcond();
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(92);
				elifcond();
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(98);
				elcond();
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
	public static class IfcondContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(lensParser.IF, 0); }
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public TerminalNode C_N() { return getToken(lensParser.C_N, 0); }
		public TerminalNode C_I() { return getToken(lensParser.C_I, 0); }
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public IfcondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifcond; }
	}

	public final IfcondContext ifcond() throws RecognitionException {
		IfcondContext _localctx = new IfcondContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ifcond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(IF);
			setState(102);
			expcond();
			setState(103);
			match(C_N);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2199023257208L) != 0)) {
				{
				{
				setState(104);
				comando();
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
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
	public static class ElifcondContext extends ParserRuleContext {
		public TerminalNode ELSEIF() { return getToken(lensParser.ELSEIF, 0); }
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public TerminalNode C_N() { return getToken(lensParser.C_N, 0); }
		public TerminalNode C_I() { return getToken(lensParser.C_I, 0); }
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public ElifcondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elifcond; }
	}

	public final ElifcondContext elifcond() throws RecognitionException {
		ElifcondContext _localctx = new ElifcondContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_elifcond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(ELSEIF);
			setState(113);
			expcond();
			setState(114);
			match(C_N);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2199023257208L) != 0)) {
				{
				{
				setState(115);
				comando();
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121);
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
	public static class ElcondContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(lensParser.ELSE, 0); }
		public TerminalNode C_N() { return getToken(lensParser.C_N, 0); }
		public TerminalNode C_I() { return getToken(lensParser.C_I, 0); }
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public ElcondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elcond; }
	}

	public final ElcondContext elcond() throws RecognitionException {
		ElcondContext _localctx = new ElcondContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_elcond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(ELSE);
			setState(124);
			match(C_N);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2199023257208L) != 0)) {
				{
				{
				setState(125);
				comando();
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(131);
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
		public TerminalNode INT() { return getToken(lensParser.INT, 0); }
		public TerminalNode DOT2() { return getToken(lensParser.DOT2, 0); }
		public AritContext arit() {
			return getRuleContext(AritContext.class,0);
		}
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
		enterRule(_localctx, 18, RULE_lacofor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(FOR);
			setState(134);
			match(VAR);
			setState(135);
			match(IN);
			setState(136);
			match(INT);
			setState(137);
			match(DOT2);
			setState(138);
			arit();
			setState(139);
			match(C_N);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2199023257208L) != 0)) {
				{
				{
				setState(140);
				comando();
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(146);
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
		public TerminalNode VAR() { return getToken(lensParser.VAR, 0); }
		public ComparacaoContext comparacao() {
			return getRuleContext(ComparacaoContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
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
		enterRule(_localctx, 20, RULE_lacowhile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(WHILE);
			setState(149);
			match(VAR);
			setState(150);
			comparacao();
			setState(151);
			exp();
			setState(152);
			match(C_N);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2199023257208L) != 0)) {
				{
				{
				setState(153);
				comando();
				}
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(159);
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
	public static class AritContext extends ParserRuleContext {
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public List<OparitContext> oparit() {
			return getRuleContexts(OparitContext.class);
		}
		public OparitContext oparit(int i) {
			return getRuleContext(OparitContext.class,i);
		}
		public AritContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arit; }
	}

	public final AritContext arit() throws RecognitionException {
		AritContext _localctx = new AritContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_arit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			valor();
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 503316480L) != 0)) {
				{
				{
				setState(162);
				oparit();
				setState(163);
				valor();
				}
				}
				setState(169);
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
	public static class AritpContext extends ParserRuleContext {
		public TerminalNode P_N() { return getToken(lensParser.P_N, 0); }
		public TerminalNode P_I() { return getToken(lensParser.P_I, 0); }
		public ExplogiContext explogi() {
			return getRuleContext(ExplogiContext.class,0);
		}
		public AritpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aritp; }
	}

	public final AritpContext aritp() throws RecognitionException {
		AritpContext _localctx = new AritpContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_aritp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(P_N);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3985731747840L) != 0)) {
				{
				setState(171);
				explogi();
				}
			}

			setState(174);
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
	public static class OparitContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(lensParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(lensParser.DIV, 0); }
		public TerminalNode ADD() { return getToken(lensParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(lensParser.SUB, 0); }
		public OparitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oparit; }
	}

	public final OparitContext oparit() throws RecognitionException {
		OparitContext _localctx = new OparitContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_oparit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 503316480L) != 0)) ) {
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
	public static class OpalogiContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(lensParser.AND, 0); }
		public TerminalNode OR() { return getToken(lensParser.OR, 0); }
		public OpalogiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opalogi; }
	}

	public final OpalogiContext opalogi() throws RecognitionException {
		OpalogiContext _localctx = new OpalogiContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_opalogi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
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
	public static class ComparacaoContext extends ParserRuleContext {
		public TerminalNode NEQ() { return getToken(lensParser.NEQ, 0); }
		public TerminalNode LT() { return getToken(lensParser.LT, 0); }
		public TerminalNode GT() { return getToken(lensParser.GT, 0); }
		public TerminalNode LTE() { return getToken(lensParser.LTE, 0); }
		public TerminalNode GTE() { return getToken(lensParser.GTE, 0); }
		public TerminalNode EQ() { return getToken(lensParser.EQ, 0); }
		public ComparacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparacao; }
	}

	public final ComparacaoContext comparacao() throws RecognitionException {
		ComparacaoContext _localctx = new ComparacaoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_comparacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 33822867456L) != 0)) ) {
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
	public static class ExpcompContext extends ParserRuleContext {
		public List<AritContext> arit() {
			return getRuleContexts(AritContext.class);
		}
		public AritContext arit(int i) {
			return getRuleContext(AritContext.class,i);
		}
		public ComparacaoContext comparacao() {
			return getRuleContext(ComparacaoContext.class,0);
		}
		public ExpcompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expcomp; }
	}

	public final ExpcompContext expcomp() throws RecognitionException {
		ExpcompContext _localctx = new ExpcompContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expcomp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			arit();
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 33822867456L) != 0)) {
				{
				setState(183);
				comparacao();
				setState(184);
				arit();
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
	public static class ExplogiContext extends ParserRuleContext {
		public List<ExpcompContext> expcomp() {
			return getRuleContexts(ExpcompContext.class);
		}
		public ExpcompContext expcomp(int i) {
			return getRuleContext(ExpcompContext.class,i);
		}
		public List<OpalogiContext> opalogi() {
			return getRuleContexts(OpalogiContext.class);
		}
		public OpalogiContext opalogi(int i) {
			return getRuleContext(OpalogiContext.class,i);
		}
		public ExplogiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explogi; }
	}

	public final ExplogiContext explogi() throws RecognitionException {
		ExplogiContext _localctx = new ExplogiContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_explogi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			expcomp();
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(189);
				opalogi();
				setState(190);
				expcomp();
				}
				}
				setState(196);
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
	public static class ExpTemplateContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(lensParser.STRING, 0); }
		public TerminalNode INT() { return getToken(lensParser.INT, 0); }
		public TerminalNode VAR() { return getToken(lensParser.VAR, 0); }
		public TerminalNode BOOL() { return getToken(lensParser.BOOL, 0); }
		public AritContext arit() {
			return getRuleContext(AritContext.class,0);
		}
		public ExplogiContext explogi() {
			return getRuleContext(ExplogiContext.class,0);
		}
		public ExpcompContext expcomp() {
			return getRuleContext(ExpcompContext.class,0);
		}
		public ExpTemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expTemplate; }
	}

	public final ExpTemplateContext expTemplate() throws RecognitionException {
		ExpTemplateContext _localctx = new ExpTemplateContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expTemplate);
		try {
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				match(INT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(199);
				match(VAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(200);
				match(BOOL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(201);
				arit();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(202);
				explogi();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(203);
				expcomp();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpContext extends ParserRuleContext {
		public ExpTemplateContext expTemplate() {
			return getRuleContext(ExpTemplateContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			expTemplate();
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
	public static class ExpcondContext extends ParserRuleContext {
		public ExplogiContext explogi() {
			return getRuleContext(ExplogiContext.class,0);
		}
		public ExpcondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expcond; }
	}

	public final ExpcondContext expcond() throws RecognitionException {
		ExpcondContext _localctx = new ExpcondContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expcond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			explogi();
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
	public static class DecContext extends ParserRuleContext {
		public LetvarContext letvar() {
			return getRuleContext(LetvarContext.class,0);
		}
		public ClassContext class_() {
			return getRuleContext(ClassContext.class,0);
		}
		public AtrContext atr() {
			return getRuleContext(AtrContext.class,0);
		}
		public DecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec; }
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			letvar();
			setState(211);
			class_();
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(212);
				atr();
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
	public static class ClassContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(lensParser.INT_TYPE, 0); }
		public TerminalNode BOOL_TYPE() { return getToken(lensParser.BOOL_TYPE, 0); }
		public TerminalNode STRING_TYPE() { return getToken(lensParser.STRING_TYPE, 0); }
		public TerminalNode FLOAT_TYPE() { return getToken(lensParser.FLOAT_TYPE, 0); }
		public TerminalNode VAR() { return getToken(lensParser.VAR, 0); }
		public ClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class; }
	}

	public final ClassContext class_() throws RecognitionException {
		ClassContext _localctx = new ClassContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2199023316992L) != 0)) ) {
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
	public static class LetvarContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(lensParser.LET, 0); }
		public TerminalNode VAR() { return getToken(lensParser.VAR, 0); }
		public TerminalNode POINT2() { return getToken(lensParser.POINT2, 0); }
		public LetvarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letvar; }
	}

	public final LetvarContext letvar() throws RecognitionException {
		LetvarContext _localctx = new LetvarContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_letvar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(LET);
			setState(218);
			match(VAR);
			setState(219);
			match(POINT2);
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
	public static class AtrsoltaContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(lensParser.VAR, 0); }
		public TerminalNode EQUALS() { return getToken(lensParser.EQUALS, 0); }
		public RolavContext rolav() {
			return getRuleContext(RolavContext.class,0);
		}
		public OparitContext oparit() {
			return getRuleContext(OparitContext.class,0);
		}
		public AtrsoltaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atrsolta; }
	}

	public final AtrsoltaContext atrsolta() throws RecognitionException {
		AtrsoltaContext _localctx = new AtrsoltaContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_atrsolta);
		try {
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				match(VAR);
				setState(222);
				match(EQUALS);
				setState(223);
				rolav();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				match(VAR);
				setState(225);
				oparit();
				setState(226);
				match(EQUALS);
				setState(227);
				rolav();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtrContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(lensParser.EQUALS, 0); }
		public RolavContext rolav() {
			return getRuleContext(RolavContext.class,0);
		}
		public AtrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atr; }
	}

	public final AtrContext atr() throws RecognitionException {
		AtrContext _localctx = new AtrContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_atr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(EQUALS);
			setState(232);
			rolav();
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
	public static class RolavContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public RolavContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rolav; }
	}

	public final RolavContext rolav() throws RecognitionException {
		RolavContext _localctx = new RolavContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_rolav);
		try {
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				exp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				valor();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValorContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(lensParser.VAR, 0); }
		public TerminalNode BOOL() { return getToken(lensParser.BOOL, 0); }
		public TerminalNode INT() { return getToken(lensParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(lensParser.FLOAT, 0); }
		public AritpContext aritp() {
			return getRuleContext(AritpContext.class,0);
		}
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_valor);
		try {
			setState(243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				match(VAR);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				match(BOOL);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(240);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(241);
				match(FLOAT);
				}
				break;
			case P_N:
				enterOuterAlt(_localctx, 5);
				{
				setState(242);
				aritp();
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

	public static final String _serializedATN =
		"\u0004\u0001+\u00f6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0001\u0000\u0001\u0000\u0005\u0000;\b\u0000\n\u0000\f\u0000>\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001I\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003R\b\u0003\n\u0003\f\u0003U\t\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0005\u0005"+
		"^\b\u0005\n\u0005\f\u0005a\t\u0005\u0001\u0005\u0003\u0005d\b\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006j\b\u0006\n\u0006"+
		"\f\u0006m\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0005\u0007u\b\u0007\n\u0007\f\u0007x\t\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0005\b\u007f\b\b\n\b\f\b\u0082"+
		"\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0005\t\u008e\b\t\n\t\f\t\u0091\t\t\u0001\t\u0001\t\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u009b\b\n\n\n\f\n\u009e"+
		"\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u00a6\b\u000b\n\u000b\f\u000b\u00a9\t\u000b\u0001\f\u0001\f\u0003"+
		"\f\u00ad\b\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\u00bb\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005"+
		"\u0011\u00c1\b\u0011\n\u0011\f\u0011\u00c4\t\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u00cd\b\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u00d6\b\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0003\u0018\u00e6\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0001\u001a\u0003\u001a\u00ed\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0003\u001b\u00f4\b\u001b\u0001\u001b\u0000\u0000"+
		"\u001c\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.0246\u0000\u0004\u0001\u0000\u0019\u001c\u0001"+
		"\u0000#$\u0001\u0000\u001d\"\u0002\u0000\f\u000f))\u00f9\u00008\u0001"+
		"\u0000\u0000\u0000\u0002H\u0001\u0000\u0000\u0000\u0004J\u0001\u0000\u0000"+
		"\u0000\u0006N\u0001\u0000\u0000\u0000\bV\u0001\u0000\u0000\u0000\n[\u0001"+
		"\u0000\u0000\u0000\fe\u0001\u0000\u0000\u0000\u000ep\u0001\u0000\u0000"+
		"\u0000\u0010{\u0001\u0000\u0000\u0000\u0012\u0085\u0001\u0000\u0000\u0000"+
		"\u0014\u0094\u0001\u0000\u0000\u0000\u0016\u00a1\u0001\u0000\u0000\u0000"+
		"\u0018\u00aa\u0001\u0000\u0000\u0000\u001a\u00b0\u0001\u0000\u0000\u0000"+
		"\u001c\u00b2\u0001\u0000\u0000\u0000\u001e\u00b4\u0001\u0000\u0000\u0000"+
		" \u00b6\u0001\u0000\u0000\u0000\"\u00bc\u0001\u0000\u0000\u0000$\u00cc"+
		"\u0001\u0000\u0000\u0000&\u00ce\u0001\u0000\u0000\u0000(\u00d0\u0001\u0000"+
		"\u0000\u0000*\u00d2\u0001\u0000\u0000\u0000,\u00d7\u0001\u0000\u0000\u0000"+
		".\u00d9\u0001\u0000\u0000\u00000\u00e5\u0001\u0000\u0000\u00002\u00e7"+
		"\u0001\u0000\u0000\u00004\u00ec\u0001\u0000\u0000\u00006\u00f3\u0001\u0000"+
		"\u0000\u00008<\u0005\u0001\u0000\u00009;\u0003\u0002\u0001\u0000:9\u0001"+
		"\u0000\u0000\u0000;>\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000"+
		"<=\u0001\u0000\u0000\u0000=?\u0001\u0000\u0000\u0000><\u0001\u0000\u0000"+
		"\u0000?@\u0005\u0002\u0000\u0000@\u0001\u0001\u0000\u0000\u0000AI\u0003"+
		"\u0004\u0002\u0000BI\u00030\u0018\u0000CI\u0003*\u0015\u0000DI\u0003\b"+
		"\u0004\u0000EI\u0003\n\u0005\u0000FI\u0003\u0012\t\u0000GI\u0003\u0014"+
		"\n\u0000HA\u0001\u0000\u0000\u0000HB\u0001\u0000\u0000\u0000HC\u0001\u0000"+
		"\u0000\u0000HD\u0001\u0000\u0000\u0000HE\u0001\u0000\u0000\u0000HF\u0001"+
		"\u0000\u0000\u0000HG\u0001\u0000\u0000\u0000I\u0003\u0001\u0000\u0000"+
		"\u0000JK\u0005\u0004\u0000\u0000KL\u0005\u0010\u0000\u0000LM\u0003\u0006"+
		"\u0003\u0000M\u0005\u0001\u0000\u0000\u0000NS\u00034\u001a\u0000OP\u0005"+
		"\u0013\u0000\u0000PR\u00034\u001a\u0000QO\u0001\u0000\u0000\u0000RU\u0001"+
		"\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000"+
		"T\u0007\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000VW\u0005\u0005"+
		"\u0000\u0000WX\u0005\u0015\u0000\u0000XY\u0005)\u0000\u0000YZ\u0005\u0016"+
		"\u0000\u0000Z\t\u0001\u0000\u0000\u0000[_\u0003\f\u0006\u0000\\^\u0003"+
		"\u000e\u0007\u0000]\\\u0001\u0000\u0000\u0000^a\u0001\u0000\u0000\u0000"+
		"_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`c\u0001\u0000\u0000"+
		"\u0000a_\u0001\u0000\u0000\u0000bd\u0003\u0010\b\u0000cb\u0001\u0000\u0000"+
		"\u0000cd\u0001\u0000\u0000\u0000d\u000b\u0001\u0000\u0000\u0000ef\u0005"+
		"\u0006\u0000\u0000fg\u0003(\u0014\u0000gk\u0005\u0017\u0000\u0000hj\u0003"+
		"\u0002\u0001\u0000ih\u0001\u0000\u0000\u0000jm\u0001\u0000\u0000\u0000"+
		"ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000ln\u0001\u0000\u0000"+
		"\u0000mk\u0001\u0000\u0000\u0000no\u0005\u0018\u0000\u0000o\r\u0001\u0000"+
		"\u0000\u0000pq\u0005\u0007\u0000\u0000qr\u0003(\u0014\u0000rv\u0005\u0017"+
		"\u0000\u0000su\u0003\u0002\u0001\u0000ts\u0001\u0000\u0000\u0000ux\u0001"+
		"\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000"+
		"wy\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000yz\u0005\u0018\u0000"+
		"\u0000z\u000f\u0001\u0000\u0000\u0000{|\u0005\b\u0000\u0000|\u0080\u0005"+
		"\u0017\u0000\u0000}\u007f\u0003\u0002\u0001\u0000~}\u0001\u0000\u0000"+
		"\u0000\u007f\u0082\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000"+
		"\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0083\u0001\u0000\u0000\u0000"+
		"\u0082\u0080\u0001\u0000\u0000\u0000\u0083\u0084\u0005\u0018\u0000\u0000"+
		"\u0084\u0011\u0001\u0000\u0000\u0000\u0085\u0086\u0005\t\u0000\u0000\u0086"+
		"\u0087\u0005)\u0000\u0000\u0087\u0088\u0005\u000b\u0000\u0000\u0088\u0089"+
		"\u0005(\u0000\u0000\u0089\u008a\u0005\u0012\u0000\u0000\u008a\u008b\u0003"+
		"\u0016\u000b\u0000\u008b\u008f\u0005\u0017\u0000\u0000\u008c\u008e\u0003"+
		"\u0002\u0001\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008e\u0091\u0001"+
		"\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001"+
		"\u0000\u0000\u0000\u0090\u0092\u0001\u0000\u0000\u0000\u0091\u008f\u0001"+
		"\u0000\u0000\u0000\u0092\u0093\u0005\u0018\u0000\u0000\u0093\u0013\u0001"+
		"\u0000\u0000\u0000\u0094\u0095\u0005\n\u0000\u0000\u0095\u0096\u0005)"+
		"\u0000\u0000\u0096\u0097\u0003\u001e\u000f\u0000\u0097\u0098\u0003&\u0013"+
		"\u0000\u0098\u009c\u0005\u0017\u0000\u0000\u0099\u009b\u0003\u0002\u0001"+
		"\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009b\u009e\u0001\u0000\u0000"+
		"\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000"+
		"\u0000\u009d\u009f\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000"+
		"\u0000\u009f\u00a0\u0005\u0018\u0000\u0000\u00a0\u0015\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a7\u00036\u001b\u0000\u00a2\u00a3\u0003\u001a\r\u0000"+
		"\u00a3\u00a4\u00036\u001b\u0000\u00a4\u00a6\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a6\u00a9\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8"+
		"\u0017\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00aa"+
		"\u00ac\u0005\u0015\u0000\u0000\u00ab\u00ad\u0003\"\u0011\u0000\u00ac\u00ab"+
		"\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00ae"+
		"\u0001\u0000\u0000\u0000\u00ae\u00af\u0005\u0016\u0000\u0000\u00af\u0019"+
		"\u0001\u0000\u0000\u0000\u00b0\u00b1\u0007\u0000\u0000\u0000\u00b1\u001b"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b3\u0007\u0001\u0000\u0000\u00b3\u001d"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b5\u0007\u0002\u0000\u0000\u00b5\u001f"+
		"\u0001\u0000\u0000\u0000\u00b6\u00ba\u0003\u0016\u000b\u0000\u00b7\u00b8"+
		"\u0003\u001e\u000f\u0000\u00b8\u00b9\u0003\u0016\u000b\u0000\u00b9\u00bb"+
		"\u0001\u0000\u0000\u0000\u00ba\u00b7\u0001\u0000\u0000\u0000\u00ba\u00bb"+
		"\u0001\u0000\u0000\u0000\u00bb!\u0001\u0000\u0000\u0000\u00bc\u00c2\u0003"+
		" \u0010\u0000\u00bd\u00be\u0003\u001c\u000e\u0000\u00be\u00bf\u0003 \u0010"+
		"\u0000\u00bf\u00c1\u0001\u0000\u0000\u0000\u00c0\u00bd\u0001\u0000\u0000"+
		"\u0000\u00c1\u00c4\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3#\u0001\u0000\u0000\u0000"+
		"\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c5\u00cd\u0005&\u0000\u0000\u00c6"+
		"\u00cd\u0005(\u0000\u0000\u00c7\u00cd\u0005)\u0000\u0000\u00c8\u00cd\u0005"+
		"%\u0000\u0000\u00c9\u00cd\u0003\u0016\u000b\u0000\u00ca\u00cd\u0003\""+
		"\u0011\u0000\u00cb\u00cd\u0003 \u0010\u0000\u00cc\u00c5\u0001\u0000\u0000"+
		"\u0000\u00cc\u00c6\u0001\u0000\u0000\u0000\u00cc\u00c7\u0001\u0000\u0000"+
		"\u0000\u00cc\u00c8\u0001\u0000\u0000\u0000\u00cc\u00c9\u0001\u0000\u0000"+
		"\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cb\u0001\u0000\u0000"+
		"\u0000\u00cd%\u0001\u0000\u0000\u0000\u00ce\u00cf\u0003$\u0012\u0000\u00cf"+
		"\'\u0001\u0000\u0000\u0000\u00d0\u00d1\u0003\"\u0011\u0000\u00d1)\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d3\u0003.\u0017\u0000\u00d3\u00d5\u0003,\u0016"+
		"\u0000\u00d4\u00d6\u00032\u0019\u0000\u00d5\u00d4\u0001\u0000\u0000\u0000"+
		"\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6+\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d8\u0007\u0003\u0000\u0000\u00d8-\u0001\u0000\u0000\u0000\u00d9\u00da"+
		"\u0005\u0003\u0000\u0000\u00da\u00db\u0005)\u0000\u0000\u00db\u00dc\u0005"+
		"\u0011\u0000\u0000\u00dc/\u0001\u0000\u0000\u0000\u00dd\u00de\u0005)\u0000"+
		"\u0000\u00de\u00df\u0005\u0014\u0000\u0000\u00df\u00e6\u00034\u001a\u0000"+
		"\u00e0\u00e1\u0005)\u0000\u0000\u00e1\u00e2\u0003\u001a\r\u0000\u00e2"+
		"\u00e3\u0005\u0014\u0000\u0000\u00e3\u00e4\u00034\u001a\u0000\u00e4\u00e6"+
		"\u0001\u0000\u0000\u0000\u00e5\u00dd\u0001\u0000\u0000\u0000\u00e5\u00e0"+
		"\u0001\u0000\u0000\u0000\u00e61\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005"+
		"\u0014\u0000\u0000\u00e8\u00e9\u00034\u001a\u0000\u00e93\u0001\u0000\u0000"+
		"\u0000\u00ea\u00ed\u0003&\u0013\u0000\u00eb\u00ed\u00036\u001b\u0000\u00ec"+
		"\u00ea\u0001\u0000\u0000\u0000\u00ec\u00eb\u0001\u0000\u0000\u0000\u00ed"+
		"5\u0001\u0000\u0000\u0000\u00ee\u00f4\u0005)\u0000\u0000\u00ef\u00f4\u0005"+
		"%\u0000\u0000\u00f0\u00f4\u0005(\u0000\u0000\u00f1\u00f4\u0005\'\u0000"+
		"\u0000\u00f2\u00f4\u0003\u0018\f\u0000\u00f3\u00ee\u0001\u0000\u0000\u0000"+
		"\u00f3\u00ef\u0001\u0000\u0000\u0000\u00f3\u00f0\u0001\u0000\u0000\u0000"+
		"\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f3\u00f2\u0001\u0000\u0000\u0000"+
		"\u00f47\u0001\u0000\u0000\u0000\u0013<HS_ckv\u0080\u008f\u009c\u00a7\u00ac"+
		"\u00ba\u00c2\u00cc\u00d5\u00e5\u00ec\u00f3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}