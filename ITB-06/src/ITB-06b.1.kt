import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    //Llegim els casos totals
    val casosTotals = scanner.nextInt()
    //Contem des de 0 els nombres positius
    var nombresPositius = 0

    repeat(casosTotals) {
        //Llegir el nombre cada vegada que repetim
        val nombre = scanner.nextInt()
        //Si és més gran que 0, afegim 1 a nombresPositius
        if (nombre > 0) ++nombresPositius
    }
    //Imprimim el resultat
    println(nombresPositius)
}

