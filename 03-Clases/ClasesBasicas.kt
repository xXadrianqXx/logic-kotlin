open class Animal(val nombre:String){
    fun comer(){
        println("$nombre esta comiendo")
    }
}

class Perro(nombre: String): Animal(nombre) {
    fun ladrar(){
        println("$nombre es ta ladrando")
    }
}

class Gato(nombre: String): Animal(nombre){
    fun maullar(){
        println("$nombre es ta ladrado")
        
    }
}
