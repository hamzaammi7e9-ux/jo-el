import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    //Llegir la resposta
    val numero= scanner.next().toInt()
    //Mostrar a la pantalla la casa a que pertany l'usuari depenent de la resposta
    when (numero) {
        in 1..31 -> print(1)
        in 32..59 -> print(2)
        in 60..90 -> print(3)
        in 91..120 -> print(4)
        in 121..151 -> print(5)
        in 152..181 -> print(6)
        in 182..212 -> print(7)
        in 213..243 -> print(8)
        in 244..273 -> print(9)
        in 274..304 -> print(10)
        in 305..334 -> print(11)
        in 335..365 -> print(12)



    }
}