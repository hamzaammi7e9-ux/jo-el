import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    //Llegim els casos totals
    val casosTotals = scanner.nextInt()


    repeat(casosTotals) {
        //Llegim el nombre per cada repetició
        val nombre = scanner.nextInt()
        //La suma dels nombres naturals sera 0 al principi
        var sumaNombres = 0
        //El producte dels nombres naturals també
        var producteNombres = 1
        //Fem un bucle on, cada vegada que el nombre enter estigui entre 1 i nombre, s'afegirà a sumaNombres, i es multiplicarà a producteNombres.
        for (nombreEnter in 1..nombre) {
            sumaNombres += nombreEnter
            producteNombres *= nombreEnter
        }
        //Si el nombre introduït és més gran que 0, s'imprimirà la suma i el producte dels primers nombres naturals.
        if (nombre > 0) println("SUMA: $sumaNombres PRODUCTE: $producteNombres")
        //Si el nombre no era natural, imprimim això:
        else println("ELS NOMBRES NATURALS COMENCEN EN 1")
    }

}

