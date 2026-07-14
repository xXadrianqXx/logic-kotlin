import java.io.File

data class Task(
    val id: Int,
    val nombre: String,
    val data: String
)

//Practica de manipulacion de una lista con clases
fun main(){
    val list = listOf(Task(1,"Adrian","^"),Task(2,"Welinton","l"),Task(3,"Juan","y"))
    println("Lista Inicial: $list")
    val file = File("Prueba2.txt")

    val listLines = list.joinToString("\n") {list -> "${list.id}|${list.nombre}|${list.data}"}//Separa el contenido de cada Task en una linea

    file.writeText(listLines)

    println("Lista Guardada: ${file.readText()}")

    val lineRecovery = file.readText().split("\n")

    val list2: MutableList<Task> = mutableListOf()

    for (line in lineRecovery){
        var parts = line.split("|")
        val task = Task(
            parts[0].toInt(),
            parts[1],
            parts[2]
        )

        list2.add(task)
    }

    println("Lista Recuperada y procesada como Task: $list2")

        
    
}




//Practica de manupilacion de lista ala hora de Guardar y recuperar Listas
fun processList(){
    
    val list = listOf("1 | Adrian | X", " 2 | Dayan | Y")

    val file = File("lista.txt") //Crea el archivo

    val text = list.joinToString("\n") //joinToString:Une los elementos y los separa por \n. Lo que esta dentro de las comillas es el oarametro separador
    file.writeText(text)

    println("Archivo sin manipular: " + File("lista.txt").readText())


    val content = File("lista.txt")//Busca el archivo 

    val lines = content.readText().split("\n")//Lee el texto completo y lo separa con \n y devuelve una lista
    println("Lista de lineas separada por split: $lines")

    

    val list2: MutableList<Task> = mutableListOf()

    for (line in lines){
        val parts = line.split("|")
        val task = Task(
            id = parts[0].trim().toInt(),// Trim elimina espacios
            nombre = parts[1],
            data = parts[2]
        )
        list2.add(task)
    }

    println("Lista procesada(Separada en Clases): $list2")
    
    
    
}

//Guarda y busca el archivo y imorime
fun prueba_f(){
    val file = File("saludo.txt")
    file.writeText("Linea1 \n")
    println("Se guardo su app")

    file.appendText("Linea 2 \n")
    file.appendText("Linea 2 \n")

    val content = File("saludo.txt").readText()

    println(content)
}
