import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    // Llegim el nombre total de casos
    val totalCasos = scanner.nextInt()

    repeat (totalCasos) {

        // Llegim les dues paraules, la meva i la que ha escrit WebCasteller
        val paraulaDita = scanner.next()
        val paraulaWeb = scanner.next()

        // Comprobem la longitud de la paraula més llarga
        val longitudMaxima = if (paraulaDita.length > paraulaWeb.length) paraulaDita.length
        else paraulaWeb.length

        // Comptador de lletres iguals en la mateixa posició
        var lletresIguals = 0

        // Fem un bucle per comparar les dues paraules lletra a lletra
        var posicio = 0
        while (posicio < longitudMaxima) {
            // Si les dues paraules tenen una lletra en aquesta posició
            if (posicio < paraulaDita.length && posicio < paraulaWeb.length) {
                if (paraulaDita[posicio] == paraulaWeb[posicio]) {
                    lletresIguals = lletresIguals + 1
                }
            }
            posicio = posicio + 1
        }

        // Ara comprobem que com a mínim la meitat de les lletres coincideixen
        val meitat = longitudMaxima / 2.0
        val resultatCorrecte = lletresIguals >= meitat

        // Mostrem el resultat depenent del cas que hagi passat
        if (resultatCorrecte) {
            println("GRACIES WEBCASTELLER")
        } else {
            println("WEBCASTELLER ESTA TRAVIESO HOY")
        }
    }
}