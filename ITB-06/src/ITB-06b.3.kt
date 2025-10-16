import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    //Llegim els casos totals
    val casosTotals = scanner.nextInt()

    repeat(casosTotals) {
        //Llegim la quantitat de dies en els quals es farà anàlisi.
        var diesAnalisi = scanner.nextInt()
        //Inicialitzem una variable alarma a false.
        var alarma = false
        //Creem un bucle que, sempre que diesAnalisi sigui >0 (o sigui, que no s'hagin acabat els dies)
        //llegir l'índex de contagis de cada dia. I si és >= 300, l'alarma canvia de false a true
        while (diesAnalisi > 0) {
            val indexContagis = scanner.nextInt()
            if (indexContagis >= 300) {
                alarma = true
            }
            //En restem 1 a dies anàlisi fins que arribi a 0
            --diesAnalisi
        }
        //Si l'alarma estava en true s'imprimeix "ALARMA, si no "OK"
        if (alarma) println("ALARMA") else println("OK")
    }

}

