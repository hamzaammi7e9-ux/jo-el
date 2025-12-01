import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    //Llegim els casos
    val nombreCasos = scan.nextInt()
    //Fem un repeat de tantes vegades com nombre de casos té "nombreCasos", el qual llegeixi les vegades que es vol imprimir "No ofendre al president patata" en cada cas.
    repeat(nombreCasos){
        val nombreRepeticions = scan.nextInt()
        repeat(nombreRepeticions){
            println("No ofendre al president patata")
        }
    }
}