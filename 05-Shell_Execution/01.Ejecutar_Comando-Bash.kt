fun main(){
    //Tenemos una funcion actual y es mas verbiza pero mas facil de usar. Al igual que .exe() tambien se ejecuta en otra terminal.
    val process = ProcessBuilder("pwd").start()

    //iputStream tambien se puede utlizar para guardar el resultado del proceso de processBuilder().
    val resultado = process.inputStream.bufferedReader().readText()

    println(resultado)

    //Tambien podemos convertir el processBulider() en el 'terminal' actual y muetre el resultado directamentte con inheritIO().

    ProcessBuilder("clear").inheritIO().start()

// Para ejecutar comandos con -c o -- y para redireccionar o imprimir los errores en el mismo inputStream usamos redirectErrorStream(true) 
    val process2 = ProcessBuilder("/bin/sh", "-c", "git log --oneline")
        .redirectErrorStream(true)
        .start()
    
    val salida = process2.inputStream.bufferedReader().readText()
    //Espera a que termine el proceso.
    process.waitFor()
    println("Historial de commits:\n$salida")
/* Lista de comnados
    # ProcessBuilder (Configuración)
    - command(), directory(), environment()
    - redirectOutput(), redirectError(), redirectErrorStream()
    - start() → Devuelve Process
    
    # Process (Control)
    - inputStream, errorStream, outputStream
    - waitFor(), exitValue(), isAlive()
    - destroy(), destroyForcibly(), pid()
    */

}









//Aqui se uso exec que tal parece que ya es obsoleto.
fun comandoExec(){
    // Cdigo ACSSI de limpiar pantalla
    println("\u001b[2J\u001b[H")

    // Runtime es una clase y al usar getRuntime() llamaramos al Runtime Actual y al usar exec es como si crearamos una nueva ventana en la terminal/runtime actual y escribieramos el codigo. exec devuelve un objeto Process. El comando debe ir dentro de un array. 
    val process = Runtime.getRuntime().exec(arrayOf("pwd"))
    // Debido a que es como si hubieramos ejecutado el comando en una ventana aparte obtenemos el texto mediante las los "tubos" de salida y/o entrada. bufferedReader traduce de binario a string y readText lee el string.
    val salida = process.inputStream.bufferedReader()
    println(salida.readText())
    // Buena practica
    salida.close()

//Hay 6 metodos para la manipulacion del objeto llamado process  

    /*Método	Tipo	¿Qué hace?	¿Cuándo usarlo?
inputStream	Lectura	Lee la salida del comando (lo que imprime)	SIEMPRE que quieras ver el resultado
errorStream	Lectura	Lee los errores del comando	Cuando quieras depurar fallos
outputStream	Escritura	Escribe datos al comando	Cuando el comando necesite entrada interactiva
waitFor()	Bloqueo	Espera a que el comando termine	SIEMPRE que quieras saber cuándo termina
exitValue()	Lectura	Código de salida (0 = éxito)	Para verificar si funcionó
destroy()	Acción	Mata el proceso	Si se cuelga o necesitas detenerlo*/

//Los siguientes comandos se usan para cuando es un comandor interactivo como gref,less.

   /*
    val input = process.outputStream.bufferedWriter()

    input.write("ls")
    flush es como dar enter. Para ejecutar el comando.
    input.flush()
    */

}
