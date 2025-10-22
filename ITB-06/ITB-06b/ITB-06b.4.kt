import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    //Llegim els casos totals
    val casosTotals = scanner.nextInt()

    repeat(casosTotals) {
        //Inicialitzem les variables de cada categoria a false, després canviaran o no depenent dels valors d'energia.
        //No fa falta una variable per la categoria H, ja que és l'últim cas.
        var categoriaM = false
        var categoriaB = false
        var limitValors = 5
        //Creem un bucle on es llegirà mesuraments d'energia fins que limitValors sigui 0
        //Si el mesurament d'energia és >= 10000, categoriaM
        //Si és >= 1000, categoria B.
        //I si cap de les dues condicions són certes, sabrem que és de categoria H.
        while (limitValors > 0) {
            val mesuramentsEnergia = scanner.nextInt()
            if (mesuramentsEnergia >= 10000) {
                categoriaM = true
            }
            else if(mesuramentsEnergia >= 1000){
                categoriaB = true
            }
            --limitValors
        }
        //Imprimim el resultat depenent de la categoria a la qual pertany la persona.
        if (categoriaM) println("M")
        else if(categoriaB) println("B")
        else println("H")
    }

}

