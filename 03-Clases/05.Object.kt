//Un object es un objeto que no necesita ser 'inicializado' ya que ya esta creado.
//Es lo mismo que una clase solo que esta solo puede implementar interfaces. 

object MiApp{
    val nombre = "Prueba"
}

class MiClase{
    /*Se usa para constantes de una clase es decir no se necesita
     * inicializar la clase para poder llamarlos*/

    companion object{
        val nombre = "Objeto"
    }
}

//De aqui viene el concepto de Factory que son objetos que crean instancias.

class Usuario(val rol:String){
    
    companion object{
        fun crearUsuario(): Usuario = Usuario("Admin")
    }

    fun presentation(){
        println("Soy $rol")

    }
}

fun main(){
    
    println(MiApp.nombre)

    println(MiClase.nombre)

    val admin = Usuario.crearUsuario()

    admin.presentation()


}
