import java.util.Scanner

//Input
//3 lines
//First line will have 2 numbers, F and C, which represents the size of the matrix
//After that, we introduce F lines with C numbers each
//Lastly, a  k number
//Output
//Print the line and column where k is located. If it is not found, print "-1 -1". It is guaranteed that k appears 0 or 1 times in the matrix.
fun main() {

    val sc = Scanner(System.`in`)

    val amountOfRows = sc.nextInt() // Number of rows
    val amountOfColumns = sc.nextInt() // Number of columns

    val matrix = Array(amountOfRows) { IntArray(amountOfColumns) } // Define the matrix

    // Read all the numbers for the matrix
    for (row in 0 until amountOfRows) {
        for (col in 0 until amountOfColumns) {
            matrix[row][col] = sc.nextInt()
        }
    }

    val numberToFind = sc.nextInt()

    // Variables to store the found position to, for the moment the value is -1 until the number to find exists in the matrix.
    var foundRow = -1
    var foundColumn = -1

    // Search the number in the matrix
    for (row in 0 until amountOfRows) {
        for (col in 0 until amountOfColumns) {
            if (matrix[row][col] == numberToFind) {
                foundRow = row
                foundColumn = col
            }
        }
    }

    // Output:
    println("$foundRow $foundColumn")

}