import java.util.Scanner

fun main() {
    val scanner: Scanner = Scanner(System.`in`)
    val segons = scanner.nextInt()
    when(segons) {
        in 1 until 43200 -> print("mati del dia 1")
        in 43200 until 86400 -> print("nit del dia 1")
        in 86400 until 129600 -> print("mati del dia 2")
        in 129600 until 172800 -> print("nit del dia 2")
        in 172800 until 216000 -> print("mati del dia 3")
        in 216000 until 259200 -> print("nit del dia 3")
        in 259200 until 302400 -> print("mati del dia 4")
        in 302400 until 345600 -> print("nit del dia 4")
        in 345600 until 388800 -> print("mati del dia 5")
        in 388800 until 432000 -> print("nit del dia 5")
        in 432000 until 475200 -> print("mati del dia 6")
        in 475200 until 518400 -> print("nit del dia 6")
        in 518400 until 561600 -> print("mati del dia 7")
        in 561600 until 604800 -> print("nit del dia 7")
        in 604800 until 648000 -> print("mati del dia 8")
        in 648000 until 691200 -> print("nit del dia 8")
        in 691200 until 734400 -> print("mati del dia 9")
        in 734400 until 777600 -> print("nit del dia 9")
        in 777600 until 820800 -> print("mati del dia 10")
        in 820800 until 864000 -> print("nit del dia 10")
        in 864000 until 907200 -> print("mati del dia 11")
        in 907200 until 950400 -> print("nit del dia 11")
        in 950400 until 993600 -> print("mati del dia 12")
        in 993600 until 1000000 -> print("nit del dia 12")

    }

}