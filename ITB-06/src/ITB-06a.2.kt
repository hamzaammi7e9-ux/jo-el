import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    // Llegim la nota
    var notes = scanner.nextFloat()

    var sumaNotes = 0f
    var notesValides = 0
    var excellent = 0
    var notable = 0
    var be = 0
    var suficient = 0
    var insuficient = 0
    var moltDeficient = 0

    //Creem un bucle que s'executarà sempre que notes no sigui -1.0 i continuarà llegint les notes.
    // El que fara és primer veure si les notes estan entre 0.0 i 10.0 per contar-les com a notesValides.
    // I també se sumarà a sumaNotes per després fer la mitjana aritmètica de totes les notes.
    // I dins crearem un when que sumarà 1 a notable, per exemple, quan estigui al seu interval.
    while (notes != -1f) {
        if (notes in 0f..10f) {
            ++notesValides
            sumaNotes += notes
        }
        when (notes) {
            in 9f..10f -> ++excellent
            in 7f..8f -> ++notable
            6f -> ++be
            5f -> ++suficient
            4f -> ++insuficient
            in 0f..3f -> ++moltDeficient
        }
        notes = scanner.nextFloat()
    }

    //Ara creem la variable mitjanaNotes, on es calcularà la mitjana aritmètica, sempre que la que hi hagi més de 0 notes vàlides.
    val mitjanaNotes: Float = if (notesValides > 0) sumaNotes / notesValides else 0f

    //Finalment, imprimim el resultat
    println("NOTES: $notesValides MITJANA: $mitjanaNotes E: $excellent N: $notable B: $be S: $suficient I: $insuficient MD: $moltDeficient")
}
