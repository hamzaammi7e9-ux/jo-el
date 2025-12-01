import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    //Llegim l'any de naixement
    val anyNaixement: Int = scanner.nextInt()
    //Fem el modul amb 100 per quedar-se amb els dos ultims digits només
    val ultimsDosDigits = anyNaixement % 100
    //Fem un condicional que comprovi si els digits estan entre 90 i 99 i mostrem "SI"
    if (ultimsDosDigits in 90..99) print("SI")
    //Si no, mostrem "NO"
    else print("NO")
}