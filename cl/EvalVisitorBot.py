# Generated from Polygons.g by ANTLR 4.7.2
import sys
from antlr4 import *         
import copy
import random
sys.path.append("..")
if __name__ is not None and "." in __name__:
    from .PolygonsParser import PolygonsParser
    from .PolygonsVisitor import PolygonsVisitor
    from polygons import ConvexPolygon
else:
    from PolygonsParser import PolygonsParser
    from PolygonsVisitor import PolygonsVisitor
    from polygons import ConvexPolygon

# This class defines a complete generic visitor
# for a parse tree produced by PolygonsParser.


class EvalVisitorBot(PolygonsVisitor):

    # Diccionario de polygonos
    dict = {}

    # Visit a parse tree produced by PolygonsParser#root.
    def visitRoot(self, ctx: PolygonsParser.RootContext):
        list = [n for n in ctx.getChildren()]
        for i in range(len(list)-1):
            inf = self.visit(list[i])
            if inf is not None:
                res = self.visit(list[i])
                if type(res) is tuple:
                    return str(' '.join([str("%0.3f" % i) for i in res]))
                elif type(res) is bool:
                    if res:
                        return "yes"
                    else:
                        return "no"
                else:
                    return res

    # Visit a parse tree produced by PolygonsParser#expr.
    def visitExpr(self, ctx: PolygonsParser.ExprContext):
        n = next(ctx.getChildren())
        return self.visit(n)

    # Visit a parse tree produced by PolygonsParser#variable.
    def visitVariable(self, ctx: PolygonsParser.VariableContext):
        list = [n for n in ctx.getChildren()]
        self.dict[list[0].getText()] = self.visit(list[2])

    # Visit a parse tree produced by PolygonsParser#operation.
    def visitOperation(self, ctx: PolygonsParser.OperationContext):

        if ctx.getChildCount() == 1:
            n = next(ctx.getChildren())
            pol = self.visit(n)
            if pol is None:
                if n.getText() not in self.dict:
                    raise Exception("No s'ha trobat cap identificador '%s'"
                                    % n.getText())
                else:
                    return copy.deepcopy(self.dict[n.getText()])
            else:
                return pol

        elif ctx.getChildCount() == 2:
            list = [n for n in ctx.getChildren()]
            if list[0].getText() == '!':
                polCoord = []
                for i in range(int(list[1].getText())):
                    c = (random.uniform(0.0, 1.0), random.uniform(0.0, 1.0))
                    polCoord.append(c)
                return ConvexPolygon(polCoord)

            else:
                pol = self.visit(ctx.operation(0))
                box = pol.boundingBox()
                return ConvexPolygon(box)

        else:
            list = [n for n in ctx.getChildren()]
            if list[0].getText() == '(':
                return self.visit(list[1])

            elif list[1].getText() == '*':
                pol1 = self.visit(list[0])
                pol2 = self.visit(list[2])
                pol = pol1.intersection(pol2)
                return ConvexPolygon(pol)

            elif list[1].getText() == '+':
                pol1 = self.visit(list[0])
                pol2 = self.visit(list[2])
                pol = pol1.union(pol2)
                return ConvexPolygon(pol)

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
    def visitText(self, ctx: PolygonsParser.TextContext):
        list = [n for n in ctx.getChildren()]
        text = ""
        i = 1
        while i < len(list)-1:
            if i != 1: 
                text += " "
            text += list[i].getText()
            i += 1
        return text

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
        list = [n for n in ctx.getChildren()]
        pol = self.visit(list[1])
        if type(pol) is str:
            return pol
        else:
            coord = pol.getCoordinates()
            return (' '.join([str("%0.3f" % i) for tup in coord for i in tup]))

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
        vertices = pol.getVerticesEdges()
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
        for key, value in self.dict.items():
            if value.isEqual(pol):
                pol.addColor(color)
                self.dict[key] = pol

    # Visit a parse tree produced by PolygonsParser#inside.
    def visitInside(self, ctx: PolygonsParser.InsideContext):
        list = [n for n in ctx.getChildren()]
        pol1 = self.visit(list[1])
        pol2 = self.visit(list[3])
        inside1 = pol1.containsPolygon(pol2)
        inside2 = pol2.containsPolygon(pol1)
        return inside1 or inside2

    # Visit a parse tree produced by PolygonsParser#regular.
    def visitRegular(self, ctx: PolygonsParser.RegularContext):
        list = [n for n in ctx.getChildren()]
        pol = self.visit(list[1])
        regular = pol.isRegular()
        return regular

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
        nameImg = list[1].getText().replace('"', '')
        polygons = []
        polygons = self.visit(list[3])
        ConvexPolygon.draw(polygons, nameImg)

    # Visit a parse tree produced by PolygonsParser#paint.
    def visitPaint(self, ctx: PolygonsParser.PaintContext):
        list = [n for n in ctx.getChildren()]
        polygons = self.visit(list[1])
        for pol in polygons:
            for key, value in self.dict.items():
                if value.isEqual(pol):
                    pol.setPaint(True)
                    self.dict[key] = pol

    # Visit a parse tree produced by PolygonsParser#unpaint.
    def visitUnpaint(self, ctx: PolygonsParser.UnpaintContext):
        list = [n for n in ctx.getChildren()]
        polygons = self.visit(list[1])
        for pol in polygons:
            for key, value in self.dict.items():
                if value.isEqual(pol):
                    pol.setPaint(False)
                    self.dict[key] = pol


del PolygonsParser
