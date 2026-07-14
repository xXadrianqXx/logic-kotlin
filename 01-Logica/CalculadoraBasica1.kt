fun main (){
	println("CALCULADORA")
	println("IMPORTANTE \n Si uno los dos valores tiene un caracter no valido se convertira en 0")
	print("Ingrese el primer valor: ")
	val num1 = readLine()?.toDoubleOrNull() ?: 0.0
	print("Ingrese el segundo valor: ")
	val num2 = readLine()?.toDoubleOrNull() ?: 0.0
	println("Ingrese la operacion a realizar: \n + \n - \n * \n ÷ \n % \n ")
	print("Operacion: ")
	
	
	val number = readLine()?.firstOrNull() ?: '+'
	val operation = when (number) {
			'+' -> "$num1 + $num2 = ${num1 + num2}"
			'-' -> "$num1 - $num2 = ${num1 - num2}"
			'*' -> "$num1 * $num2 = ${num1 * num2}"
			'÷' -> if (num2 != 0.0) "$num1 ÷ $num2 = ${num1 / num2}" else "Esto no se puede resolver ya no se puede dividir para 0, esto es una indeterminacion."
			'%' -> if (num2 != 0.0) "$num1 % $num2 = ${num1 % num2}" else "Esto no se puede resolver ya no se puede dividir para 0, esto es una indeterminacion."
			else -> "La operacion es invalida, porfavor ingrese el signo adecuado"
			}
	println(operation)
	
}
