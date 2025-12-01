import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    //Llegim el dany inicial
    val danyInicial = scanner.nextInt()
    var dany = danyInicial
    //Llegim la vida inicial de l'enemic
    val vidaInicialEnemic = scanner.nextInt()
    //Creem la variable de les explosions tirades, que al principi és 1
    var explosionsTirades = 1
    //Creem la variable per la vida d'enemic després del dany inicial
    var vidaEnemic = vidaInicialEnemic - danyInicial

    //Ara fem un bucle on, sempre que vidaEnemic > 0, se sumarà 1 explosió tirada. I se sumarà dany inicial a dany per aumentarlo un 100% més.
    //I aquest es restarà a vida enemiga.
    while (vidaEnemic > 0) {
        ++explosionsTirades
        dany += danyInicial
        vidaEnemic -= dany
    }
    //Quan la vida arribi a 0, es mostrarà les explosions que s'han tirat.
    println(explosionsTirades)
}
