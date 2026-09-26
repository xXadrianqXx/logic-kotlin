//Sealed Class es una clase cerrada y sirve para gestionar estados.

sealed class EstadoPlayer{
    /*EstadoPalyer al final es para que el compilador sepa que estos data class heredan
    de EstadoPlayer*/
    /* data class para estados con datos y object para realizar acciones al paa a ese estado*/

    data class Vivo(val state:String): EstadoPlayer()
    data class Muerto(val state:String): EstadoPlayer()
    object Revivir: EstadoPlayer()
}


fun statePlayer(s: EstadoPlayer){
    //No es necesario el else en el when poque el compilador ya sabe cuantos estados son.
    when(s){
        is EstadoPlayer.Vivo -> {
            println("Xd ${s.state}")
        }

        is EstadoPlayer.Muerto -> {
            println(s.state)
        }

        is EstadoPlayer.Revivir -> {
            println("Revivi")
        }

    }
}

//Sealed class Avanzado

sealed class Pago{
    sealed class Tarjeta: Pago(){
        data class Exito(val saldo: String): Tarjeta()
    }

    sealed class Efectivo: Pago(){
        data class Exito(val saldo: String): Efectivo()
    }
}

//PAra llamar alos sealed Class anidados ocupamos fuciones anidadas.
fun pago(e: Pago){
    when(e){
        is Pago.Efectivo -> efectivo(e)
        is Pago.Tarjeta -> tarjeta(e)
    }

}

fun efectivo(e: Pago.Efectivo){
    when(e){
        is Pago.Efectivo.Exito -> println("Pago Efectivo exitoso")
    }
}

fun tarjeta(e: Pago.Tarjeta){
    when(e){
        is Pago.Tarjeta.Exito -> println("Pago exitoso")
    }
}

fun main(){
    statePlayer(EstadoPlayer.Vivo("Estoy Vivo"))
    statePlayer(EstadoPlayer.Muerto("Estoy Muerto"))


    pago(Pago.Efectivo.Exito("22"))
    pago(Pago.Tarjeta.Exito("22"))

}

//Tambien se usa Sealed Interface la hay varias diferencias pero la mas llamativa es 
//que al final de data class.... solo va el nombre de la interface porque el inteface
//no tiene contructor: Pago sin ()
