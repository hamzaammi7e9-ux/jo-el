import java.util.Scanner
fun main() {
    val scan = Scanner(System.`in`)

    var sumaParells = 0
    var sumaSenars = 0

    var nombre = scan.nextInt()

    while (nombre != -1) {
        if (nombre in 0..10) sumaParells += 1
        if (nombre == 10) sumaSenars += 1
        nombre = scan.nextInt()
    }

    println("TOTAL NOTES: $sumaParells NOTES10: $sumaSenars")
}
