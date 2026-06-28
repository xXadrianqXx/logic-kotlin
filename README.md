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
    *   **Árbol de Navidad:** (Aquí describes lo que hace: pide un número y dibuja un árbol de asteriscos, etc.)
    *   (Y así describes los demás que tengas dentro).

## 🚀 Cómo ejecutar

Cada archivo es un script independiente. Para ejecutar cualquiera de ellos, usa el siguiente comando en la terminal (dentro de la carpeta del proyecto):
```bash
kotlinc [nombredelArchivo].kt -include-runtime -d [nombredelArchivo].jar 
 ``
Luego busque el archivo.jar
y escriba:

```bash
kotlin [nombredelArchivo].jar
``
**PDT**: Debes tener instalado Java y Kotlin.