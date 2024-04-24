// Generated from YaNoRecursivaIzquierda.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class YaNoRecursivaIzquierdaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		UNO=1, DOS=2, TRES=3, CUATRO=4, SEIS=5, SIETE=6, CINCO=7, WS=8;
	public static final int
		RULE_s = 0, RULE_a = 1, RULE_b = 2, RULE_be = 3, RULE_c = 4;
	public static final String[] ruleNames = {
		"s", "a", "b", "be", "c"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'uno'", "'dos'", "'tres'", "'cuatro'", "'seis'", "'siete'", "'cinco'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "UNO", "DOS", "TRES", "CUATRO", "SEIS", "SIETE", "CINCO", "WS"
	};
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
	public String getGrammarFileName() { return "YaNoRecursivaIzquierda.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public YaNoRecursivaIzquierdaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SContext extends ParserRuleContext {
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public TerminalNode UNO() { return getToken(YaNoRecursivaIzquierdaParser.UNO, 0); }
		public TerminalNode DOS() { return getToken(YaNoRecursivaIzquierdaParser.DOS, 0); }
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YaNoRecursivaIzquierdaListener ) ((YaNoRecursivaIzquierdaListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YaNoRecursivaIzquierdaListener ) ((YaNoRecursivaIzquierdaListener)listener).exitS(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		try {
			setState(16);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(10);
				b();
				setState(11);
				match(UNO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(13);
				match(DOS);
				setState(14);
				c();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class AContext extends ParserRuleContext {
		public List<BContext> b() {
			return getRuleContexts(BContext.class);
		}
		public BContext b(int i) {
			return getRuleContext(BContext.class,i);
		}
		public TerminalNode UNO() { return getToken(YaNoRecursivaIzquierdaParser.UNO, 0); }
		public TerminalNode TRES() { return getToken(YaNoRecursivaIzquierdaParser.TRES, 0); }
		public List<CContext> c() {
			return getRuleContexts(CContext.class);
		}
		public CContext c(int i) {
			return getRuleContext(CContext.class,i);
		}
		public TerminalNode DOS() { return getToken(YaNoRecursivaIzquierdaParser.DOS, 0); }
		public TerminalNode CUATRO() { return getToken(YaNoRecursivaIzquierdaParser.CUATRO, 0); }
		public AContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YaNoRecursivaIzquierdaListener ) ((YaNoRecursivaIzquierdaListener)listener).enterA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YaNoRecursivaIzquierdaListener ) ((YaNoRecursivaIzquierdaListener)listener).exitA(this);
		}
	}

	public final AContext a() throws RecognitionException {
		AContext _localctx = new AContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_a);
		try {
			setState(36);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				b();
				setState(19);
				match(UNO);
				setState(20);
				match(TRES);
				setState(21);
				b();
				setState(22);
				c();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(24);
				match(DOS);
				setState(25);
				c();
				setState(26);
				match(TRES);
				setState(27);
				b();
				setState(28);
				c();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(30);
				match(TRES);
				setState(31);
				b();
				setState(32);
				c();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(34);
				match(CUATRO);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
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

	public static class BContext extends ParserRuleContext {
		public TerminalNode DOS() { return getToken(YaNoRecursivaIzquierdaParser.DOS, 0); }
		public List<CContext> c() {
			return getRuleContexts(CContext.class);
		}
		public CContext c(int i) {
			return getRuleContext(CContext.class,i);
		}
		public TerminalNode TRES() { return getToken(YaNoRecursivaIzquierdaParser.TRES, 0); }
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public TerminalNode CINCO() { return getToken(YaNoRecursivaIzquierdaParser.CINCO, 0); }
		public TerminalNode SEIS() { return getToken(YaNoRecursivaIzquierdaParser.SEIS, 0); }
		public BeContext be() {
			return getRuleContext(BeContext.class,0);
		}
		public TerminalNode CUATRO() { return getToken(YaNoRecursivaIzquierdaParser.CUATRO, 0); }
		public BContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_b; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YaNoRecursivaIzquierdaListener ) ((YaNoRecursivaIzquierdaListener)listener).enterB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YaNoRecursivaIzquierdaListener ) ((YaNoRecursivaIzquierdaListener)listener).exitB(this);
		}
	}

	public final BContext b() throws RecognitionException {
		BContext _localctx = new BContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_b);
		try {
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				match(DOS);
				setState(39);
				c();
				setState(40);
				match(TRES);
				setState(41);
				b();
				setState(42);
				c();
				setState(43);
				match(CINCO);
				setState(44);
				c();
				setState(45);
				match(SEIS);
				setState(46);
				be();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				match(TRES);
				setState(49);
				b();
				setState(50);
				c();
				setState(51);
				match(CINCO);
				setState(52);
				c();
				setState(53);
				match(SEIS);
				setState(54);
				be();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				match(CUATRO);
				setState(57);
				match(CINCO);
				setState(58);
				c();
				setState(59);
				match(SEIS);
				setState(60);
				be();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(62);
				match(CINCO);
				setState(63);
				c();
				setState(64);
				match(SEIS);
				setState(65);
				be();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
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

	public static class BeContext extends ParserRuleContext {
		public TerminalNode UNO() { return getToken(YaNoRecursivaIzquierdaParser.UNO, 0); }
		public TerminalNode TRES() { return getToken(YaNoRecursivaIzquierdaParser.TRES, 0); }
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public List<CContext> c() {
			return getRuleContexts(CContext.class);
		}
		public CContext c(int i) {
			return getRuleContext(CContext.class,i);
		}
		public TerminalNode CINCO() { return getToken(YaNoRecursivaIzquierdaParser.CINCO, 0); }
		public TerminalNode SEIS() { return getToken(YaNoRecursivaIzquierdaParser.SEIS, 0); }
		public BeContext be() {
			return getRuleContext(BeContext.class,0);
		}
		public BeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_be; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YaNoRecursivaIzquierdaListener ) ((YaNoRecursivaIzquierdaListener)listener).enterBe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YaNoRecursivaIzquierdaListener ) ((YaNoRecursivaIzquierdaListener)listener).exitBe(this);
		}
	}

	public final BeContext be() throws RecognitionException {
		BeContext _localctx = new BeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_be);
		try {
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				match(UNO);
				setState(71);
				match(TRES);
				setState(72);
				b();
				setState(73);
				c();
				setState(74);
				match(CINCO);
				setState(75);
				c();
				setState(76);
				match(SEIS);
				setState(77);
				be();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class CContext extends ParserRuleContext {
		public TerminalNode SIETE() { return getToken(YaNoRecursivaIzquierdaParser.SIETE, 0); }
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public CContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YaNoRecursivaIzquierdaListener ) ((YaNoRecursivaIzquierdaListener)listener).enterC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YaNoRecursivaIzquierdaListener ) ((YaNoRecursivaIzquierdaListener)listener).exitC(this);
		}
	}

	public final CContext c() throws RecognitionException {
		CContext _localctx = new CContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_c);
		try {
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIETE:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				match(SIETE);
				setState(83);
				b();
				}
				break;
			case EOF:
			case TRES:
			case SEIS:
			case CINCO:
				enterOuterAlt(_localctx, 2);
				{
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\nZ\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\3\2\3\2\5\2\23\n\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\'"+
		"\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4G\n\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5S\n\5\3\6\3\6\3\6\5\6X\n\6\3\6\2"+
		"\2\7\2\4\6\b\n\2\2\2`\2\22\3\2\2\2\4&\3\2\2\2\6F\3\2\2\2\bR\3\2\2\2\n"+
		"W\3\2\2\2\f\r\5\6\4\2\r\16\7\3\2\2\16\23\3\2\2\2\17\20\7\4\2\2\20\23\5"+
		"\n\6\2\21\23\3\2\2\2\22\f\3\2\2\2\22\17\3\2\2\2\22\21\3\2\2\2\23\3\3\2"+
		"\2\2\24\25\5\6\4\2\25\26\7\3\2\2\26\27\7\5\2\2\27\30\5\6\4\2\30\31\5\n"+
		"\6\2\31\'\3\2\2\2\32\33\7\4\2\2\33\34\5\n\6\2\34\35\7\5\2\2\35\36\5\6"+
		"\4\2\36\37\5\n\6\2\37\'\3\2\2\2 !\7\5\2\2!\"\5\6\4\2\"#\5\n\6\2#\'\3\2"+
		"\2\2$\'\7\6\2\2%\'\3\2\2\2&\24\3\2\2\2&\32\3\2\2\2& \3\2\2\2&$\3\2\2\2"+
		"&%\3\2\2\2\'\5\3\2\2\2()\7\4\2\2)*\5\n\6\2*+\7\5\2\2+,\5\6\4\2,-\5\n\6"+
		"\2-.\7\t\2\2./\5\n\6\2/\60\7\7\2\2\60\61\5\b\5\2\61G\3\2\2\2\62\63\7\5"+
		"\2\2\63\64\5\6\4\2\64\65\5\n\6\2\65\66\7\t\2\2\66\67\5\n\6\2\678\7\7\2"+
		"\289\5\b\5\29G\3\2\2\2:;\7\6\2\2;<\7\t\2\2<=\5\n\6\2=>\7\7\2\2>?\5\b\5"+
		"\2?G\3\2\2\2@A\7\t\2\2AB\5\n\6\2BC\7\7\2\2CD\5\b\5\2DG\3\2\2\2EG\3\2\2"+
		"\2F(\3\2\2\2F\62\3\2\2\2F:\3\2\2\2F@\3\2\2\2FE\3\2\2\2G\7\3\2\2\2HI\7"+
		"\3\2\2IJ\7\5\2\2JK\5\6\4\2KL\5\n\6\2LM\7\t\2\2MN\5\n\6\2NO\7\7\2\2OP\5"+
		"\b\5\2PS\3\2\2\2QS\3\2\2\2RH\3\2\2\2RQ\3\2\2\2S\t\3\2\2\2TU\7\b\2\2UX"+
		"\5\6\4\2VX\3\2\2\2WT\3\2\2\2WV\3\2\2\2X\13\3\2\2\2\7\22&FRW";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}