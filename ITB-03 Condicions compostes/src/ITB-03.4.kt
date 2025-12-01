import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    //Llegir les coordenades
    val coordenadaX: Int = scanner.nextInt()
    val coordenadaY: Int = scanner.nextInt()
    //Creem una variable per a cada quadrant
    val quadrant1: String = "1"
    val quadrant2: String = "2"
    val quadrant3: String = "3"
    val quadrant4: String = "4"

    //Creem condicions per a cada cas depenent de les coordenades introduïdes i mostrem a quin o quins quadrants es troba.
    when {
        coordenadaY > 0 && coordenadaX > 0 -> print(quadrant1)
        coordenadaY < 0 && coordenadaX < 0 -> print(quadrant3)
        coordenadaY > 0 && coordenadaX < 0 -> print(quadrant2)
        coordenadaY < 0 && coordenadaX > 0 -> print(quadrant4)
        coordenadaX == 0 && coordenadaY > 0 -> print("$quadrant1,$quadrant2")
        coordenadaX < 0 && coordenadaY == 0 -> print("$quadrant2,$quadrant3")
        coordenadaY < 0 && coordenadaX == 0 -> print("$quadrant3,$quadrant4")
        coordenadaY == 0 && coordenadaX > 0 -> print("$quadrant1,$quadrant4")
        coordenadaY == 0 && coordenadaX == 0 -> print("1,2,3,4")
    }


}