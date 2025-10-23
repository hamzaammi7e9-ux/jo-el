import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    //Llegim la frase
    var frase: String = scanner.nextLine()

    //Comprovem que la frase no sigui "FIN" per acabar el bucle quan ho sigui.
    while (frase != "FIN") {
        //Inicialitzem els contadors per cada signe d'exclamació
        var exclamacioCapAmunt: Int = 0
        var exclamacioCapAbaix: Int = 0
        //Fem un bucle que sumi 1 a un contador quan trobi el seu signe d'exclamació a la frase
        for (signeExclamacio in frase) {
            if (signeExclamacio == '!') ++exclamacioCapAbaix
            if (signeExclamacio == '¡') ++exclamacioCapAmunt
        }
        //Si els dos contadors tenen la mateixa quantitat de signes d'exclamació imprimim "SI"
        if (exclamacioCapAbaix == exclamacioCapAmunt) println("SI")
        //I "NO" si no es el cas
        else println("NO")
        //Llegim la següent frase
        frase = scanner.nextLine()
    }
}