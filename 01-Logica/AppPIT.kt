fun main() {
	
	var onApp = true 
	while (onApp){
		println("\nBIENVENIDO")
		println("Seleccione: \n1. Todas la tablas de multiplicar. \n2. Tabla de multiplicar especifica. \n3. Numeros Pares \n4. Numeros Impares. \n5. Salir.\n")
		
		val option = readLine()?.toIntOrNull() ?: 0
		when(option) {
			1 -> allTimes()
			2 -> times()
			3 -> additionOfPairs()
			4 -> additionOfOdd()
			5 -> onApp = false
			else -> println("Selecciones de acuedo a la numeración")
			}
		}
}


fun allTimes() {
	for (num in 1..12) {
		println("\n Tabla del $num")
		for (i in 1..12){
			println("  $i * $num = ${i*num}")
			}	
		}
}


fun times(){
        println("Nota: Por defecto empieza en la tabla del  0, digite que tabla requiere")
        print("Tabla Requerida: ")
        val num = readLine()?.toIntOrNull() ?: 0
	val condition = if (num == 0) true else false
	if (condition == true){
		println("Todo numero multiplicado por 0 es 0")
		return

		}
        var addition = 0
        for (i in 1..12) {
		addition += num
                println(num.toString() + " * " + i.toString() + " = " + addition.toString()) 
                }
        
}

fun additionOfOdd(){
        println("Nota: El rango empieza en 0, digite hasta cual se va a realizar")
        print("Rango a filtrar: ")
        val range = readLine()?.toIntOrNull() ?: 0
        var addition = 0
        for (i in 0..range) {
                if (i%2 != 0){
                        addition += i
                        println(i)
                        }
                }
        println(addition)
}

fun additionOfPairs(){
	println("Nota: El rango empieza en 0, digite hasta cual se va a realizar")
	print("Rango a filtrar: ")
	val range = readLine()?.toIntOrNull() ?: 0
	var addition = 0
	for (i in 0..range) {
		if (i%2 == 0){
			addition += i
			println(i)
			}
		}
	println(addition)
}
