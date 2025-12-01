import java.util.Scanner

fun main() {


//Input:
//First line: two integers, number of rows and columns
//Next rows*columns strings: the content of the timetable (there is exactly one "SPIDERMAN" in the matrix)
    // Output:
    // Print the string (class) immediately above "SPIDERMAN"
    // If "SPIDERMAN" is in the first row, print "NO"

    val sc = Scanner(System.`in`)

    // Read number of rows and columns
    val rows = sc.nextInt()
    val cols = sc.nextInt()

    val matrix = Array(rows) { Array(cols) { "" } }

    //Read the values inside the timetable matrix
    for (row in 0 until rows) {
        for (col in 0 until cols) {
            matrix[row][col] = sc.next()
        }
    }

    var rowOfSpiderman = -1
    var colOfSpiderman = -1

    // Find SPIDERMAN's position
    for (row in 0 until rows) {
        for (col in 0 until cols) {
            if (matrix[row][col] == "SPIDERMAN") {
                rowOfSpiderman = row
                colOfSpiderman = col
            }
        }
    }

    // Check if SPIDERMAN is in first row
    if (rowOfSpiderman == 0) {
        println("NO")
    } else {
        println(matrix[rowOfSpiderman - 1][colOfSpiderman])
    }
}