grammar compiladores;

@header {
package compiladores;
}

fragment LETRA : [A-Za-z] ;
fragment DIGITO : [0-9] ;

SUMA : '+';
RESTA : '-';
MULT : '*';
DIV : '/';
MOD : '%';
AND : '&&';
OR : '||';
PA: '(';
PC: ')';
CA: '[';
CC: ']';
LA: '{';
LC: '}';
IGUALDAD : '==';
DESIGUALDAD : '!=';
MENOR : '<';
MAYOR : '>';
MENOR_IGUAL : '<=';
MAYOR_IGUAL : '>=';
INT: 'int' ;
DOUBLE: 'double' ;
COMA: ',' ;
PYC: ';' ;
IGUAL: '=';
tipoDato: INT | DOUBLE ;
comparador : IGUALDAD | DESIGUALDAD | MENOR | MAYOR | MENOR_IGUAL | MAYOR_IGUAL;
ENTERO : DIGITO+;
ID : (LETRA | '_')(LETRA | DIGITO | '_')* ;

WS : [ \t\n\r] -> skip;


prog: instrucciones EOF;

instrucciones: instruccion instrucciones
             | 
             ;

instruccion: inst_simple
           | bloque
           | func
           | bloqueDeControl
           ;

inst_simple: decla
           | asignar
           ;

bloque: LA instrucciones LC ;

decla: tipoDato ID listaDecla PYC ;



asignar : asignacion PYC ;

asignacion: ID IGUAL (opal|invocacionFun) ;

func: declaFuncion
       | invocacionFun PYC
       ;

declaFuncion: tipoDato ID PA parametro PC;

parametro: tipoDato ID listaParams
     |
     ;



listaDecla: IGUAL opal listaDecla
                | COMA ID listaDecla
                |
                ;


invocacionFun: ID PA args PC;

args: opal listaArgs
    |
    ;

bloqueDeControl: while_
               | if_
               | for_
               ;

listaParams: COMA parametro
           |
           ;


listaArgs: COMA opal listaArgs
         |
         ;

while_: 'while' PA opal PC (bloque|inst_simple);

if_: 'if' PA opal PC (bloque|inst_simple);

opal : term or;

term : factor t;

factor : ENTERO
       | ID
       | invocacionFun
       | PA opal PC
       |
       ;

for_: 'for' PA condicionFor PC (bloque|inst_simple);

condicionFor: (ID|asignacion) PYC opal PYC asignacion;

t : MULT factor t
  | DIV factor t
  | MOD factor t
  |
  ; 

or : and o
   |
   ;

exp : SUMA term exp
    | RESTA term exp
    | 
    ;

a : AND term and
  |
  ;

comp : exp c
     |
     ;

c : comparador term exp
  |
  ;

o : OR term or
  |
  ;

and : comp a
    |
    ;

