//TODO: LEVEL 1

//Se usa open para heredar la clase. Los parametros van con val.
open class Animal(val nombre:String){
    //Esta funcion se hereda a todos los hijos de esta clase.
    fun comer(){
        println("$nombre esta comiendo")
    }
}

//Al heredar una variable ya no es necesario declaararlan y simplemte se pasa el oarametro hacis la clase padre.
class Perro(nombre: String): Animal(nombre) {
    fun ladrar(){
        println("$nombre esta ladrando")
    }
}

class Gato(nombre: String): Animal(nombre){
    fun maullar(){
        println("$nombre esta maullando")
        
    }
}
//Ejecucion de las clases.
fun animales(){
//Declaramos vsriables que contemgar las clases con las caracteristicas requeridas. 
    val dog = Perro("Pimbo")
    val cat  = Gato("Lucas")
//Podemos llamar a las funciones heredadas de la clase padre y alas propias de la clase.
    cat.maullar()
    cat.comer()
    
    dog.ladrar()
    dog.comer()
}

//TODO: LEVEL 2

//Usamos open para que una clase se pueda heredar
open class Vehiculo(val marca: String, val modelo: String){
    //Usamos open en una funcion de una clase que se puede modificar.
   open fun arrancar(){
        println("Arrancando")
    }
}

class Camioneta(marca: String, modelo: String, val puertas: Int): Vehiculo(marca, modelo){
    //Con override podemos modificar una funcion abierta por la clase padre.
    override fun arrancar(){
        println("El vehiculo $marca ha arancado.")
    }
}

class Motocicleta(marca: String, modelo: String, val deportiva: Boolean): Vehiculo(marca, modelo){
    override fun arrancar(){
        println("La $marca ha arranacado") 
        
    }
    
}

fun vehiculos(){
    val moto = Motocicleta("Susuki","S", true)
    val carro = Camioneta("Toyota","Max", 7)

    moto.arrancar()
    //Se comprobo que se puede usar directamente los parametros de la clase.
    println("La moto es deportiva: ${if (moto.deportiva ==true)"Verdadero" else "Falso"}")

    carro.arrancar()
    println("El carro tiene ${carro.puertas} puertas")
}

fun main(){
    animales()
    vehiculos()
}
