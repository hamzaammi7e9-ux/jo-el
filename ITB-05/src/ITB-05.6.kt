import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    // Llegim el nombre de casos
    val nombreRepeticions = scan.nextInt()


    repeat(nombreRepeticions) {
        // Llegim el nombre per aquest cas
        val nombre = scan.nextInt()
        // Imprimim el nombre + 1
        println(nombre + 1)
    }
}
