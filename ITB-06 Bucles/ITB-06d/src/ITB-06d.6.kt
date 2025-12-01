import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    // Llegim el nombre total de casos
    val totalCasos = scanner.nextInt()

    repeat (totalCasos) {

        // Llegim la generació actual
        val generacio = scanner.nextInt()

        // Cada dues generacions afegim un "caga" més
        val repeticionsCaga = (generacio - 1) / 2

        // Comencem la cançó amb "Caga "
        var canco = "Caga "

        // Afegim tantes vegades "caga" com sigui necessari segons la generació
        var comptadorRepeticions = 1
        while (comptadorRepeticions <= repeticionsCaga) {
            canco = canco + "caga"
            comptadorRepeticions = comptadorRepeticions + 1
        }

        // Afegim "tio!" al final
        canco = canco + "tio!"

        // Mostrem el resultat
        println(canco)
    }
}