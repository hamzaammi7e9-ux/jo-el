import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    //Llegir dos valors de numeros
    val diaAny = scanner.nextInt()

    //Creem un condicional que mostri "Incorrecte" si el numero no esta entre 1 i 365
    if (diaAny !in 1..365 && diaAny != 366) {
        print("Incorrecte!")
    }
    // Creem un altre condicional que mostri "Correcte per un any bixest!" si el dia introduit és el 366
    if (diaAny == 366) {
        print("Correcte per un any bixest!")
    }
    //Si el valor del dia sí que està entre 1 i 365, és correcte per un any no bixest.
    if (diaAny in 1..365) print("Correcte per un any no bixest!")
}