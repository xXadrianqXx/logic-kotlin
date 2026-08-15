import kotlin.math.*

//TODO: Level 1 
// Con abstract es para avizar que esta clase 3sta incompleta.
abstract class Figura{
// Con abstract para que se sepa que la funcion esta incompleta.
    abstract fun area(): Double
// Al estar incompleta es obligatorio completar. La funcion puede retornar unit o vacio tambien, no hay problema.
    abstract fun perimetro(): Double
    
}


class Triangulo(val l1: Double, val l2: Double, val l3: Double): Figura(){
// Es obligatorio usar override para completar la funcion.
    override fun area():Double = (l1+l2+l3)/2

    override fun perimetro(): Double = l1+l2+l3
}

fun practica1(){
    val triangulo =  Triangulo(3.0,5.5,3.0)

    println("${triangulo.area()}")
    println("${triangulo.perimetro()}")
    
}

//TODO: Level 2

abstract class Figura2(val nombre: String){
    abstract fun area(): Double 
    abstract fun perimetro(): Double
    fun mostrarInfo(){
        println("Nombre: $nombre,\nÁrea: ${area()},\nPerimetro: ${perimetro()}")
    }
}

class Circulo(nombre: String, val radio: Double): Figura2(nombre) {
    //Init se ejecuta al crearce la instancia del objeto. Todo lo que este dentro de este se ejecutara.
    init{
    //require sirve para asegurarse que se cola una condicion sino lanza error.
        require(radio > 0){"IllegalArgumentException"} 
    }

    override fun area(): Double = PI * (radio*radio)

    override fun perimetro(): Double = 2 * PI * radio
}

class Rectangulo(nombre: String,val ancho: Double, val altura: Double): Figura2(nombre){

    init{
        require(ancho != 0.0){"El ancho es 0"}
        require(altura != 0.0){"El ancho es 0"}
    }

    override fun area(): Double = ancho * altura

    override fun perimetro(): Double = 2 * (ancho+altura)
}

class Triangulo2(nombre: String, val l1:Double, val l2: Double, val l3:Double, val base: Double, val altura: Double): Figura2(nombre){

    init{
        require(l1 > 0) {"IllegalArgumentException"}
        require(l2 > 0) {"IllegalArgumentException"}
        require(l3 > 0) {"IllegalArgumentException"}
    }

    override fun area(): Double = (base * altura)/2

    override fun perimetro(): Double = l1+l2+l3
}


fun practicas2(){
    val redondo = Circulo("red", 2.78)

    val rect = Rectangulo("Brud", 10.0, 6.0)

    val tri = Triangulo2("Triangulo",1.9,2.0,3.0,2.0,3.0)

    
    //Todas las funciones heredan la funcion mostrarInfo() de su padre.
    println("--".repeat(25))
    redondo.mostrarInfo()
    println("--".repeat(25))
    rect.mostrarInfo()
    println("--".repeat(25))
    tri.mostrarInfo()
    println("--".repeat(25))

    
}

fun main(){
    practica1()
    practicas2()
}
