import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    //Llegim el nombre de casos
    val totalCasos = scanner.nextInt()

    //Repetim "totalCasos" vegades
    repeat(totalCasos) {
        //Llegim el nombre
        val nombre = scanner.nextInt()

        //Fem un bucle que agafi els divisors que estiguin entre 1 i el nombre
        //Per comprovar si algun nombre de l'interval és divisor, fem el mòdul de nombre amb divisor, i si dona 0, l'imprimim.
        for (divisor in 1..nombre) {
            if(nombre%divisor==0) print("$divisor ")
        }

    }
}