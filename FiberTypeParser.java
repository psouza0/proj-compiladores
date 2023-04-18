// Generated from FiberType.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class FiberTypeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, NUMBER=12, SPACES=13, INT=14;
	public static final int
		RULE_distance = 0, RULE_fiberType = 1, RULE_opticalComponent = 2, RULE_fibertypeSelection = 3, 
		RULE_opticalComponentAddition = 4, RULE_distanceAndFiberTypeSelection = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"distance", "fiberType", "opticalComponent", "fibertypeSelection", "opticalComponentAddition", 
			"distanceAndFiberTypeSelection"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'A'", "'B'", "'C'", "'D'", "'OADM'", "'ROADM'", "'Use fiber type'", 
			"'Add'", "'every'", "'km'", "'for distances up to'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"NUMBER", "SPACES", "INT"
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
	public String getGrammarFileName() { return "FiberType.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FiberTypeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DistanceContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(FiberTypeParser.NUMBER, 0); }
		public DistanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distance; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiberTypeListener ) ((FiberTypeListener)listener).enterDistance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiberTypeListener ) ((FiberTypeListener)listener).exitDistance(this);
		}
	}

	public final DistanceContext distance() throws RecognitionException {
		DistanceContext _localctx = new DistanceContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_distance);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			match(NUMBER);
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
	public static class FiberTypeContext extends ParserRuleContext {
		public FiberTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fiberType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiberTypeListener ) ((FiberTypeListener)listener).enterFiberType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiberTypeListener ) ((FiberTypeListener)listener).exitFiberType(this);
		}
	}

	public final FiberTypeContext fiberType() throws RecognitionException {
		FiberTypeContext _localctx = new FiberTypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_fiberType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 30L) != 0)) ) {
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
	public static class OpticalComponentContext extends ParserRuleContext {
		public OpticalComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opticalComponent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiberTypeListener ) ((FiberTypeListener)listener).enterOpticalComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiberTypeListener ) ((FiberTypeListener)listener).exitOpticalComponent(this);
		}
	}

	public final OpticalComponentContext opticalComponent() throws RecognitionException {
		OpticalComponentContext _localctx = new OpticalComponentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_opticalComponent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			_la = _input.LA(1);
			if ( !(_la==T__4 || _la==T__5) ) {
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
	public static class FibertypeSelectionContext extends ParserRuleContext {
		public FiberTypeContext fiberType() {
			return getRuleContext(FiberTypeContext.class,0);
		}
		public FibertypeSelectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fibertypeSelection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiberTypeListener ) ((FiberTypeListener)listener).enterFibertypeSelection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiberTypeListener ) ((FiberTypeListener)listener).exitFibertypeSelection(this);
		}
	}

	public final FibertypeSelectionContext fibertypeSelection() throws RecognitionException {
		FibertypeSelectionContext _localctx = new FibertypeSelectionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fibertypeSelection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(T__6);
			setState(19);
			fiberType();
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
	public static class OpticalComponentAdditionContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(FiberTypeParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(FiberTypeParser.NUMBER, i);
		}
		public OpticalComponentContext opticalComponent() {
			return getRuleContext(OpticalComponentContext.class,0);
		}
		public OpticalComponentAdditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opticalComponentAddition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiberTypeListener ) ((FiberTypeListener)listener).enterOpticalComponentAddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiberTypeListener ) ((FiberTypeListener)listener).exitOpticalComponentAddition(this);
		}
	}

	public final OpticalComponentAdditionContext opticalComponentAddition() throws RecognitionException {
		OpticalComponentAdditionContext _localctx = new OpticalComponentAdditionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_opticalComponentAddition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			match(T__7);
			setState(22);
			match(NUMBER);
			setState(23);
			opticalComponent();
			setState(24);
			match(T__8);
			setState(25);
			match(NUMBER);
			setState(26);
			match(T__9);
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
	public static class DistanceAndFiberTypeSelectionContext extends ParserRuleContext {
		public FibertypeSelectionContext fibertypeSelection() {
			return getRuleContext(FibertypeSelectionContext.class,0);
		}
		public DistanceContext distance() {
			return getRuleContext(DistanceContext.class,0);
		}
		public OpticalComponentAdditionContext opticalComponentAddition() {
			return getRuleContext(OpticalComponentAdditionContext.class,0);
		}
		public DistanceAndFiberTypeSelectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distanceAndFiberTypeSelection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FiberTypeListener ) ((FiberTypeListener)listener).enterDistanceAndFiberTypeSelection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FiberTypeListener ) ((FiberTypeListener)listener).exitDistanceAndFiberTypeSelection(this);
		}
	}

	public final DistanceAndFiberTypeSelectionContext distanceAndFiberTypeSelection() throws RecognitionException {
		DistanceAndFiberTypeSelectionContext _localctx = new DistanceAndFiberTypeSelectionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_distanceAndFiberTypeSelection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			fibertypeSelection();
			setState(29);
			match(T__10);
			setState(30);
			distance();
			setState(31);
			match(T__9);
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(32);
				opticalComponentAddition();
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

	public static final String _serializedATN =
		"\u0004\u0001\u000e$\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\"\b"+
		"\u0005\u0001\u0005\u0000\u0000\u0006\u0000\u0002\u0004\u0006\b\n\u0000"+
		"\u0002\u0001\u0000\u0001\u0004\u0001\u0000\u0005\u0006\u001e\u0000\f\u0001"+
		"\u0000\u0000\u0000\u0002\u000e\u0001\u0000\u0000\u0000\u0004\u0010\u0001"+
		"\u0000\u0000\u0000\u0006\u0012\u0001\u0000\u0000\u0000\b\u0015\u0001\u0000"+
		"\u0000\u0000\n\u001c\u0001\u0000\u0000\u0000\f\r\u0005\f\u0000\u0000\r"+
		"\u0001\u0001\u0000\u0000\u0000\u000e\u000f\u0007\u0000\u0000\u0000\u000f"+
		"\u0003\u0001\u0000\u0000\u0000\u0010\u0011\u0007\u0001\u0000\u0000\u0011"+
		"\u0005\u0001\u0000\u0000\u0000\u0012\u0013\u0005\u0007\u0000\u0000\u0013"+
		"\u0014\u0003\u0002\u0001\u0000\u0014\u0007\u0001\u0000\u0000\u0000\u0015"+
		"\u0016\u0005\b\u0000\u0000\u0016\u0017\u0005\f\u0000\u0000\u0017\u0018"+
		"\u0003\u0004\u0002\u0000\u0018\u0019\u0005\t\u0000\u0000\u0019\u001a\u0005"+
		"\f\u0000\u0000\u001a\u001b\u0005\n\u0000\u0000\u001b\t\u0001\u0000\u0000"+
		"\u0000\u001c\u001d\u0003\u0006\u0003\u0000\u001d\u001e\u0005\u000b\u0000"+
		"\u0000\u001e\u001f\u0003\u0000\u0000\u0000\u001f!\u0005\n\u0000\u0000"+
		" \"\u0003\b\u0004\u0000! \u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000"+
		"\u0000\"\u000b\u0001\u0000\u0000\u0000\u0001!";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}