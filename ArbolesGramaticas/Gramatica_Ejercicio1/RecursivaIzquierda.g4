grammar RecursivaIzquierda;

// Reglas de producción
s : a b c
  | d e
  ;

a : DOS b TRES
  | // ε producción vacía
  ;

b : b CUATRO c CINCO
  | // ε producción vacía
  ;

c : SEIS a b
  | // ε producción vacía
  ;

d : UNO a e
  | b
  ;

e : TRES;

// Definición de tokens
DOS : 'dos';
CUATRO : 'cuatro';
SEIS : 'seis';
UNO : 'uno';
TRES : 'tres';
CINCO : 'cinco';

// Ignorar espacios en blanco y saltos de línea
WS : [ \t\r\n]+ -> skip;
