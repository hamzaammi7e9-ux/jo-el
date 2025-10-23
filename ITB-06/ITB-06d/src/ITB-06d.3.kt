import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    //Llegim la frase
    val frase: String = scanner.nextLine().lowercase()

    //Inicialitzem el comptador de cada vocal
    var a: Int = 0
    var e: Int = 0
    var i: Int = 0
    var o: Int = 0
    var u: Int = 0

    //Per cada vocal que hi aparegui a la frase sumem 1 al seu comptador
    //També tindrem en compte les vocals amb accent.
    for (lletra in frase) {
        if (lletra == 'a' || lletra == 'à' || lletra == 'á') ++a
        if (lletra == 'e'|| lletra == 'è' || lletra == 'é') ++e
        if (lletra == 'i'|| lletra == 'í' || lletra == 'ï') ++i
        if (lletra == 'o'|| lletra == 'ò'|| lletra == 'ó') ++o
        if (lletra == 'u'|| lletra == 'ú'|| lletra == 'ü') ++u
    }
    //Si apareixen totes les vocals imprimim "TOTES"
    if (a > 0 && e > 0 && i > 0 && o > 0 && u > 0) print("TOTES")
    //Si no, imprimim "FALTEN"
    else print("FALTEN")
}