// header
grammar Lambda;

// parser rules
compilationUnit : ( variable | println )* EOF; //root rule - globally code consist only of variables and prints (see definition below)
variable : VARIABLE ID EQUALS value; //requires LET token followed by ID token followed by EQUALS TOKEN ...
println : PRINT ID ; //print statement must consist of 'print' keyword and ID
value : NUMBER
      | STRING ; //must be NUMBER or STRING value (defined below)

// lexer rules (tokens)
VARIABLE : 'let' ; //VARIABLE TOKEN must match exactly 'let'
PRINT : 'println' ;
EQUALS : '=' ; //must be '='
NUMBER : [0-9]+ ; //must consist only of digits
STRING : '"'.*'"' ; //must be anything in qutoes
ID : [a-zA-Z0-9]+ ; //must be any alphanumeric value
WS: [ \t\n\r]+ -> skip ; //special TOKEN for skipping whitespaces