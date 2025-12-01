import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    //Llegir el nombre
    val nombreNormal = scanner.nextLine().toFloat()
    //Invertir el nombre llegit amb 1/x
    val nombreInvertit: Float = (1 / nombreNormal)
    println(nombreInvertit)
}