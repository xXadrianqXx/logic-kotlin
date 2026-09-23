//Estos tienen funcionalidades propias  
data class Usuario(val nombre: String, val edad: Int)

fun main(){

    val ana = Usuario("Ana", 7)

    //De las primeras funcionalidades es to string

    println(ana)

    //Copy
    val anaMayor = ana.copy(edad = 15)

    //equals
    println(ana == anaMayor)

    
}
