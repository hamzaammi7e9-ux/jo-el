import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    //Llegir els 3 nombres
    val nombre1 : Int = scanner.nextInt()
    val nombre2 : Int = scanner.nextInt()
    val nombre3 : Int = scanner.nextInt()

    //Comprovem que el nombre 1 és igual als dos altres i mostrem "SI"
    if(nombre1==nombre2 && nombre1 == nombre3) print("SI")
    //Si no, mostrem "NO"
    else print("NO")
}