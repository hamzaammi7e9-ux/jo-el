import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    //Llegir la resposta
    val resposta = scanner.next().toString()

    //Mostrar a la pantalla la casa a que pertany l'usuari depenent de la resposta
    if (resposta == "Coratge") println("Gryffindor")
    else if (resposta == "Coneixement") println("Ravenclaw")
    else if (resposta == "Ambicio") println("Slytherin")
    else println("Hufflepuff")

}