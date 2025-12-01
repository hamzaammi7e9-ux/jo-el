import java.util.Scanner

fun main() {
// Input:
//First line: K (size of the matrix, K x K)
//Then K lines for the first matrix
//Then K lines for the second matrix

//Output:
// Print the result of the sum of both matrix

    val sc = Scanner(System.`in`)
    val matrixSize = sc.nextInt() // Read K

    val firstMatrix = Array(matrixSize) { IntArray(matrixSize) }
    val secondMatrix = Array(matrixSize) { IntArray(matrixSize) }
    val resultMatrix = Array(matrixSize) { IntArray(matrixSize) }

    // Read the first matrix
    for (row in 0 until matrixSize) {
        for (col in 0 until matrixSize) {
            firstMatrix[row][col] = sc.nextInt()
        }
    }

    // Read the second matrix
    for (row in 0 until matrixSize) {
        for (col in 0 until matrixSize) {
            secondMatrix[row][col] = sc.nextInt()
        }
    }

    // Sum both matrix
    for (row in 0 until matrixSize) {
        for (col in 0 until matrixSize) {
            resultMatrix[row][col] = firstMatrix[row][col] + secondMatrix[row][col]
        }
    }

    //Print the result matrix
    for (row in 0 until matrixSize) {
        for (col in 0 until matrixSize) {
            print("${resultMatrix[row][col]} ")
        }
        println()
    }
}