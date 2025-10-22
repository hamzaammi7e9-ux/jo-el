import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    /*
    Creem les variables per al total de notes i total de notes de 10, i al principi seran 0, ja que encara
    no s'ha introduït cap valor.
    */
    var totalNotes = 0
    var notes10 = 0
    //Llegim el valor de la nota
    var nota = scan.nextInt()
    /*
    Creem un bucle on, sempre que la nota no sigui -1, se sumarà 1 a totalNotes si la nota
    està entre 1 i 10, i el mateix a notes10 si la nota és igual a 10. I el bucle continuarà llegint fins que nota = -1
    */
    while (nota != -1) {
        if (nota in 0..10) totalNotes += 1
        if (nota == 10) notes10 += 1
        nota = scan.nextInt()
    }
    //Mostrem el valor de les 2 variables
    println("TOTAL NOTES: $totalNotes NOTES10: $notes10")
}
