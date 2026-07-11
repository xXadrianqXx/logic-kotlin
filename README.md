# 📁 Prácticas Kotlin

Este repositorio contiene pequeños proyectos y ejercicios que fui desarrollando mientras aprendía Kotlin. Son scripts independientes que resuelven problemas básicos de lógica.

## 📂 Contenido

*   **Calculadora.kt** -> Una calculadora básica que pide dos números y una operación (+, -, *, ÷, %).
*   **AppPIT.kt** -> Una app de consola con un menú que permite:
    *   Ver todas las tablas de multiplicar (del 1 al 12).
    *   Ver una tabla de multiplicar específica (la que el usuario elija).
    *   Sumar números pares dentro de un rango.
    *   Sumar números impares dentro de un rango.
*   **Fibonacci.kt** -> Contiene varios ejercicios clásicos de lógica:
    *   **Sucesión de Fibonacci:** Genera los primeros N números de la serie.
    *   **Árbol de Navidad:** (Pide un número y dibuja un árbol de asteriscos.)
    *   (Y así describes los demás que tengas dentro).
*   **Persistencia de Datos** -> Contiene practica básica de persistencia de datos y manipulación de listas:
    *   **Guardar Texto** Se guarda un texto básico.
    *   **Guarda Contenido de una lista** Se guarda el contenido de una lista y se lo recupera y se los organiza como se los guardo.
    *   **Guarda un data Class** Guarda un data class guardado en una lista. y luego lo recupera.

## 🚀 Cómo ejecutar

Cada archivo es un script independiente. Para ejecutar cualquiera de ellos, usa el siguiente comando en la terminal (dentro de la carpeta del proyecto):
```bash
kotlinc [nombredelArchivo].kt -include-runtime -d [nombredelArchivo].jar 
 ```
Luego busque el archivo.jar
y escriba:

```bash
kotlin [nombredelArchivo].jar
```
**PDT**: Debes tener instalado Java y Kotlin.