import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    //Llegim l'entrada dels dos jugadors
    val jugador1 = scanner.nextInt()
    val jugador2 = scanner.nextInt()

    //Creem una variable per cada acció amb el seu valor corresponent
    // 1 = Pedra, 2 = Paper, 3 = Tisora.
    val pedra: Int = 1
    val paper: Int = 2
    val tisora: Int = 3

    //Creem un condicional on si el valor introduit per cada jugador no estigui entre pedra i tisora mostrem "ERROR"
    if (jugador1 !in pedra..tisora || jugador2 !in pedra..tisora) {
        print("Error")
    }
    //Creem un condicional que mostri "EMPAT" si els dos jugadors tenen valor igual
    else if (jugador2 == jugador1) print("EMPAT")

    //Creem un condicional on Jugador2 guanya si es mes gran que jugador 1
    //Excepte quan jugador2 escull tisora y l'altre pedra
    else if (jugador2 > jugador1 && !(jugador2 == tisora && jugador1 == pedra)) {
        print("Jugador2")
    }

    //Creem el mateix condicional per al jugador1
    else if (jugador1 > jugador2 && !(jugador1 == tisora && jugador2 == pedra)) {
        print("Jugador1")
    }

    //Creem un condicional on si jugador2 es tisora i jugador1 pedra, jugador1 guanya
    //Si no, jugador2 guanya, ya que el cas que queda es el mateix pero invertit.
    else if(jugador2 == tisora && jugador1 == pedra) print("Jugador1")
    else print("Jugador2")


}
