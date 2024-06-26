# Algoritmos Transformaciones

Este repositorio contiene los ejercicios de transformación de gramáticas para conseguir la condición LL(1) y visualización de sus árboles correspondientes. Taller hecho por:
Sergio Florez, Catalina Gutiérrez, Camilo Millan, Santiago Castellanos

## Contenido

El repositorio está organizado en tres carpetas principales:

### 1. Algoritmos

En esta carpeta encontrarás un archivo `condicionLL1.py` que implementa transformaciones para la eliminación de factores comunes y recursión por la izquierda, y luego reutiliza las funciones de los conjuntos (Primeros-Siguientes-Prediccion).
El archivo contiene varias gramáticas distintas, cada una comentada hacia el final del codigo para que puedas probarlas individualmente, están las tres de los ejercicios de la presentación 10 y unos ejemplos de la misma presentación.

Para ejecutar el script, simplemente asegurate de descomentar-comentar la gramáticas en el codigo, guardar y correr:

  ```bash
  python condicionLL1.py
  ```
### 2. ArbolesGramaticas

Esta carpeta está subdividida en tres subcarpetas, cada una correspondiente a un ejercicio. Dentro de cada subcarpeta encontrarás dos archivos `.g4` de ANTLR que representan las gramáticas antes y después de las transformaciones. Los archivos están nombrados como `RecursivaIzquierda.g4` para la gramática original y `YaNoRecursivaIzquierda.g4` para la gramática después de las transformaciones.

Hay archivos .txt dentro de las carpetas por si quieres probar directamente con los ejemplos que hicimos, de lo contrario por consola puedes probar.

Para ejecutar cada gramática, sigue estos pasos:

1. Ingresa a la carpeta del ejercicio deseado.
2. Asegurate de tener ANTLR4 configurado con java para realizar:

```bash
antlr4 RecursivaIzquierda.g4 # o YaNoRecursivaIzquierda.g4 según corresponda
javac *.java
grun RecursivaIzquierda s -gui Ejemplo1.txt # o YaNoRecursivaIzquierda según corresponda.
                                            # o Ejemplo2.txt o sin Ejemplo.txt para abrir consola
```
### 3. FotosComparativas

Esta carpeta contiene tres carpetas clasificadas por ejercicio, cada una contiene imagenes comparativas de los árboles de la gramática antes y después de las transformaciones con los ejemplos de los archivos.txt. Estas imágenes fueron generadas utilizando la interfaz gráfica de ANTLR. Puedes ir directamente a estas carpetas si deseas solo comprobar las gramáticas y no correr los archivos.

**Nota Importante:** En el ejercicio 2, la gramática al tener recursion indirecta por izquierda de varias reglas, antlr (por lo menos hasta la version 4.13.1) no permite generar los archivos correctamente ya que genera error, por lo que no se puede visualizar el arbol de la gramática antes de ser transformado, en la carpeta correspondiente se adjunta foto del error que se genera. Sin embargo están las fotos de los arboles con la gramática transformada.
