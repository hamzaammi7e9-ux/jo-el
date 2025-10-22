import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    //Llegim el nombre de casos
    val nombreCasos = scanner.nextInt()


    repeat(nombreCasos) {
        //llegim el nombre de pisos
        val nombrePisos = scanner.nextInt()
        //Amb aquesta fórmula, trèiem el nombre de bombons necessaris
        val bombonsNecessaris = ((nombrePisos * (nombrePisos + 1)) * (2 * nombrePisos + 1)) / 6
        //Imprimim el resultat
        println(bombonsNecessaris)
    }

}
