from antlr4 import *
from PolygonsParser import PolygonsParser
from PolygonsLexer import PolygonsLexer
from PolygonsVisitor import PolygonsVisitor
from EvalVisitor import EvalVisitor


input_stream = InputStream(input('? '))

lexer = PolygonsLexer(input_stream)
token_stream = CommonTokenStream(lexer)
parser = PolygonsParser(token_stream)
tree = parser.root()

if parser.getNumberOfSyntaxErrors() > 0:
    raise Exception('Error de sintaxi')

print(tree.toStringTree(recog=parser))
visitor = EvalVisitor()
visitor.visit(tree)