import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)

    // Llegim el primer número
    var nombre = scan.nextInt()
    //Variable per al nombre mes gran
    var nombreMaxim = nombre
    var nombreMinim = nombre

    // Continuem llegint mentre el número no sigui zero
    while (nombre != 0) {
        nombre = scan.nextInt()
        if (nombre != 0) {
            //Comprovem si en algun moment un nombre és més gran que nombreMaxim, per determinar si ha sigut el més gran.
            if (nombre > nombreMaxim) nombreMaxim = nombre
            //Comprovem si en algun moment un nombre és més petit que nombreMinim, per determinar si ha sigut el més petit.
            if (nombre < nombreMinim) nombreMinim = nombre
        }
    }
    // Mostrem resultat
    println("$nombreMaxim $nombreMinim")
}
