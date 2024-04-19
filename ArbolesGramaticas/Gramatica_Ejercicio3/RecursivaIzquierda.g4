grammar RecursivaIzquierda;

// Reglas de producción
s : a b c
  | s UNO
  ;

a : DOS b c
  | // ε producción vacía
  ;

b : c TRES
  | // ε producción vacía
  ;

c : CUATRO b
  | // ε producción vacía
  ;

// Definición de tokens
UNO : 'uno';
DOS : 'dos';
TRES : 'tres';
CUATRO : 'cuatro';
SEIS : 'seis';
SIETE : 'siete';
CINCO : 'cinco';

// Ignorar espacios en blanco y saltos de línea
WS : [ \t\r\n]+ -> skip;

