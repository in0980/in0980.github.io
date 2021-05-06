grammar expressions;

file : equation+ EOF;

equation
   : expression 
   ;

expression
   :  expression  (TIMES | DIV)  expression
   |  expression  (PLUS | MINUS) expression
   |  LPAREN expression RPAREN
   |  atom
   ;

atom
   : scientific   
   ;

scientific
   : SCIENTIFIC_NUMBER
   ;


//The NUMBER part gets its potential sign from "(PLUS | MINUS)* atom" in the expression rule
SCIENTIFIC_NUMBER
   : NUMBER (E SIGN? UNSIGNED_INTEGER)?
   ;

fragment NUMBER
   : ('0' .. '9') + ('.' ('0' .. '9') +)?
   ;

fragment UNSIGNED_INTEGER
   : ('0' .. '9')+
   ;


fragment E
   : 'E' | 'e'
   ;


fragment SIGN
   : ('+' | '-')
   ;


LPAREN
   : '('
   ;


RPAREN
   : ')'
   ;


PLUS
   : '+'
   ;


MINUS
   : '-'
   ;


TIMES
   : '*'
   ;


DIV
   : '/'
   ;



WS
   : [ \r\n\t] + -> skip
   ;
