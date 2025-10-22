import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    //Llegim el numero del dia
    val dia = scanner.nextInt()
    //Creem un when que mostri a la pantalla el nombre del dia depenent del valor introduit
    //Si s'introdueix un nombre que no estigui entre l'1 i el 7, es mostrará "Error".
    when (dia) {
        1 -> print("Monday")
        2 -> print("Tuesday")
        3 -> print("Wednesday")
        4 -> print("Thursday")
        5 -> print("Friday")
        6 -> print("Saturday")
        7 -> print("Sunday")
        else -> print("Error")
    }
}