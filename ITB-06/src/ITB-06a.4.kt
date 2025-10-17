import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    //Llegim el nom
    val nom = scanner.next()
    val primeraLletra = nom[0]
    var nombreValid = false
    //Fem un bucle on si es troba una lletra en nom que sigui diferent de la primera lletra, el nom es vàlid.
    for (lletra in nom) {
        if (lletra != primeraLletra) {
            nombreValid = true
        }
    }

    //Si el nombre és vàlid, s'imprimeix "SI"
    //Si no, "NO"
    if (nombreValid) {
        println("SI")
    } else {
        println("NO")
    }
}
