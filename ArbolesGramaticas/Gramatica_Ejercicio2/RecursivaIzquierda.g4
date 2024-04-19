grammar RecursivaIzquierda;

// Reglas de producción
s : b UNO
  | DOS c
  | // ε producción vacía
  ;

a : s TRES b c
  | CUATRO
  | // ε producción vacía
  ;

b : a CINCO c SEIS
  | // ε producción vacía
  ;

c : SIETE b
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

