import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    //Llegir la resposta
    val numero1 = scanner.nextInt()
    val numero2 = scanner.nextInt()
    val numero3 = scanner.nextInt()
    if(numero1==numero2)print("SI")
    else if (numero1==numero3)print("SI")
    else if (numero2==numero3)print("SI")
    else print("NO")
}