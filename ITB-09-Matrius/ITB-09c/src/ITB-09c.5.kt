import java.util.Scanner

//Input:
//First line has two numbers, F and C representing rows and columns of the matrix.
//Then, F lines that contain C numbers each representing the matrix elements.

//Output:
//Print the transposed of the matrix

fun main() {
    val sc = Scanner(System.`in`)

    //read rows and columns
    val rows = sc.nextInt()
    val columns = sc.nextInt()

    val matrix = Array(rows) { IntArray(columns) } //define the matrix

    // Read matrix values
    for (row in 0 until rows) {
        for (col in 0 until columns) {
            matrix[row][col] = sc.nextInt()
        }
    }

    //Transpose the matrix
    for (col in 0 until columns) {
        for (row in 0 until rows) {
            print(matrix[row][col])
            if (row < rows - 1) print(" ") // space between numbers
        }
        println()
    }
}