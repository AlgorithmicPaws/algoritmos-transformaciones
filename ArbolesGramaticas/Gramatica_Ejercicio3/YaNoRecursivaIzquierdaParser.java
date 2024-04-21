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
		UNO=1, DOS=2, TRES=3, CUATRO=4, WS=5;
	public static final int
		RULE_s = 0, RULE_se = 1, RULE_a = 2, RULE_b = 3, RULE_c = 4;
	public static final String[] ruleNames = {
		"s", "se", "a", "b", "c"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'uno'", "'dos'", "'tres'", "'cuatro'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "UNO", "DOS", "TRES", "CUATRO", "WS"
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
		public SeContext se() {
			return getRuleContext(SeContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			a();
			setState(11);
			b();
			setState(12);
			c();
			setState(13);
			se();
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

	public static class SeContext extends ParserRuleContext {
		public TerminalNode UNO() { return getToken(YaNoRecursivaIzquierdaParser.UNO, 0); }
		public SeContext se() {
			return getRuleContext(SeContext.class,0);
		}
		public SeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_se; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YaNoRecursivaIzquierdaListener ) ((YaNoRecursivaIzquierdaListener)listener).enterSe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YaNoRecursivaIzquierdaListener ) ((YaNoRecursivaIzquierdaListener)listener).exitSe(this);
		}
	}

	public final SeContext se() throws RecognitionException {
		SeContext _localctx = new SeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_se);
		try {
			setState(18);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNO:
				enterOuterAlt(_localctx, 1);
				{
				setState(15);
				match(UNO);
				setState(16);
				se();
				}
				break;
			case EOF:
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

	public static class AContext extends ParserRuleContext {
		public TerminalNode DOS() { return getToken(YaNoRecursivaIzquierdaParser.DOS, 0); }
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
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
		enterRule(_localctx, 4, RULE_a);
		try {
			setState(25);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOS:
				enterOuterAlt(_localctx, 1);
				{
				setState(20);
				match(DOS);
				setState(21);
				b();
				setState(22);
				c();
				}
				break;
			case EOF:
			case UNO:
			case TRES:
			case CUATRO:
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

	public static class BContext extends ParserRuleContext {
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public TerminalNode TRES() { return getToken(YaNoRecursivaIzquierdaParser.TRES, 0); }
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
			setState(31);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				c();
				setState(28);
				match(TRES);
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
		public TerminalNode CUATRO() { return getToken(YaNoRecursivaIzquierdaParser.CUATRO, 0); }
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
			setState(36);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				match(CUATRO);
				setState(34);
				b();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\7)\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\5\3\25\n\3"+
		"\3\4\3\4\3\4\3\4\3\4\5\4\34\n\4\3\5\3\5\3\5\3\5\5\5\"\n\5\3\6\3\6\3\6"+
		"\5\6\'\n\6\3\6\2\2\7\2\4\6\b\n\2\2\2\'\2\f\3\2\2\2\4\24\3\2\2\2\6\33\3"+
		"\2\2\2\b!\3\2\2\2\n&\3\2\2\2\f\r\5\6\4\2\r\16\5\b\5\2\16\17\5\n\6\2\17"+
		"\20\5\4\3\2\20\3\3\2\2\2\21\22\7\3\2\2\22\25\5\4\3\2\23\25\3\2\2\2\24"+
		"\21\3\2\2\2\24\23\3\2\2\2\25\5\3\2\2\2\26\27\7\4\2\2\27\30\5\b\5\2\30"+
		"\31\5\n\6\2\31\34\3\2\2\2\32\34\3\2\2\2\33\26\3\2\2\2\33\32\3\2\2\2\34"+
		"\7\3\2\2\2\35\36\5\n\6\2\36\37\7\5\2\2\37\"\3\2\2\2 \"\3\2\2\2!\35\3\2"+
		"\2\2! \3\2\2\2\"\t\3\2\2\2#$\7\6\2\2$\'\5\b\5\2%\'\3\2\2\2&#\3\2\2\2&"+
		"%\3\2\2\2\'\13\3\2\2\2\6\24\33!&";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}