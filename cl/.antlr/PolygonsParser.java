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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, NUM=23, ID=24, R=25, 
		G=26, MUL=27, MES=28, PAD=29, EXC=30, LINE_COMMENT=31, WS=32;
	public static final int
		RULE_root = 0, RULE_expr = 1, RULE_variable = 2, RULE_operation = 3, RULE_instruction = 4, 
		RULE_coords = 5, RULE_colorRGB = 6, RULE_img = 7, RULE_text = 8, RULE_polygons = 9, 
		RULE_printPol = 10, RULE_area = 11, RULE_perimeter = 12, RULE_vertices = 13, 
		RULE_centroid = 14, RULE_color = 15, RULE_inside = 16, RULE_equal = 17, 
		RULE_regular = 18, RULE_draw = 19, RULE_paint = 20, RULE_unpaint = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "expr", "variable", "operation", "instruction", "coords", "colorRGB", 
			"img", "text", "polygons", "printPol", "area", "perimeter", "vertices", 
			"centroid", "color", "inside", "equal", "regular", "draw", "paint", "unpaint"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':='", "'('", "')'", "'['", "']'", "'{'", "'}'", "'\"'", "'.png\"'", 
			"','", "'print'", "'area'", "'perimeter'", "'vertices'", "'centroid'", 
			"'color'", "'inside'", "'equal'", "'regular'", "'draw'", "'paint'", "'unpaint'", 
			null, null, null, null, "'*'", "'+'", "'#'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "NUM", 
			"ID", "R", "G", "MUL", "MES", "PAD", "EXC", "LINE_COMMENT", "WS"
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
			setState(45); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(44);
				expr();
				}
				}
				setState(47); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << ID))) != 0) );
			setState(49);
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
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
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
			case T__19:
			case T__20:
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
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
			setState(55);
			match(ID);
			setState(56);
			match(T__0);
			setState(57);
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
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(60);
				match(T__1);
				setState(61);
				operation(0);
				setState(62);
				match(T__2);
				}
				break;
			case EXC:
				{
				setState(64);
				match(EXC);
				setState(65);
				match(NUM);
				}
				break;
			case PAD:
				{
				setState(66);
				match(PAD);
				setState(67);
				operation(5);
				}
				break;
			case T__3:
				{
				setState(68);
				coords();
				}
				break;
			case ID:
				{
				setState(69);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(80);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(78);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new OperationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(72);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(73);
						match(MUL);
						setState(74);
						operation(5);
						}
						break;
					case 2:
						{
						_localctx = new OperationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(75);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(76);
						match(MES);
						setState(77);
						operation(4);
						}
						break;
					}
					} 
				}
				setState(82);
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
		public RegularContext regular() {
			return getRuleContext(RegularContext.class,0);
		}
		public DrawContext draw() {
			return getRuleContext(DrawContext.class,0);
		}
		public PaintContext paint() {
			return getRuleContext(PaintContext.class,0);
		}
		public UnpaintContext unpaint() {
			return getRuleContext(UnpaintContext.class,0);
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
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				printPol();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				area();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
				perimeter();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 4);
				{
				setState(86);
				vertices();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 5);
				{
				setState(87);
				centroid();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 6);
				{
				setState(88);
				color();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 7);
				{
				setState(89);
				inside();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 8);
				{
				setState(90);
				equal();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 9);
				{
				setState(91);
				regular();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 10);
				{
				setState(92);
				draw();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 11);
				{
				setState(93);
				paint();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 12);
				{
				setState(94);
				unpaint();
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
			setState(97);
			match(T__3);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUM || _la==R) {
				{
				{
				setState(98);
				_la = _input.LA(1);
				if ( !(_la==NUM || _la==R) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
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
			setState(107);
			match(T__5);
			setState(108);
			_la = _input.LA(1);
			if ( !(_la==NUM || _la==R) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(109);
			_la = _input.LA(1);
			if ( !(_la==NUM || _la==R) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(110);
			_la = _input.LA(1);
			if ( !(_la==NUM || _la==R) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(111);
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
			setState(113);
			match(T__7);
			setState(114);
			match(ID);
			setState(115);
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
			setState(117);
			match(T__7);
			setState(119); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(118);
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
				setState(121); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID || _la==G );
			setState(123);
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
			setState(125);
			operation(0);
			}
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(126);
				match(T__9);
				setState(127);
				operation(0);
				}
				}
				setState(132);
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
			setState(133);
			match(T__10);
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__3:
			case ID:
			case PAD:
			case EXC:
				{
				setState(134);
				operation(0);
				}
				break;
			case T__7:
				{
				setState(135);
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
			setState(138);
			match(T__11);
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
			setState(141);
			match(T__12);
			setState(142);
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
			setState(144);
			match(T__13);
			setState(145);
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
			setState(147);
			match(T__14);
			setState(148);
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
			setState(150);
			match(T__15);
			setState(151);
			operation(0);
			setState(152);
			match(T__9);
			setState(153);
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
			setState(155);
			match(T__16);
			setState(156);
			operation(0);
			setState(157);
			match(T__9);
			setState(158);
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
			setState(160);
			match(T__17);
			setState(161);
			operation(0);
			setState(162);
			match(T__9);
			setState(163);
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

	public static class RegularContext extends ParserRuleContext {
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public RegularContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regular; }
	}

	public final RegularContext regular() throws RecognitionException {
		RegularContext _localctx = new RegularContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_regular);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(T__18);
			setState(166);
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
		enterRule(_localctx, 38, RULE_draw);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(T__19);
			setState(169);
			img();
			setState(170);
			match(T__9);
			setState(171);
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

	public static class PaintContext extends ParserRuleContext {
		public PolygonsContext polygons() {
			return getRuleContext(PolygonsContext.class,0);
		}
		public PaintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paint; }
	}

	public final PaintContext paint() throws RecognitionException {
		PaintContext _localctx = new PaintContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_paint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(T__20);
			setState(174);
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

	public static class UnpaintContext extends ParserRuleContext {
		public PolygonsContext polygons() {
			return getRuleContext(PolygonsContext.class,0);
		}
		public UnpaintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unpaint; }
	}

	public final UnpaintContext unpaint() throws RecognitionException {
		UnpaintContext _localctx = new UnpaintContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_unpaint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(T__21);
			setState(177);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u00b6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\6\2\60\n\2\r\2"+
		"\16\2\61\3\2\3\2\3\3\3\3\5\38\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\5\5I\n\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5Q\n\5\f\5"+
		"\16\5T\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6b\n\6\3"+
		"\7\3\7\3\7\7\7g\n\7\f\7\16\7j\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\6\nz\n\n\r\n\16\n{\3\n\3\n\3\13\3\13\3\13\7\13\u0083"+
		"\n\13\f\13\16\13\u0086\13\13\3\f\3\f\3\f\5\f\u008b\n\f\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\2\3\b\30\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\4\4\2\31\31\33\33\4\2\32\32\34"+
		"\34\2\u00b6\2/\3\2\2\2\4\67\3\2\2\2\69\3\2\2\2\bH\3\2\2\2\na\3\2\2\2\f"+
		"c\3\2\2\2\16m\3\2\2\2\20s\3\2\2\2\22w\3\2\2\2\24\177\3\2\2\2\26\u0087"+
		"\3\2\2\2\30\u008c\3\2\2\2\32\u008f\3\2\2\2\34\u0092\3\2\2\2\36\u0095\3"+
		"\2\2\2 \u0098\3\2\2\2\"\u009d\3\2\2\2$\u00a2\3\2\2\2&\u00a7\3\2\2\2(\u00aa"+
		"\3\2\2\2*\u00af\3\2\2\2,\u00b2\3\2\2\2.\60\5\4\3\2/.\3\2\2\2\60\61\3\2"+
		"\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\63\3\2\2\2\63\64\7\2\2\3\64\3\3\2\2"+
		"\2\658\5\6\4\2\668\5\n\6\2\67\65\3\2\2\2\67\66\3\2\2\28\5\3\2\2\29:\7"+
		"\32\2\2:;\7\3\2\2;<\5\b\5\2<\7\3\2\2\2=>\b\5\1\2>?\7\4\2\2?@\5\b\5\2@"+
		"A\7\5\2\2AI\3\2\2\2BC\7 \2\2CI\7\31\2\2DE\7\37\2\2EI\5\b\5\7FI\5\f\7\2"+
		"GI\7\32\2\2H=\3\2\2\2HB\3\2\2\2HD\3\2\2\2HF\3\2\2\2HG\3\2\2\2IR\3\2\2"+
		"\2JK\f\6\2\2KL\7\35\2\2LQ\5\b\5\7MN\f\5\2\2NO\7\36\2\2OQ\5\b\5\6PJ\3\2"+
		"\2\2PM\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\t\3\2\2\2TR\3\2\2\2Ub\5"+
		"\26\f\2Vb\5\30\r\2Wb\5\32\16\2Xb\5\34\17\2Yb\5\36\20\2Zb\5 \21\2[b\5\""+
		"\22\2\\b\5$\23\2]b\5&\24\2^b\5(\25\2_b\5*\26\2`b\5,\27\2aU\3\2\2\2aV\3"+
		"\2\2\2aW\3\2\2\2aX\3\2\2\2aY\3\2\2\2aZ\3\2\2\2a[\3\2\2\2a\\\3\2\2\2a]"+
		"\3\2\2\2a^\3\2\2\2a_\3\2\2\2a`\3\2\2\2b\13\3\2\2\2ch\7\6\2\2de\t\2\2\2"+
		"eg\t\2\2\2fd\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2ik\3\2\2\2jh\3\2\2\2"+
		"kl\7\7\2\2l\r\3\2\2\2mn\7\b\2\2no\t\2\2\2op\t\2\2\2pq\t\2\2\2qr\7\t\2"+
		"\2r\17\3\2\2\2st\7\n\2\2tu\7\32\2\2uv\7\13\2\2v\21\3\2\2\2wy\7\n\2\2x"+
		"z\t\3\2\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|}\3\2\2\2}~\7\n\2\2"+
		"~\23\3\2\2\2\177\u0084\5\b\5\2\u0080\u0081\7\f\2\2\u0081\u0083\5\b\5\2"+
		"\u0082\u0080\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085"+
		"\3\2\2\2\u0085\25\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u008a\7\r\2\2\u0088"+
		"\u008b\5\b\5\2\u0089\u008b\5\22\n\2\u008a\u0088\3\2\2\2\u008a\u0089\3"+
		"\2\2\2\u008b\27\3\2\2\2\u008c\u008d\7\16\2\2\u008d\u008e\5\b\5\2\u008e"+
		"\31\3\2\2\2\u008f\u0090\7\17\2\2\u0090\u0091\5\b\5\2\u0091\33\3\2\2\2"+
		"\u0092\u0093\7\20\2\2\u0093\u0094\5\b\5\2\u0094\35\3\2\2\2\u0095\u0096"+
		"\7\21\2\2\u0096\u0097\5\b\5\2\u0097\37\3\2\2\2\u0098\u0099\7\22\2\2\u0099"+
		"\u009a\5\b\5\2\u009a\u009b\7\f\2\2\u009b\u009c\5\16\b\2\u009c!\3\2\2\2"+
		"\u009d\u009e\7\23\2\2\u009e\u009f\5\b\5\2\u009f\u00a0\7\f\2\2\u00a0\u00a1"+
		"\5\b\5\2\u00a1#\3\2\2\2\u00a2\u00a3\7\24\2\2\u00a3\u00a4\5\b\5\2\u00a4"+
		"\u00a5\7\f\2\2\u00a5\u00a6\5\b\5\2\u00a6%\3\2\2\2\u00a7\u00a8\7\25\2\2"+
		"\u00a8\u00a9\5\b\5\2\u00a9\'\3\2\2\2\u00aa\u00ab\7\26\2\2\u00ab\u00ac"+
		"\5\20\t\2\u00ac\u00ad\7\f\2\2\u00ad\u00ae\5\24\13\2\u00ae)\3\2\2\2\u00af"+
		"\u00b0\7\27\2\2\u00b0\u00b1\5\24\13\2\u00b1+\3\2\2\2\u00b2\u00b3\7\30"+
		"\2\2\u00b3\u00b4\5\24\13\2\u00b4-\3\2\2\2\f\61\67HPRah{\u0084\u008a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}