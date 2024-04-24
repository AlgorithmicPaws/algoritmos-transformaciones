grammar YaNoRecursivaIzquierda;

// Reglas de producción
s : b UNO
  | DOS c
  | // ε producción vacía
  ;

a : b UNO TRES b c
  | DOS c TRES b c
  | TRES b c
  | CUATRO
  | // ε producción vacía
  ;

b : DOS c TRES b c CINCO c SEIS be
  | TRES b c CINCO c SEIS be
  | CUATRO CINCO c SEIS be
  | CINCO c SEIS be
  | // ε producción vacía
  ;
  
be : UNO TRES b c CINCO c SEIS be
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

