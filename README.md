# Algoritmos Transformaciones

Este repositorio contiene ejemplos y herramientas para trabajar con gramáticas y transformaciones en Python y ANTLR.

## Contenido

El repositorio está organizado en tres carpetas principales:

### 1. Algoritmos

En esta carpeta encontrarás un archivo `condicionLL1.py` que implementa transformaciones para la eliminación de factores comunes y recursión por la izquierda. El archivo contiene tres gramáticas distintas, cada una comentada para que puedas probarlas individualmente.

Para ejecutar el script, simplemente corre:

  ```bash
  python condicionLL1.py
  ```
### 2. ArbolesGramaticas

Esta carpeta está subdividida en tres subcarpetas, cada una correspondiente a un ejercicio. Dentro de cada subcarpeta encontrarás archivos `.g4` de ANTLR que representan las gramáticas antes y después de las transformaciones. Los archivos están nombrados como `RecursivaIzquierda.g4` para la gramática original y `YaNoRecursivaIzquierda.g4` para la gramática después de las transformaciones.

Para ejecutar cada gramática, sigue estos pasos:

1. Ingresa a la carpeta del ejercicio deseado.
2. Ejecuta ANTLR4 para compilar la gramática:

```bash
antlr4 RecursivaIzquierda.g4 # o YaNoRecursivaIzquierda.g4 según corresponda
javac *.java
grun RecursivaIzquierda s -gui Ejemplos.txt # o YaNoRecursivaIzquierda según corresponda
```
### 3. FotosComparativas

Esta carpeta contiene imágenes clasificadas por ejercicio, mostrando comparativas visuales de los árboles de la gramática antes y después de las transformaciones. Estas imágenes fueron generadas utilizando la interfaz gráfica de ANTLR.
