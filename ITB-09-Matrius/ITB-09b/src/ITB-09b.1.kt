import java.util.Scanner
//Input:
//First line: two integers, number of rows and columns
//Next rows lines: each line has columns integers representing prices
//Last line: one integer, the multiplication factor


//Output:
//Print the new matrix after multiplying each price by the factor
//Each row in one line, numbers separated by spaces

fun main() {
    val sc = Scanner(System.`in`)

    val rows = sc.nextInt()
    val columns = sc.nextInt()

    val matrix = Array(rows) { IntArray(columns) }

    // Read the matrix
    for (row in 0 until rows) {
        for (col in 0 until columns) {
            matrix[row][col] = sc.nextInt()
        }
    }

    // Read the increase factor
    val increase = sc.nextInt()

    // Multiply each price by the increase factor and print the new matrix
    for (row in 0 until rows) {
        for (col in 0 until columns) {
            val newPrice = matrix[row][col] * increase
            print("$newPrice")
            if (col != columns - 1) print(" ")
        }
        println()
    }
}