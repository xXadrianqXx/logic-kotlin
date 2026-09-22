//Interface sirve para guardar solo Funciones/Constantes y se diferencia de abstract porque se puede usar varios interface en una clase.
interface Aves{
    fun cantar()
    fun comer()
}

interface SeresVivos{
    fun respirar()
}

class Gallo: Aves,SeresVivos{
    //Tambien llevan override obligatoriamente y debe incluir todas las funciones del interface. 
    override fun cantar() = println("CUCURUCU")
    override fun respirar() = println("szzzzzz")
    override fun comer() = println("Comiendo")
}

/*Tambien se puede usar los interfaces con un solo abstract y de 
 * alli es donde empezamos el polimorfismo*/

abstract class Vehiculos(){
    abstract fun encender()
}

interface Cambios{
    fun malCambio()
}

interface Velocidades{
    fun velMax()
}

//Como se menciono varios interfaces y un unico abstract class
class Carro(): Vehiculos(),Cambios,Velocidades{
    override fun malCambio() = println("Hubo un mal cambio")
    override fun encender() = println("run run....")
    override fun velMax() = println("Velocidad maxima alcanzada")
}

class Motocicleta(): Vehiculos(),Cambios,Velocidades{
    override fun malCambio() = println("Hubo un mal cambio")
    override fun encender() = println("bun bun....")
    override fun velMax() = println("Velocidad maxima alcanzada")
}

//Solo se puden usar las funciones del objeto que se a mencionado en el parametro.
fun prender(self: Cambios){
    self.malCambio()
}

fun main(){
    val gallo = Gallo()
    gallo.respirar()
    gallo.cantar()

    val carro = Carro()

    val motocicleta = Motocicleta()
    
    //Segun lo investigado el polimorfismo consiste en usar diferentes objetos y hacer que ejecuten la misma funcion.  
    prender(carro)
    prender(motocicleta)
}
