
//Funcion Basica 
fun printData() {
    println("Funcion basica")
}

fun main() {
    printlData()

    //Funcion lambda
    val lambda : (String) -> Unit = {println(it)}

    lambda("Funcion Lambda")

    
}
