import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    //Llegir la resposta
    val numero = scanner.nextInt()
    val divisió = numero % (1 or 2 or 3 or 4 or 5 or 6 or 7 or 8 or 9)
    if (divisió == 0) print("SI")
    else print("NO")
}