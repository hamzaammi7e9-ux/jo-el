import java.util.Scanner

//Input:
// First line has three numbers, F, C and T
//F is the number of rows of the matrix
//C is the number of columns of the matrix
//T is the number Travolta is searching for on both sides
//Then, F lines that contain C numbers each representing the matrix elements

//Output:
//Print the first number in the matrix that has T to its left and right in the same row
//If that number doesn't exist, print NO

fun main() {
    val sc = Scanner(System.`in`)
    val rows = sc.nextInt()
    val columns = sc.nextInt()
    val searchingNumber = sc.nextInt()

    val matrix = Array(rows) { IntArray(columns) }

    // Read the matrix
    for (row in 0 until rows) {
        for (col in 0 until columns) {
            matrix[row][col] = sc.nextInt()
        }
    }

    //Initialize the boolean to check if we found T
    var found = false
    //Variable to store the first nomber that meets the condition
    var result = 0

    // Check each row for a number with T on both sides
    for (row in 0 until rows) {
        for (col in 1 until columns - 1) {
            // Checks if the element to the left and right equals t.
            if (!found && matrix[row][col - 1] == searchingNumber && matrix[row][col + 1] == searchingNumber) {
                result = matrix[row][col]
                found = true
            }
        }
    }

    //Print the result
    if (found) println(result) else println("NO")
}