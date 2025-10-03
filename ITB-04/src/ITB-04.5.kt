import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    //Llegim la tecla introduïda.
    val accióSwitch : String = scanner.nextLine()
    //Creem un condicional que mostri l'acció resultant depenent de la tecla introduïda.
    when (accióSwitch) {
        "Q" -> print("Skill 1")
        "W" -> print("Skill 2")
        "E" -> print("Skill 3")
        "R" -> print("Ultimate")
        "B" -> print("Recall")
        "D" -> print("Bronzes never use summoners")
        "F" -> print("Bronzes never use summoners")
        else -> print("Error")
    }
}