import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    // Llegim el nombre de casos
    val nombreRepeticions = scan.nextInt()

    //Repetim fins nombreRepeticions
    repeat(nombreRepeticions) {
        var nombre = scan.nextInt()
        repeat(nombre){
            nombre == nombre*(--nombre)
        }
        println(nombre)
    }
}