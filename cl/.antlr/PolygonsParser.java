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
		T__17=18, T__18=19, NUM=20, ID=21, R=22, MUL=23, MES=24, PAD=25, EXC=26, 
		COMMENT=27, WS=28;
	public static final int
		RULE_root = 0, RULE_expr = 1, RULE_variable = 2, RULE_operation = 3, RULE_instruction = 4, 
		RULE_coords = 5, RULE_colorRGB = 6, RULE_img = 7, RULE_lines = 8, RULE_polygons = 9, 
		RULE_printPol = 10, RULE_area = 11, RULE_perimeter = 12, RULE_vertices = 13, 
		RULE_centroid = 14, RULE_color = 15, RULE_inside = 16, RULE_equal = 17, 
		RULE_draw = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "expr", "variable", "operation", "instruction", "coords", "colorRGB", 
			"img", "lines", "polygons", "printPol", "area", "perimeter", "vertices", 
			"centroid", "color", "inside", "equal", "draw"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':='", "'('", "')'", "'['", "']'", "'{'", "'}'", "'\"image.png\"'", 
			"'\"---\"'", "','", "'print'", "'area'", "'perimeter'", "'vertices'", 
			"'centroid'", "'color'", "'inside'", "'equal'", "'draw'", null, null, 
			null, "'*'", "'+'", "'#'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "NUM", "ID", "R", "MUL", 
			"MES", "PAD", "EXC", "COMMENT", "WS"
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PolygonsParser.EOF, 0); }
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			expr();
			setState(39);
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
			setState(43);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
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
				setState(42);
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
			setState(45);
			match(ID);
			setState(46);
			match(T__0);
			setState(47);
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
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(50);
				match(T__1);
				setState(51);
				operation(0);
				setState(52);
				match(T__2);
				}
				break;
			case PAD:
				{
				setState(54);
				match(PAD);
				setState(55);
				operation(5);
				}
				break;
			case T__3:
				{
				setState(56);
				coords();
				}
				break;
			case ID:
				{
				setState(57);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(68);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(66);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new OperationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(60);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(61);
						match(MUL);
						setState(62);
						operation(5);
						}
						break;
					case 2:
						{
						_localctx = new OperationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(63);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(64);
						match(MES);
						setState(65);
						operation(4);
						}
						break;
					}
					} 
				}
				setState(70);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				printPol();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				area();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(73);
				perimeter();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 4);
				{
				setState(74);
				vertices();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 5);
				{
				setState(75);
				centroid();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 6);
				{
				setState(76);
				color();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 7);
				{
				setState(77);
				inside();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 8);
				{
				setState(78);
				equal();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 9);
				{
				setState(79);
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
			setState(82);
			match(T__3);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUM || _la==R) {
				{
				{
				setState(83);
				_la = _input.LA(1);
				if ( !(_la==NUM || _la==R) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(84);
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
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
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
		public ColorRGBContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colorRGB; }
	}

	public final ColorRGBContext colorRGB() throws RecognitionException {
		ColorRGBContext _localctx = new ColorRGBContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_colorRGB);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(T__5);
			setState(93);
			match(NUM);
			setState(94);
			match(NUM);
			setState(95);
			match(NUM);
			setState(96);
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
			setState(98);
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

	public static class LinesContext extends ParserRuleContext {
		public LinesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lines; }
	}

	public final LinesContext lines() throws RecognitionException {
		LinesContext _localctx = new LinesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_lines);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
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
			setState(102);
			operation(0);
			}
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(103);
				match(T__9);
				setState(104);
				operation(0);
				}
				}
				setState(109);
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
		public LinesContext lines() {
			return getRuleContext(LinesContext.class,0);
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
			setState(110);
			match(T__10);
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__3:
			case ID:
			case PAD:
				{
				setState(111);
				operation(0);
				}
				break;
			case T__8:
				{
				setState(112);
				lines();
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
			setState(115);
			match(T__11);
			setState(116);
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
			setState(118);
			match(T__12);
			setState(119);
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
			setState(121);
			match(T__13);
			setState(122);
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
			setState(124);
			match(T__14);
			setState(125);
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
			setState(127);
			match(T__15);
			setState(128);
			operation(0);
			setState(129);
			match(T__9);
			setState(130);
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
			setState(132);
			match(T__16);
			setState(133);
			operation(0);
			setState(134);
			match(T__9);
			setState(135);
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
			setState(137);
			match(T__17);
			setState(138);
			operation(0);
			setState(139);
			match(T__9);
			setState(140);
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
			setState(142);
			match(T__18);
			setState(143);
			img();
			setState(144);
			match(T__9);
			setState(145);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36\u0096\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\3\3\3\5\3.\n\3\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5=\n\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5"+
		"E\n\5\f\5\16\5H\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6S\n\6\3\7"+
		"\3\7\3\7\7\7X\n\7\f\7\16\7[\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\n\3\n\3\13\3\13\3\13\7\13l\n\13\f\13\16\13o\13\13\3\f\3\f\3\f\5\f"+
		"t\n\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\2\3\b\25\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&\2\3\4\2\26\26\30\30\2\u0093\2(\3\2\2\2\4-\3\2\2\2\6/\3\2\2"+
		"\2\b<\3\2\2\2\nR\3\2\2\2\fT\3\2\2\2\16^\3\2\2\2\20d\3\2\2\2\22f\3\2\2"+
		"\2\24h\3\2\2\2\26p\3\2\2\2\30u\3\2\2\2\32x\3\2\2\2\34{\3\2\2\2\36~\3\2"+
		"\2\2 \u0081\3\2\2\2\"\u0086\3\2\2\2$\u008b\3\2\2\2&\u0090\3\2\2\2()\5"+
		"\4\3\2)*\7\2\2\3*\3\3\2\2\2+.\5\6\4\2,.\5\n\6\2-+\3\2\2\2-,\3\2\2\2.\5"+
		"\3\2\2\2/\60\7\27\2\2\60\61\7\3\2\2\61\62\5\b\5\2\62\7\3\2\2\2\63\64\b"+
		"\5\1\2\64\65\7\4\2\2\65\66\5\b\5\2\66\67\7\5\2\2\67=\3\2\2\289\7\33\2"+
		"\29=\5\b\5\7:=\5\f\7\2;=\7\27\2\2<\63\3\2\2\2<8\3\2\2\2<:\3\2\2\2<;\3"+
		"\2\2\2=F\3\2\2\2>?\f\6\2\2?@\7\31\2\2@E\5\b\5\7AB\f\5\2\2BC\7\32\2\2C"+
		"E\5\b\5\6D>\3\2\2\2DA\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2G\t\3\2\2\2"+
		"HF\3\2\2\2IS\5\26\f\2JS\5\30\r\2KS\5\32\16\2LS\5\34\17\2MS\5\36\20\2N"+
		"S\5 \21\2OS\5\"\22\2PS\5$\23\2QS\5&\24\2RI\3\2\2\2RJ\3\2\2\2RK\3\2\2\2"+
		"RL\3\2\2\2RM\3\2\2\2RN\3\2\2\2RO\3\2\2\2RP\3\2\2\2RQ\3\2\2\2S\13\3\2\2"+
		"\2TY\7\6\2\2UV\t\2\2\2VX\t\2\2\2WU\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2"+
		"\2Z\\\3\2\2\2[Y\3\2\2\2\\]\7\7\2\2]\r\3\2\2\2^_\7\b\2\2_`\7\26\2\2`a\7"+
		"\26\2\2ab\7\26\2\2bc\7\t\2\2c\17\3\2\2\2de\7\n\2\2e\21\3\2\2\2fg\7\13"+
		"\2\2g\23\3\2\2\2hm\5\b\5\2ij\7\f\2\2jl\5\b\5\2ki\3\2\2\2lo\3\2\2\2mk\3"+
		"\2\2\2mn\3\2\2\2n\25\3\2\2\2om\3\2\2\2ps\7\r\2\2qt\5\b\5\2rt\5\22\n\2"+
		"sq\3\2\2\2sr\3\2\2\2t\27\3\2\2\2uv\7\16\2\2vw\5\b\5\2w\31\3\2\2\2xy\7"+
		"\17\2\2yz\5\b\5\2z\33\3\2\2\2{|\7\20\2\2|}\5\b\5\2}\35\3\2\2\2~\177\7"+
		"\21\2\2\177\u0080\5\b\5\2\u0080\37\3\2\2\2\u0081\u0082\7\22\2\2\u0082"+
		"\u0083\5\b\5\2\u0083\u0084\7\f\2\2\u0084\u0085\5\16\b\2\u0085!\3\2\2\2"+
		"\u0086\u0087\7\23\2\2\u0087\u0088\5\b\5\2\u0088\u0089\7\f\2\2\u0089\u008a"+
		"\5\b\5\2\u008a#\3\2\2\2\u008b\u008c\7\24\2\2\u008c\u008d\5\b\5\2\u008d"+
		"\u008e\7\f\2\2\u008e\u008f\5\b\5\2\u008f%\3\2\2\2\u0090\u0091\7\25\2\2"+
		"\u0091\u0092\5\20\t\2\u0092\u0093\7\f\2\2\u0093\u0094\5\24\13\2\u0094"+
		"\'\3\2\2\2\n-<DFRYms";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}