
//Funcion Basica 
fun printData() {
    println("Funcion basica")
}

//Vararg es un convertidor recibe parametros sueltos y los convierte en array. Sin embargo puedes usar un Array directente tambien oero entonces tines que usar arrayOf() y fun ...(num: Array<String>){}
fun printVararg(vararg num: Int) {
    // Esto combierte un array a string. La diferencia con contentOfString() es que con join to string se pueden modificar los parametros.

    //joinToString(
    //    separator = ", ",     // Entre elementos
    //    prefix = "",          // Al inicio
    //   postfix = "",         // Al final
    //    limit = -1,           // Cuántos mostrar
    //    truncated = "...",    // Cuando se corta
    //    transform = null      // Modificar cada elemento
    //)

    println(num.joinToString(" - "))
}

fun main() {

    //Funcion lambda.
    val lambda : (String) -> Unit = {println(it)}
    // Llamar funcion normal.
    printData()
    //Llamar funcion lambda.
    lambda("Funcion Lambda")
    //Vararg recibe argumentos sueltos.
    printVararg(1,2,31)
    // Hay que recordar que hay difrencia entre el arrayOf() y el intArrayOf() el arrayOf es generico y mas flexible el intArrayOf() es mas estricto como ejemplo no se pueden realizar operaciones como filter().
    val array = intArrayOf(3,4,2,1)
    // El operador * es un desempaquetador de arrays y solo arrays. Solo funciona para al llamar funciones con parametros vararg.
    printVararg(*array)
    
}
