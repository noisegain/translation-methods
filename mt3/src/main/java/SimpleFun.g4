grammar SimpleFun;

program: functionDecl+;

functionDecl: type ID '(' params? ')' functionMatch;

params: param (',' param)*;
param: type ID;

functionMatch: ('|' patterns)* functionDefault;

patterns: pattern (',' pattern)* '->' expr;
pattern: terms | EMPTY;

EMPTY: '_';

functionDefault: '=' expr;

expr: IF expr 'then' expr 'else' expr
    | MATCH expr 'with' matchCases
    | expr OP expr
    | expr CMP expr
    | ID
    | INT
    | STRING
    | BOOL
    | '(' expr ')'
    | ID INVOKE invokeParams?
    ;

invokeParams: expr (',' expr)* ';';

matchCases: ('|' matchCase)* defaultCase;
matchCase: terms '->' expr;
defaultCase: ('|' expr);

type: 'Int' | 'Bool' | 'String';

terms: INT | BOOL | STRING;


// Лексические правила
INVOKE: '^';
IF: 'if';
MATCH: 'match';
OP: '+' | '-' | '*' | '/' | '%';
CMP: '<=' | '>=' | '==' | '>' | '<';
ID: [a-zA-Z_][a-zA-Z_0-9]*;
INT: [0-9]+;
BOOL: 'true' | 'false';
STRING: '"' ( ~["\\] | '\\' ["\\] )* '"';
WS: [ \t\r\n]+ -> skip; // Игнорируем пробелы, табуляции и переводы строк
