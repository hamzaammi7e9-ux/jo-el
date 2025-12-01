import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    //Llegim les hores, els minuts i els segons
    val hora = scanner.nextInt()
    val minuts = scanner.nextInt()
    val segons = scanner.nextInt()
    //Creem un condicional que comprovi si l'hora, els minuts i els segons estan en l'interval correcte i mostri "SI"
    //Si no, mostrem "NO"
    when{
        hora in 0 until 24 && minuts in 0..59 && segons in 0..59-> print ("SI")
        else -> print("NO")
    }
}