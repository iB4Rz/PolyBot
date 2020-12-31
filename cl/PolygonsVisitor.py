# Generated from Polygons.g by ANTLR 4.7.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .PolygonsParser import PolygonsParser
else:
    from PolygonsParser import PolygonsParser

# This class defines a complete generic visitor for a parse tree produced by PolygonsParser.

class PolygonsVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by PolygonsParser#root.
    def visitRoot(self, ctx:PolygonsParser.RootContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PolygonsParser#expr.
    def visitExpr(self, ctx:PolygonsParser.ExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PolygonsParser#variable.
    def visitVariable(self, ctx:PolygonsParser.VariableContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PolygonsParser#operation.
    def visitOperation(self, ctx:PolygonsParser.OperationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PolygonsParser#instruction.
    def visitInstruction(self, ctx:PolygonsParser.InstructionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PolygonsParser#coords.
    def visitCoords(self, ctx:PolygonsParser.CoordsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PolygonsParser#colorRGB.
    def visitColorRGB(self, ctx:PolygonsParser.ColorRGBContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PolygonsParser#img.
    def visitImg(self, ctx:PolygonsParser.ImgContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PolygonsParser#text.
    def visitText(self, ctx:PolygonsParser.TextContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PolygonsParser#polygons.
    def visitPolygons(self, ctx:PolygonsParser.PolygonsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PolygonsParser#printPol.
    def visitPrintPol(self, ctx:PolygonsParser.PrintPolContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PolygonsParser#area.
    def visitArea(self, ctx:PolygonsParser.AreaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PolygonsParser#perimeter.
    def visitPerimeter(self, ctx:PolygonsParser.PerimeterContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PolygonsParser#vertices.
    def visitVertices(self, ctx:PolygonsParser.VerticesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PolygonsParser#centroid.
    def visitCentroid(self, ctx:PolygonsParser.CentroidContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PolygonsParser#color.
    def visitColor(self, ctx:PolygonsParser.ColorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PolygonsParser#inside.
    def visitInside(self, ctx:PolygonsParser.InsideContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PolygonsParser#equal.
    def visitEqual(self, ctx:PolygonsParser.EqualContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PolygonsParser#regular.
    def visitRegular(self, ctx:PolygonsParser.RegularContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PolygonsParser#draw.
    def visitDraw(self, ctx:PolygonsParser.DrawContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PolygonsParser#paint.
    def visitPaint(self, ctx:PolygonsParser.PaintContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PolygonsParser#unpaint.
    def visitUnpaint(self, ctx:PolygonsParser.UnpaintContext):
        return self.visitChildren(ctx)



del PolygonsParser