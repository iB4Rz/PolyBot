import sys
import fileinput
from antlr4 import *

if __name__ is not None and "." in __name__:
    from cl.PolygonsParser import PolygonsParser
    from cl.PolygonsLexer import PolygonsLexer
    from cl.EvalVisitor import EvalVisitor
    from cl.EvalVisitorBot import EvalVisitorBot
else:
    from PolygonsParser import PolygonsParser
    from PolygonsLexer import PolygonsLexer
    from EvalVisitor import EvalVisitor
    from EvalVisitorBot import EvalVisitorBot


# Eval Visitor to PolyBot
def getVisitor(input):

    input_stream = InputStream(input)
    lexer = PolygonsLexer(input_stream)
    token_stream = CommonTokenStream(lexer)
    parser = PolygonsParser(token_stream)
    tree = parser.root()

    if parser.getNumberOfSyntaxErrors() > 0:
        raise Exception('Error de sintaxi')

    visitor = EvalVisitorBot()
    return visitor.visit(tree)

# Eval Visitor to PolyBot
if __name__ == "__main__":
    entrada = sys.stdin.read()
    input_stream = InputStream(entrada)

    lexer = PolygonsLexer(input_stream)
    token_stream = CommonTokenStream(lexer)
    parser = PolygonsParser(token_stream)
    tree = parser.root()

    if parser.getNumberOfSyntaxErrors() > 0:
        raise Exception('Error de sintaxi')

    visitor = EvalVisitor()
    visitor.visit(tree)


# Descomentar per fer de linia en lina en input
'''
if __name__ == "__main__":
    
    for line in sys.stdin:

        input_stream = InputStream(line)

        lexer = PolygonsLexer(input_stream)
        token_stream = CommonTokenStream(lexer)
        parser = PolygonsParser(token_stream)
        tree = parser.root()

        if parser.getNumberOfSyntaxErrors() > 0:
            raise Exception('Error de sintaxi')

        visitor = EvalVisitor()
        visitor.visit(tree)
'''