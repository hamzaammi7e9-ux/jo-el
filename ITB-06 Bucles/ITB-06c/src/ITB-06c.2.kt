import java.util.*

fun main() {
    // Scanner per llegir dades d'entrada
    val scanner = Scanner(System.`in`)

    // Llegim el nombre total de casos
    var casosTotals = scanner.nextInt()
    var casActual = 1

    // Fem un bucle a cada cas
    while (casActual <= casosTotals) {

        // Llegim les cartes disponibles per aquest cas
        var cartesDisponibles = scanner.nextInt()

        // Inicialitzem variables per calcular l'altura de la piràmide
        var alturaPiramide = 0
        var cartesUtilitzades = 0
        var nivellActual = 1
        var cartesNecessaries = 2  // primer nivell necessita 2 cartes

        // Construïm la piràmide mentre hi hagi cartes suficients
        while (cartesUtilitzades + cartesNecessaries <= cartesDisponibles) {
            cartesUtilitzades += cartesNecessaries
            alturaPiramide++
            nivellActual++
            cartesNecessaries = nivellActual * 2 + (nivellActual - 1)
        }

        // Cartes que sobren després de construir tots els nivells possibles
        val cartesSobrants = cartesDisponibles - cartesUtilitzades

        // Imprimim resultat: alçada i cartes sobrants
        println("$alturaPiramide $cartesSobrants")

        casActual++
    }
}