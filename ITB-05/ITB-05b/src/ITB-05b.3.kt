import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    // Llegim el primer nombre del compte enrere
    var compteEnrere = scan.nextInt()
    //Imprimim aquest primer
    println(compteEnrere)

    //Fem un bucle on, sempre que el nombre del compteEnrere no sigui 0 i sigui positiu, es restarà 1 fins que arribi a 0.
    while(compteEnrere!=0 && compteEnrere > 0){
        println(--compteEnrere)
    }
}
