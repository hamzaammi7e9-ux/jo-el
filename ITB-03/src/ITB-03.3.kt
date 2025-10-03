import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    //Llegir els 3 nombres
    val ex1 : Int = scanner.nextInt()
    val ex2 : Int = scanner.nextInt()
    val ex3 : Int = scanner.nextInt()
    val interes : Int = scanner.nextInt()

    //Comprovem que interes no tingui el mateix valor que qualsevol dels 3 ex i mostrem "NO"
    if(interes == ex1 || interes == ex2 || interes == ex3) print("NO")
    //Si no, mostrem "SÍ"
    else print("SI")
}