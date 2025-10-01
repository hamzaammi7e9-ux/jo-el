import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    //Llegir la resposta
    val anyNaixement = scanner.nextInt()

    when (anyNaixement) {
        in 1945..1965 -> print("ok boomer")
        else -> print("nah")
    }

}