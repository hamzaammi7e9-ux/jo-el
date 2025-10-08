import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    val nombreCasos = scan.nextInt()
    repeat(nombreCasos){
        val nombreRepeticions = scan.nextInt()
        repeat(nombreRepeticions){
            println("No ofendre al president patata")
        }
    }
}