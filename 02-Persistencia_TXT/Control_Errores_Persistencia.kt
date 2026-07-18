import java.io.File

data class Prueba(
    var id: Int,
    var name: String,
    var rep: Boolean
)
fun main(){
    val list:MutableList<Prueba> = mutableListOf()
    val listnew:MutableList<Prueba> = mutableListOf()
    for (i in 0..3){
        val task = Prueba(i,"Adrian",true)
        list.add(task)
    }

    //Carga y imprime el texto retornado
    println(load(listnew))
//Imprimimos para comprobar que la carga fue correcta
    println(listnew)

//Si no existe un archivo crea uno para probar.
    if (!File("Prueba.txt").exists()){
        save(list)
    }
}

fun load(list:MutableList<Prueba>): String {
    //Declaramos la ruta del archivo.
    val file = File("Prueba.txt")
    //Preguntamos si existe
    if (!file.exists()){
    //Si no existe retornamos no existe.
        return "No hay que cargar"
    }
    //Lee el archivo
    val content = file.readLines()

    for (i in content){
    //Hace una lista de las partes de cada linea separadas por |
        val parts = i.split("|")
        //Con try y catch si ocurre algo con el archivono dira que paso y continuara con el siguiente. No crashea ni detiene el proceso.
        try{
            val p = Prueba(
                id = parts[0].toInt(),
                name = parts[1],
                rep = parts[2].toBoolean()
            )
            list.add(p)
        } catch(e: Exception){
            println("Error: ${e.message}")
        }
    }
    //Una vez acaba de recorrer todo el contenido retorna Carga completa
    return "Carga Completa"

}

//El Guardado 
fun save(list:MutableList<Prueba>){
//Verific que no haya errores en el Guardado:
//Como que no haya espacio en memoria. O quizas no tiene permisos para guardar. 
    try{
        val file = File("Prueba.txt")
        val lines = list.joinToString("\n") {it -> "${it.id}|${it.name}|${it.rep}"}
        file.writeText(lines)
        println("Guardado con exito")
    } catch(e: Exception){
        
        println(e.message)
    }
    
}
