// Hay 2 condiciones estrictas para usar infix. Solo se puede usar en funciones de extensión y funciones pertenecientes a objetos. Y la segunda es que debe tener siempre un parametro. 


// Función de extención 1 -> Una función de extensión tiene un prefijo. En si la función se convierte en un objeto.
fun String.imprimir() {
    println("$this")
}

// Ejemplo infix 2 -> Usamos this para referenciar a la funcion. La función pasa a ser una especie de objeto.
infix fun String.imprimirInfix(nombre: String){
    println("$this $nombre")
}

// Ejemplo infix 3 -> Al tener un objeto se puede llamar usando el nombre del objeto y el parametro.
class Saludo(val saludo: String){
    infix fun imprimirSaludo(nombre: String){
        println("$saludo $nombre")
    }
}


// Función de extención-infix dentro de una clase.
//Aqui se crea una ambiguedad debido a que al llamar a la con this, el programa no sabe si llamas a el parametro(De la clase) o a la función, esto lo arreglamos con el @, y aparte de eso IMPORTANTE: La funcion solo se puede llamar dentro del objeto. 

class SaludoInfix(val nombre: String) {

    infix fun String.saludo(destinatario:String){
        //Usamos @ para aclarar a que nos referimos.
        println("${this@SaludoInfix.nombre} dice: $this $destinatario")
    }

    // Para ejecutar la función infix se llama dentro de la clase
    fun ejecutar() { "Hola" saludo "Mundo"}
}
 
fun main(){
// La manera de llamar una función de extensión es ecribiendo el parametro del tipo del prefijo al que pertenece la función un . y la función.
    "Hola Mundo".imprimir()

// La manera de llamar una función infix es escribir el sufijo del tipo correspondiente  y el parametro separados con un espacio. (No se usa . ni ())
    "Hola" imprimirInfix "Mundo"

    // La mamera de llamar una función infix dentro de una clase es la siguiente:
    val saludo = Saludo("Hola")
    //Llamamos al objeto, ala función y luego el parametro.
    saludo imprimirSaludo "Mundo"

    // Como se menciono no se puede ejecutar la función de extención-infix fuera de la clase, por lo tnato usamos una función en este caso ejecutar() para ejecutar la función requerida
    val saludoInfix = SaludoInfix("Maquina")

    saludoInfix.ejecutar()
    
}
