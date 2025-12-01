import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    //Llegim els cinc nombres
    val primerNombre = scanner.nextInt()
    val segonNombre = scanner.nextInt()
    val tercerNombre = scanner.nextInt()
    val quartNombre = scanner.nextInt()
    val cinqueNombre = scanner.nextInt()

    //Fem un condicional que mostri "SI" si el primer nombre és més petit que el segon, el segon més gran que el tercer...
    if (primerNombre < segonNombre && tercerNombre < segonNombre && quartNombre > tercerNombre && cinqueNombre < quartNombre) {
        print("SI")
    //I si no es compleix la primera condició, que mostri "SI" si el primer és més gran que el segon, el segon més petit que el tercer...
    } else if (primerNombre > segonNombre && segonNombre < tercerNombre && quartNombre < tercerNombre && quartNombre < cinqueNombre) {
        print("SI")
    //I si no es compleix cap condició, mostrar "NO"
    } else print("NO")
}