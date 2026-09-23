//Se usa <T> Para que reciba parametros de cualquier tipo.
class Box<T>(val content: T){
    
    fun show()= println(content)
}

//Se puede usar cualquier letra pero T,K,V son covenciones ejemplo k significa key.

fun main(){

    val boxInt = Box(4)
    
    boxInt.show()

    val boxBool = Box(true)

    boxBool.show()

}
