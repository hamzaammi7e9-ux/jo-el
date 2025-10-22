import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    //Llegim el nombre de casos
    val totalCasos = scanner.nextInt()

    //Repetim "totalCasos" vegades
    repeat(totalCasos) {
        //Llegim el nombre del qual volem treure el factorial
        val nombre = scanner.nextInt()
        //Creem variable multiplicador per treure el factorial
        var multiplicador = 1L

        //Multipliquem el multiplicador per 1, 2... fins que arribi a nombre i ens donarà el factorial, i l'imprimim.
        for (i in 1..nombre) {
            multiplicador *= i
        }

        println(multiplicador)
    }
}
