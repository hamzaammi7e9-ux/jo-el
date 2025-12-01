import java.util.Scanner
//Input :
//A number N representing the size of the matrix
//Read the content of the matrix

//Output:
//Print the corresponding identity matrix

fun main() {
    val sc = Scanner(System.`in`)
    val size = sc.nextInt()

    for (row in 0 until size) {
        for (col in 0 until size) {
            //When the row and column values are equal, put a "1" in that positon
            if (row == col) {
                print("1")
            } else {
                print("0")
            }
            //Add space between numbers
            if (col < size - 1) print(" ")
        }
        println()
    }
}