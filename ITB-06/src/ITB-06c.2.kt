import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val numCasos = scanner.nextInt()

    repeat(numCasos) {
        val cartesDisponibles = scanner.nextInt()

        var cartesRestants = cartesDisponibles
        var alcada = 0
        var nivellActual = 1

        var cartesPerAlProximNivell = 2


        while (cartesRestants >= cartesPerAlProximNivell) {

            cartesRestants -= cartesPerAlProximNivell
            alcada++

            nivellActual++

            cartesPerAlProximNivell = 3 * nivellActual - 1
        }

        println("$alcada $cartesRestants")
    }
}