import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    //Llegim nombre de casoss
    val casosDeProva = scanner.nextInt()

    for (cas in 1..casosDeProva) {
        // Llegim els pisos de la piramide
        val pisos = scanner.nextInt()
        // Comptador dels Ferrero Rocher necessaris
        var ferrerosTotals = 0

        // Sumem els Ferreros de cada pis
        for (pisActual in 1..pisos) {
            val ferrerosPis = pisActual * (pisActual + 1) / 2  // triangular
            ferrerosTotals += ferrerosPis
        }
        // mostrem el total per aquest cas
        println(ferrerosTotals)
    }
}