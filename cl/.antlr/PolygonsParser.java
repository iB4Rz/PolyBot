// Generated from d:\Usuario\Documentos\Universitat\2020-2021\Q1\LP\PolyBot\cl\Polygons.g by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PolygonsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, NUM=20, ID=21, R=22, G=23, MUL=24, MES=25, PAD=26, 
		EXC=27, LINE_COMMENT=28, WS=29;
	public static final int
		RULE_root = 0, RULE_expr = 1, RULE_variable = 2, RULE_operation = 3, RULE_instruction = 4, 
		RULE_coords = 5, RULE_colorRGB = 6, RULE_img = 7, RULE_text = 8, RULE_polygons = 9, 
		RULE_printPol = 10, RULE_area = 11, RULE_perimeter = 12, RULE_vertices = 13, 
		RULE_centroid = 14, RULE_color = 15, RULE_inside = 16, RULE_equal = 17, 
		RULE_draw = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "expr", "variable", "operation", "instruction", "coords", "colorRGB", 
			"img", "text", "polygons", "printPol", "area", "perimeter", "vertices", 
			"centroid", "color", "inside", "equal", "draw"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':='", "'('", "')'", "'['", "']'", "'{'", "'}'", "'\"'", "'.png\"'", 
			"','", "'print'", "'area'", "'perimeter'", "'vertices'", "'centroid'", 
			"'color'", "'inside'", "'equal'", "'draw'", null, null, null, null, "'*'", 
			"'+'", "'#'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "NUM", "ID", "R", "G", 
			"MUL", "MES", "PAD", "EXC", "LINE_COMMENT", "WS"
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
	public String getGrammarFileName() { return "Polygons.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PolygonsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RootContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PolygonsParser.EOF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(38);
				expr();
				}
				}
				setState(41); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << ID))) != 0) );
			setState(43);
			match(EOF);
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

	public static class ExprContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		try {
			setState(47);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				variable();
				}
				break;
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				instruction();
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PolygonsParser.ID, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(ID);
			setState(50);
			match(T__0);
			setState(51);
			operation(0);
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

	public static class OperationContext extends ParserRuleContext {
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public TerminalNode EXC() { return getToken(PolygonsParser.EXC, 0); }
		public TerminalNode NUM() { return getToken(PolygonsParser.NUM, 0); }
		public TerminalNode PAD() { return getToken(PolygonsParser.PAD, 0); }
		public CoordsContext coords() {
			return getRuleContext(CoordsContext.class,0);
		}
		public TerminalNode ID() { return getToken(PolygonsParser.ID, 0); }
		public TerminalNode MUL() { return getToken(PolygonsParser.MUL, 0); }
		public TerminalNode MES() { return getToken(PolygonsParser.MES, 0); }
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
	}

	public final OperationContext operation() throws RecognitionException {
		return operation(0);
	}

	private OperationContext operation(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OperationContext _localctx = new OperationContext(_ctx, _parentState);
		OperationContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_operation, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(54);
				match(T__1);
				setState(55);
				operation(0);
				setState(56);
				match(T__2);
				}
				break;
			case EXC:
				{
				setState(58);
				match(EXC);
				setState(59);
				match(NUM);
				}
				break;
			case PAD:
				{
				setState(60);
				match(PAD);
				setState(61);
				operation(5);
				}
				break;
			case T__3:
				{
				setState(62);
				coords();
				}
				break;
			case ID:
				{
				setState(63);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(74);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(72);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new OperationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(66);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(67);
						match(MUL);
						setState(68);
						operation(5);
						}
						break;
					case 2:
						{
						_localctx = new OperationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(69);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(70);
						match(MES);
						setState(71);
						operation(4);
						}
						break;
					}
					} 
				}
				setState(76);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InstructionContext extends ParserRuleContext {
		public PrintPolContext printPol() {
			return getRuleContext(PrintPolContext.class,0);
		}
		public AreaContext area() {
			return getRuleContext(AreaContext.class,0);
		}
		public PerimeterContext perimeter() {
			return getRuleContext(PerimeterContext.class,0);
		}
		public VerticesContext vertices() {
			return getRuleContext(VerticesContext.class,0);
		}
		public CentroidContext centroid() {
			return getRuleContext(CentroidContext.class,0);
		}
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public InsideContext inside() {
			return getRuleContext(InsideContext.class,0);
		}
		public EqualContext equal() {
			return getRuleContext(EqualContext.class,0);
		}
		public DrawContext draw() {
			return getRuleContext(DrawContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_instruction);
		try {
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				printPol();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				area();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
				perimeter();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 4);
				{
				setState(80);
				vertices();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 5);
				{
				setState(81);
				centroid();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 6);
				{
				setState(82);
				color();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 7);
				{
				setState(83);
				inside();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 8);
				{
				setState(84);
				equal();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 9);
				{
				setState(85);
				draw();
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

	public static class CoordsContext extends ParserRuleContext {
		public List<TerminalNode> NUM() { return getTokens(PolygonsParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(PolygonsParser.NUM, i);
		}
		public List<TerminalNode> R() { return getTokens(PolygonsParser.R); }
		public TerminalNode R(int i) {
			return getToken(PolygonsParser.R, i);
		}
		public CoordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coords; }
	}

	public final CoordsContext coords() throws RecognitionException {
		CoordsContext _localctx = new CoordsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_coords);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(T__3);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUM || _la==R) {
				{
				{
				setState(89);
				_la = _input.LA(1);
				if ( !(_la==NUM || _la==R) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(90);
				_la = _input.LA(1);
				if ( !(_la==NUM || _la==R) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96);
			match(T__4);
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

	public static class ColorRGBContext extends ParserRuleContext {
		public List<TerminalNode> NUM() { return getTokens(PolygonsParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(PolygonsParser.NUM, i);
		}
		public List<TerminalNode> R() { return getTokens(PolygonsParser.R); }
		public TerminalNode R(int i) {
			return getToken(PolygonsParser.R, i);
		}
		public ColorRGBContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colorRGB; }
	}

	public final ColorRGBContext colorRGB() throws RecognitionException {
		ColorRGBContext _localctx = new ColorRGBContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_colorRGB);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(T__5);
			setState(99);
			_la = _input.LA(1);
			if ( !(_la==NUM || _la==R) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(100);
			_la = _input.LA(1);
			if ( !(_la==NUM || _la==R) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(101);
			_la = _input.LA(1);
			if ( !(_la==NUM || _la==R) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(102);
			match(T__6);
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

	public static class ImgContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PolygonsParser.ID, 0); }
		public ImgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_img; }
	}

	public final ImgContext img() throws RecognitionException {
		ImgContext _localctx = new ImgContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_img);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(T__7);
			setState(105);
			match(ID);
			setState(106);
			match(T__8);
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

	public static class TextContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PolygonsParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PolygonsParser.ID, i);
		}
		public List<TerminalNode> G() { return getTokens(PolygonsParser.G); }
		public TerminalNode G(int i) {
			return getToken(PolygonsParser.G, i);
		}
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_text);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(T__7);
			setState(110); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(109);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==G) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(112); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID || _la==G );
			setState(114);
			match(T__7);
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

	public static class PolygonsContext extends ParserRuleContext {
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public PolygonsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_polygons; }
	}

	public final PolygonsContext polygons() throws RecognitionException {
		PolygonsContext _localctx = new PolygonsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_polygons);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(116);
			operation(0);
			}
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(117);
				match(T__9);
				setState(118);
				operation(0);
				}
				}
				setState(123);
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

	public static class PrintPolContext extends ParserRuleContext {
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public PrintPolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printPol; }
	}

	public final PrintPolContext printPol() throws RecognitionException {
		PrintPolContext _localctx = new PrintPolContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_printPol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(T__10);
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__3:
			case ID:
			case PAD:
			case EXC:
				{
				setState(125);
				operation(0);
				}
				break;
			case T__7:
				{
				setState(126);
				text();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class AreaContext extends ParserRuleContext {
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public AreaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_area; }
	}

	public final AreaContext area() throws RecognitionException {
		AreaContext _localctx = new AreaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_area);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(T__11);
			setState(130);
			operation(0);
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

	public static class PerimeterContext extends ParserRuleContext {
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public PerimeterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_perimeter; }
	}

	public final PerimeterContext perimeter() throws RecognitionException {
		PerimeterContext _localctx = new PerimeterContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_perimeter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(T__12);
			setState(133);
			operation(0);
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

	public static class VerticesContext extends ParserRuleContext {
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public VerticesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vertices; }
	}

	public final VerticesContext vertices() throws RecognitionException {
		VerticesContext _localctx = new VerticesContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_vertices);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(T__13);
			setState(136);
			operation(0);
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

	public static class CentroidContext extends ParserRuleContext {
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public CentroidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_centroid; }
	}

	public final CentroidContext centroid() throws RecognitionException {
		CentroidContext _localctx = new CentroidContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_centroid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(T__14);
			setState(139);
			operation(0);
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

	public static class ColorContext extends ParserRuleContext {
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public ColorRGBContext colorRGB() {
			return getRuleContext(ColorRGBContext.class,0);
		}
		public ColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color; }
	}

	public final ColorContext color() throws RecognitionException {
		ColorContext _localctx = new ColorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_color);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(T__15);
			setState(142);
			operation(0);
			setState(143);
			match(T__9);
			setState(144);
			colorRGB();
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

	public static class InsideContext extends ParserRuleContext {
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public InsideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inside; }
	}

	public final InsideContext inside() throws RecognitionException {
		InsideContext _localctx = new InsideContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_inside);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(T__16);
			setState(147);
			operation(0);
			setState(148);
			match(T__9);
			setState(149);
			operation(0);
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

	public static class EqualContext extends ParserRuleContext {
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public EqualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equal; }
	}

	public final EqualContext equal() throws RecognitionException {
		EqualContext _localctx = new EqualContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(T__17);
			setState(152);
			operation(0);
			setState(153);
			match(T__9);
			setState(154);
			operation(0);
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

	public static class DrawContext extends ParserRuleContext {
		public ImgContext img() {
			return getRuleContext(ImgContext.class,0);
		}
		public PolygonsContext polygons() {
			return getRuleContext(PolygonsContext.class,0);
		}
		public DrawContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_draw; }
	}

	public final DrawContext draw() throws RecognitionException {
		DrawContext _localctx = new DrawContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_draw);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(T__18);
			setState(157);
			img();
			setState(158);
			match(T__9);
			setState(159);
			polygons();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return operation_sempred((OperationContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean operation_sempred(OperationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\u00a4\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\6\2*\n\2\r\2\16\2+\3\2\3\2\3\3\3\3\5\3\62\n\3"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5C\n\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\7\5K\n\5\f\5\16\5N\13\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\5\6Y\n\6\3\7\3\7\3\7\7\7^\n\7\f\7\16\7a\13\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\6\nq\n\n\r\n\16\nr\3\n"+
		"\3\n\3\13\3\13\3\13\7\13z\n\13\f\13\16\13}\13\13\3\f\3\f\3\f\5\f\u0082"+
		"\n\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\2\3\b\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&\2\4\4\2\26\26\30\30\4\2\27\27\31\31\2\u00a4\2)\3\2\2\2\4\61\3"+
		"\2\2\2\6\63\3\2\2\2\bB\3\2\2\2\nX\3\2\2\2\fZ\3\2\2\2\16d\3\2\2\2\20j\3"+
		"\2\2\2\22n\3\2\2\2\24v\3\2\2\2\26~\3\2\2\2\30\u0083\3\2\2\2\32\u0086\3"+
		"\2\2\2\34\u0089\3\2\2\2\36\u008c\3\2\2\2 \u008f\3\2\2\2\"\u0094\3\2\2"+
		"\2$\u0099\3\2\2\2&\u009e\3\2\2\2(*\5\4\3\2)(\3\2\2\2*+\3\2\2\2+)\3\2\2"+
		"\2+,\3\2\2\2,-\3\2\2\2-.\7\2\2\3.\3\3\2\2\2/\62\5\6\4\2\60\62\5\n\6\2"+
		"\61/\3\2\2\2\61\60\3\2\2\2\62\5\3\2\2\2\63\64\7\27\2\2\64\65\7\3\2\2\65"+
		"\66\5\b\5\2\66\7\3\2\2\2\678\b\5\1\289\7\4\2\29:\5\b\5\2:;\7\5\2\2;C\3"+
		"\2\2\2<=\7\35\2\2=C\7\26\2\2>?\7\34\2\2?C\5\b\5\7@C\5\f\7\2AC\7\27\2\2"+
		"B\67\3\2\2\2B<\3\2\2\2B>\3\2\2\2B@\3\2\2\2BA\3\2\2\2CL\3\2\2\2DE\f\6\2"+
		"\2EF\7\32\2\2FK\5\b\5\7GH\f\5\2\2HI\7\33\2\2IK\5\b\5\6JD\3\2\2\2JG\3\2"+
		"\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\t\3\2\2\2NL\3\2\2\2OY\5\26\f\2PY\5"+
		"\30\r\2QY\5\32\16\2RY\5\34\17\2SY\5\36\20\2TY\5 \21\2UY\5\"\22\2VY\5$"+
		"\23\2WY\5&\24\2XO\3\2\2\2XP\3\2\2\2XQ\3\2\2\2XR\3\2\2\2XS\3\2\2\2XT\3"+
		"\2\2\2XU\3\2\2\2XV\3\2\2\2XW\3\2\2\2Y\13\3\2\2\2Z_\7\6\2\2[\\\t\2\2\2"+
		"\\^\t\2\2\2][\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`b\3\2\2\2a_\3\2\2"+
		"\2bc\7\7\2\2c\r\3\2\2\2de\7\b\2\2ef\t\2\2\2fg\t\2\2\2gh\t\2\2\2hi\7\t"+
		"\2\2i\17\3\2\2\2jk\7\n\2\2kl\7\27\2\2lm\7\13\2\2m\21\3\2\2\2np\7\n\2\2"+
		"oq\t\3\2\2po\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2st\3\2\2\2tu\7\n\2\2"+
		"u\23\3\2\2\2v{\5\b\5\2wx\7\f\2\2xz\5\b\5\2yw\3\2\2\2z}\3\2\2\2{y\3\2\2"+
		"\2{|\3\2\2\2|\25\3\2\2\2}{\3\2\2\2~\u0081\7\r\2\2\177\u0082\5\b\5\2\u0080"+
		"\u0082\5\22\n\2\u0081\177\3\2\2\2\u0081\u0080\3\2\2\2\u0082\27\3\2\2\2"+
		"\u0083\u0084\7\16\2\2\u0084\u0085\5\b\5\2\u0085\31\3\2\2\2\u0086\u0087"+
		"\7\17\2\2\u0087\u0088\5\b\5\2\u0088\33\3\2\2\2\u0089\u008a\7\20\2\2\u008a"+
		"\u008b\5\b\5\2\u008b\35\3\2\2\2\u008c\u008d\7\21\2\2\u008d\u008e\5\b\5"+
		"\2\u008e\37\3\2\2\2\u008f\u0090\7\22\2\2\u0090\u0091\5\b\5\2\u0091\u0092"+
		"\7\f\2\2\u0092\u0093\5\16\b\2\u0093!\3\2\2\2\u0094\u0095\7\23\2\2\u0095"+
		"\u0096\5\b\5\2\u0096\u0097\7\f\2\2\u0097\u0098\5\b\5\2\u0098#\3\2\2\2"+
		"\u0099\u009a\7\24\2\2\u009a\u009b\5\b\5\2\u009b\u009c\7\f\2\2\u009c\u009d"+
		"\5\b\5\2\u009d%\3\2\2\2\u009e\u009f\7\25\2\2\u009f\u00a0\5\20\t\2\u00a0"+
		"\u00a1\7\f\2\2\u00a1\u00a2\5\24\13\2\u00a2\'\3\2\2\2\f+\61BJLX_r{\u0081";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}