import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    //Creem una variable per a cada candidat, menys per a Banders, ja que no fa utilitzar-ne una per ell.
    val votsJiden = scanner.nextLine().toInt()
    val votsDrump = scanner.nextLine().toInt()
    val votsBanders = scanner.nextLine().toInt()

    //Creem un condicional per a cada candidat on es mostri que aquest guanya si és més gran que els dos altres candidats.
    if (votsJiden > votsDrump && votsJiden > votsBanders) {
        print("Jiden")
    }
    else if (votsDrump > votsJiden && votsDrump > votsBanders) {
        print("Drump")
    }
    else if (votsBanders > votsJiden && votsBanders > votsDrump) {
        print("Banders")
    } else print("ERROR") //Com no pot haver-hi empat, es mostrarà error en tots els altres casos.

}