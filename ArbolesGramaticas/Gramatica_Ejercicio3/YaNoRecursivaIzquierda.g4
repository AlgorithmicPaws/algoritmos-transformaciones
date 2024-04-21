grammar YaNoRecursivaIzquierda;

// Reglas de producción
s : a b c se
  ;
  
se: UNO se
  | // ε producción vacía
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

// Ignorar espacios en blanco y saltos de línea
WS : [ \t\r\n]+ -> skip;

