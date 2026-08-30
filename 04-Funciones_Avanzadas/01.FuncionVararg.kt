
//Funcion Basica 
fun printData() {
    println("Funcion basica")
}

fun main() {

    //Funcion lambda
    val lambda : (String) -> Unit = {println(it)}

    printData()
    lambda("Funcion Lambda")

    

    
}
