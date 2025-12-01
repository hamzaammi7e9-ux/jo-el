import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)
    // Llegim el danyInicial de la explosió
    val danyInicial = scanner.nextInt()
    // quantes explosions es faran
    val nombreExplosions = scanner.nextInt()
    // acumulador del dany total
    var danyTotal = 0

    // sumem el dany de cada explosió, que augmenta progressivament
    for (explosionActual in 1..nombreExplosions) {
        danyTotal += danyInicial * explosionActual
    }
    // mostrem el resultat final
    println(danyTotal)
}