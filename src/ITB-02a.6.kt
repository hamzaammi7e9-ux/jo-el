    import java.util.Scanner
    import kotlin.math.abs

    fun main() {
        val scanner = Scanner(System.`in`)

        //Llegir dos valors de numeros
        val numero1 = scanner.nextInt()
        val numero2 = scanner.nextInt()

        //Creem una variable que sigui igual al valor absolut de la diferència dels dos numeros.
        val diferenciaNumeros = abs(numero1 - numero2)
        //Mostrem a la pantalla el valor de la variable
        print(diferenciaNumeros)
    }