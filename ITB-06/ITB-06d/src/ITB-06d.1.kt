import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    //Llegim els casos totals
    val casosTotals = scanner.nextInt()
    scanner.nextLine()

    repeat(casosTotals){
        //Llegim la frase
        val frase : String = scanner.nextLine()
        //Inicialitzem els comptadors de cada vocal
        var a : Int = 0
        var e : Int = 0
        var i : Int = 0
        var o : Int = 0
        var u : Int = 0

        //Fem un bucle que sumi 1 a cada comptador de vocal si apareix a la frase
        //Convertim les vocals a minúscula per no haver de diferenciar entre majúscula i minúscula.
        for(lletra in frase){
            if(lletra.lowercaseChar() == 'a')++a
            if(lletra.lowercaseChar() == 'e')++e
            if(lletra.lowercaseChar() == 'i')++i
            if(lletra.lowercaseChar() == 'o')++o
            if(lletra.lowercaseChar() == 'u')++u
        }
        //Imprimim la quantitat de vocals a la frase
        println("A: $a E: $e I: $i O: $o U: $u")
    }
}