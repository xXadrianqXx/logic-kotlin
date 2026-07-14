fun main (){
    var onApp = true
    do{
        println("\nSelecciones la Tarea")
        println("\n 1. midTree\n 2.Fibonacci\n 3.Salir")
        val option = readLine()?.toIntOrNull() ?: 0
        when(option){
            1 -> midTree()
            2 -> fibonacci()
            3 -> onApp = false
            else -> println("Digíte el número de la opción requerida")
        } 
    } while(onApp == true)
}

fun midTree(){
    println("\nDigite la altura del arbol")
    val height = readLine()?.toIntOrNull() ?: 0
    var char = "0"
    for (i in 1..height){
        println(char)
        char += "0"
        
    }
}


fun fibonacci(){
	println("\nFibonacci")
	println("Ingrese el primer numero")
	var number1 = readLine()?.toIntOrNull() ?: 0
	println("Ingrese el segundo numero")
	var number2 = readLine()?.toIntOrNull() ?: 0
	println("Digite el rango de la operacion")
	val range = readLine()?.toIntOrNull() ?: 0

	for (i in 1..range){
	val next = number1 + number2
	println("\n$number1 + $number2 = $next")
	number1 = number2
	number2 = next
	}
}
