grammar Polygons;

root: expr EOF;

expr: variable | operation | instruction;

variable: ID ':=' operation
        //| ID ':=' coords
        ;

operation: '(' operation ')'
        | EXC NUM
        | PAD operation
        | operation MUL operation
        | operation MES operation
        | coords
        | ID
        | NUM
        ;

instruction:  printPol
            | area
            | perimeter
            | vertices
            | centroid
            | color
            | inside
            | equal
            | draw
            ;

coords: '[' ( NUM NUM )* ']';
colorRGB: '{' NUM NUM NUM '}';
img: '"image.png"';
lines: '"---"';
polygons: ( ID ) (',' ID)*;

printPol: 'print' (operation | lines);
area: 'area' operation;
perimeter: 'perimeter' operation;
vertices: 'vertices' operation;
centroid: 'centroid' operation;
color: 'color' operation ',' colorRGB;
inside: 'inside' operation ',' operation;
equal: 'equal' operation ',' ID;
draw: 'draw' img ',' polygons;

// printPol: 'print' (ID | operation | lines);
// area: 'area' ID;
// perimeter: 'perimeter' ID;
// vertices: 'vertices' ID;
// centroid: 'centroid' ID;
// color: 'color' ID ',' colorRGB;
//  inside: 'inside' ID ',' ID;
// equal: 'equal' ID ',' ID;
// draw: 'draw' img ',' polygons;

NUM: [0-9]+;
ID : [a-zA-Z][a-zA-Z0-9]*;
// R: [0-9]+{.[0-9]*}|.[0-9]+;

MUL: '*';   // represents the intersection of two polygons.
MES: '+';   // represents the convex union of two polygons.
PAD: '#';   // is the unary operator that returns the bounding box of a polygon
EXC: '!';   // returns a convex polygon made with n points drawn at random in the unit square ([0,1]²).


COMMENT: '//'~ [ \t\r\n]+ -> skip;
WS : [ \t\r\n]+ -> skip;    // skip spaces, tabs, newlines