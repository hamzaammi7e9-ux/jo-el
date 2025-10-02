import java.util.Scanner
import javax.swing.text.Segment

fun main() {
    val scanner = Scanner(System.`in`)
    //Llegim el numero del dia
    val primerNombre = scanner.nextInt()
    val segonNombre = scanner.nextInt()
    val tercerNombre = scanner.nextInt()
    val quartNombre = scanner.nextInt()
    val cinqueNombre = scanner.nextInt()
    if (primerNombre < segonNombre && tercerNombre < segonNombre && quartNombre > tercerNombre && cinqueNombre < quartNombre) {
        print("SI")
    } else if (primerNombre > segonNombre && segonNombre < tercerNombre && quartNombre < tercerNombre && quartNombre < cinqueNombre) {

    }
}