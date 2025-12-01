import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    // Llegim el nombre de casos
    val nombreRepeticions = scan.nextInt()

    //Repetim fins nombreRepeticions
    repeat(nombreRepeticions) {
        //Llegim la paraula
        val paraules = scan.next()
        // La imprimim
        println(paraules)
    }
}