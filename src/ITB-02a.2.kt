import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    //Llegir la resposta
    val edat = scanner.nextInt()
    if(edat<32) print("SI")
    else print("NO")
}