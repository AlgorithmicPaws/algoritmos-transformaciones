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
		DOS=1, CUATRO=2, SEIS=3, UNO=4, TRES=5, CINCO=6, WS=7;
	public static final int
		RULE_s = 0, RULE_a = 1, RULE_be = 2, RULE_b = 3, RULE_c = 4, RULE_d = 5, 
		RULE_e = 6;
	public static final String[] ruleNames = {
		"s", "a", "be", "b", "c", "d", "e"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'dos'", "'cuatro'", "'seis'", "'uno'", "'tres'", "'cinco'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "DOS", "CUATRO", "SEIS", "UNO", "TRES", "CINCO", "WS"
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
		public AContext a() {
			return getRuleContext(AContext.class,0);
		}
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public DContext d() {
			return getRuleContext(DContext.class,0);
		}
		public EContext e() {
			return getRuleContext(EContext.class,0);
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
			setState(21);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case DOS:
			case SEIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(14);
				a();
				setState(15);
				b();
				setState(16);
				c();
				}
				break;
			case UNO:
			case TRES:
				enterOuterAlt(_localctx, 2);
				{
				setState(18);
				d();
				setState(19);
				e();
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

	public static class AContext extends ParserRuleContext {
		public TerminalNode DOS() { return getToken(YaNoRecursivaIzquierdaParser.DOS, 0); }
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public TerminalNode TRES() { return getToken(YaNoRecursivaIzquierdaParser.TRES, 0); }
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
			setState(28);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOS:
				enterOuterAlt(_localctx, 1);
				{
				setState(23);
				match(DOS);
				setState(24);
				b();
				setState(25);
				match(TRES);
				}
				break;
			case EOF:
			case SEIS:
			case TRES:
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

	public static class BeContext extends ParserRuleContext {
		public TerminalNode CUATRO() { return getToken(YaNoRecursivaIzquierdaParser.CUATRO, 0); }
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public TerminalNode CINCO() { return getToken(YaNoRecursivaIzquierdaParser.CINCO, 0); }
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
		enterRule(_localctx, 4, RULE_be);
		try {
			setState(36);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				match(CUATRO);
				setState(31);
				c();
				setState(32);
				match(CINCO);
				setState(33);
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

	public static class BContext extends ParserRuleContext {
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
		enterRule(_localctx, 6, RULE_b);
		try {
			enterOuterAlt(_localctx, 1);
			{
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
		public TerminalNode SEIS() { return getToken(YaNoRecursivaIzquierdaParser.SEIS, 0); }
		public AContext a() {
			return getRuleContext(AContext.class,0);
		}
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
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				match(SEIS);
				setState(41);
				a();
				setState(42);
				b();
				}
				break;
			case EOF:
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

	public static class DContext extends ParserRuleContext {
		public TerminalNode UNO() { return getToken(YaNoRecursivaIzquierdaParser.UNO, 0); }
		public AContext a() {
			return getRuleContext(AContext.class,0);
		}
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public DContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_d; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YaNoRecursivaIzquierdaListener ) ((YaNoRecursivaIzquierdaListener)listener).enterD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YaNoRecursivaIzquierdaListener ) ((YaNoRecursivaIzquierdaListener)listener).exitD(this);
		}
	}

	public final DContext d() throws RecognitionException {
		DContext _localctx = new DContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_d);
		try {
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNO:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				match(UNO);
				setState(48);
				a();
				setState(49);
				e();
				}
				break;
			case TRES:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				b();
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

	public static class EContext extends ParserRuleContext {
		public TerminalNode TRES() { return getToken(YaNoRecursivaIzquierdaParser.TRES, 0); }
		public EContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YaNoRecursivaIzquierdaListener ) ((YaNoRecursivaIzquierdaListener)listener).enterE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YaNoRecursivaIzquierdaListener ) ((YaNoRecursivaIzquierdaListener)listener).exitE(this);
		}
	}

	public final EContext e() throws RecognitionException {
		EContext _localctx = new EContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_e);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(TRES);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\t;\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\5\2\30\n\2\3\3\3\3\3\3\3\3\3\3\5\3\37\n\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4"+
		"\'\n\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6\60\n\6\3\7\3\7\3\7\3\7\3\7\5\7"+
		"\67\n\7\3\b\3\b\3\b\2\2\t\2\4\6\b\n\f\16\2\2\28\2\27\3\2\2\2\4\36\3\2"+
		"\2\2\6&\3\2\2\2\b(\3\2\2\2\n/\3\2\2\2\f\66\3\2\2\2\168\3\2\2\2\20\21\5"+
		"\4\3\2\21\22\5\b\5\2\22\23\5\n\6\2\23\30\3\2\2\2\24\25\5\f\7\2\25\26\5"+
		"\16\b\2\26\30\3\2\2\2\27\20\3\2\2\2\27\24\3\2\2\2\30\3\3\2\2\2\31\32\7"+
		"\3\2\2\32\33\5\b\5\2\33\34\7\7\2\2\34\37\3\2\2\2\35\37\3\2\2\2\36\31\3"+
		"\2\2\2\36\35\3\2\2\2\37\5\3\2\2\2 !\7\4\2\2!\"\5\n\6\2\"#\7\b\2\2#$\5"+
		"\6\4\2$\'\3\2\2\2%\'\3\2\2\2& \3\2\2\2&%\3\2\2\2\'\7\3\2\2\2()\3\2\2\2"+
		")\t\3\2\2\2*+\7\5\2\2+,\5\4\3\2,-\5\b\5\2-\60\3\2\2\2.\60\3\2\2\2/*\3"+
		"\2\2\2/.\3\2\2\2\60\13\3\2\2\2\61\62\7\6\2\2\62\63\5\4\3\2\63\64\5\16"+
		"\b\2\64\67\3\2\2\2\65\67\5\b\5\2\66\61\3\2\2\2\66\65\3\2\2\2\67\r\3\2"+
		"\2\289\7\7\2\29\17\3\2\2\2\7\27\36&/\66";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}