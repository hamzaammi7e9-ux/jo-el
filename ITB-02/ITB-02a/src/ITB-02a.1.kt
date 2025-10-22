import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    //Llegir la resposta
    val votsJiden = scanner.nextLine().toInt()
    val votsDrump = scanner.nextLine().toInt()

    //Mostrar a la pantalla la casa a que pertany l'usuari depenent de la resposta
    if (votsJiden==votsDrump)
        print("No")
    else if(votsDrump>votsJiden)
        print("Drump")
    else print("Jiden")
}