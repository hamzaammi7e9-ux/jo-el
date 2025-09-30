import java.util.Scanner
import kotlin.system.exitProcess

fun main() {
    val scanner = Scanner(System.`in`)
    //Llegir la resposta
    val resposta = scanner.nextLine()
    //Mostrar a la pantalla la casa a que pertany l'usuari depenent de la resposta
    if (resposta=="Coratge") println("Gryffindor")
    else if (resposta=="Coneixement") println("Ravenclaw")
    else if (resposta=="Ambicio") println("Slytherin")
    else if (resposta=="Yo en realitat vull ser cuiner") println("Hufflepuff")
    else println("x")
}