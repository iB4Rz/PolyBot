# Generated from Polygons.g by ANTLR 4.7.2
# from cl.PolygonsVisitor import PolygonsVisitor
from antlr4 import *
from polygons import ConvexPolygon
import copy
if __name__ is not None and "." in __name__:
    from .PolygonsParser import PolygonsParser
    from .PolygonsVisitor import PolygonsVisitor
else:
    from PolygonsParser import PolygonsParser
    from PolygonsVisitor import PolygonsVisitor

# This class defines a complete generic visitor
# for a parse tree produced by PolygonsParser.


class EvalVisitor(PolygonsVisitor):

    # Diccionario de polygonos
    dict = {}

    # Visit a parse tree produced by PolygonsParser#root.
    def visitRoot(self, ctx: PolygonsParser.RootContext):
        n = next(ctx.getChildren())
        return self.visit(n)

    # Visit a parse tree produced by PolygonsParser#expr.
    def visitExpr(self, ctx: PolygonsParser.ExprContext):
        n = next(ctx.getChildren())
        return self.visit(n)

    # Visit a parse tree produced by PolygonsParser#variable.
    def visitVariable(self, ctx: PolygonsParser.VariableContext):
        list = [n for n in ctx.getChildren()]
        self.dict[list[0].getText()] = self.visit(list[2])
        return self.dict[list[0].getText()]

    # Visit a parse tree produced by PolygonsParser#operation.
    def visitOperation(self, ctx: PolygonsParser.OperationContext):

        if ctx.getChildCount() == 1:
            n = next(ctx.getChildren())
            pol = self.visit(n)
            print(n.getText(), pol)
            if pol is None:
                if n.getText() not in self.dict:
                    raise Exception("No s'ha trobat cap identificador '%s'"
                                    % n.getText())
                else:
                    return copy.deepcopy(self.dict[n.getText()])
            else:
                return pol

        elif ctx.getChildCount() == 2:
            pol = self.visit(ctx.operation(0))
            pol.boundingBox()
            return pol

        else:
            list = [n for n in ctx.getChildren()]
            if list[0].getText() == '(':
                return self.visit(list[1])

            elif list[1].getText() == '*':
                pol1 = self.visit(list[0])
                pol2 = self.visit(list[2])
                pol1.intersection(pol2)
                return pol1

            elif list[1].getText() == '+':
                pol1 = self.visit(list[0])
                pol2 = self.visit(list[2])
                pol1.union(pol2)
                return pol1

    # Visit a parse tree produced by PolygonsParser#instruction.
    def visitInstruction(self, ctx: PolygonsParser.InstructionContext):
        n = next(ctx.getChildren())
        return self.visit(n)

    # Visit a parse tree produced by PolygonsParser#coords.
    def visitCoords(self, ctx: PolygonsParser.CoordsContext):
        list = [n for n in ctx.getChildren()]
        coords = []
        i = 1
        while i < len(list)-1:
            coord = (float(list[i].getText()), float(list[i+1].getText()))
            coords.append(coord)
            i += 2
        pol = ConvexPolygon(coords)
        return pol

    # Visit a parse tree produced by PolygonsParser#colorRGB.
    def visitColorRGB(self, ctx: PolygonsParser.ColorRGBContext):
        list = [n for n in ctx.getChildren()]
        R = float(list[1].getText())
        G = float(list[2].getText())
        B = float(list[3].getText())
        col = (R, G, B)
        return col

    # Visit a parse tree produced by PolygonsParser#img.
    def visitImg(self, ctx: PolygonsParser.ImgContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by PolygonsParser#lines.
    def visitLines(self, ctx: PolygonsParser.LinesContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by PolygonsParser#polygons.
    def visitPolygons(self, ctx: PolygonsParser.PolygonsContext):
        list = [n for n in ctx.getChildren()]
        polygons = []
        for i in range(len(list)):
            if i % 2 == 0:
                polygons.append(self.visit(list[i]))
        return polygons

    # Visit a parse tree produced by PolygonsParser#printPol.
    def visitPrintPol(self, ctx: PolygonsParser.PrintPolContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by PolygonsParser#area.
    def visitArea(self, ctx: PolygonsParser.AreaContext):
        list = [n for n in ctx.getChildren()]
        pol = self.visit(list[1])
        area = pol.getArea()
        return area

    # Visit a parse tree produced by PolygonsParser#perimeter.
    def visitPerimeter(self, ctx: PolygonsParser.PerimeterContext):
        list = [n for n in ctx.getChildren()]
        pol = self.visit(list[1])
        perimeter = pol.getPerimeter()
        return perimeter

    # Visit a parse tree produced by PolygonsParser#vertices.
    def visitVertices(self, ctx: PolygonsParser.VerticesContext):
        list = [n for n in ctx.getChildren()]
        pol = self.visit(list[1])
        vertices = pol.self.getVerticesEdges()
        return vertices

    # Visit a parse tree produced by PolygonsParser#centroid.
    def visitCentroid(self, ctx: PolygonsParser.CentroidContext):
        list = [n for n in ctx.getChildren()]
        pol = self.visit(list[1])
        centroid = pol.getCoordCentroid()
        return centroid

    # Visit a parse tree produced by PolygonsParser#color.
    def visitColor(self, ctx: PolygonsParser.ColorContext):
        list = [n for n in ctx.getChildren()]
        color = self.visit(list[3])
        pol = self.visit(list[1])
        id = self.dict.keys()[self.dict.values().index(pol)]
        pol.addColor(color)
        self.dict[id] = pol
        # return self.visitChildren(ctx)

    # Visit a parse tree produced by PolygonsParser#inside.
    def visitInside(self, ctx: PolygonsParser.InsideContext):
        list = [n for n in ctx.getChildren()]
        pol1 = self.visit(list[1])
        pol2 = self.visit(list[3])
        inside = pol1.containsPolygon(pol2)
        return inside

    # Visit a parse tree produced by PolygonsParser#equal.
    def visitEqual(self, ctx: PolygonsParser.EqualContext):
        list = [n for n in ctx.getChildren()]
        pol1 = self.visit(list[1])
        pol2 = self.visit(list[3])
        equal = pol1.isEqual(pol2)
        return equal

    # Visit a parse tree produced by PolygonsParser#draw.
    def visitDraw(self, ctx: PolygonsParser.DrawContext):
        list = [n for n in ctx.getChildren()]
        polygons = []
        polygons = self.visit(list[3])
        polygons.ConvexPolygon.draw(polygons)
        # return self.visitChildren(ctx)


del PolygonsParser
