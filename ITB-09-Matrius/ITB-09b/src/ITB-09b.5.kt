import java.util.Scanner

fun main() {

//Input:
//First line: two numbers, number of rows and columns
//Then rows*columns strings: the content of the timetable (there is exactly one "SPIDERMAN" in the matrix)

// Output:
//Print two lines:
//The class immediately above SPIDERMAN, or "NO" if SPIDERMAN is in the first row
//The class immediately below SPIDERMAN, or "NO" if SPIDERMAN is in the last row

    val scanner = Scanner(System.`in`)

    val rows = scanner.nextInt()
    val columns = scanner.nextInt()

    // Read the timetable matrix
    val timetable = Array(rows) { Array(columns) { "" } }
    for (row in 0 until rows) {
        for (col in 0 until columns) {
            timetable[row][col] = scanner.next()
        }
    }

    var rowOfSpiderman = -1
    var colOfSpiderman = -1

    // Find SPIDERMAN's position
    for (row in 0 until rows) {
        for (col in 0 until columns) {
            if (timetable[row][col] == "SPIDERMAN") {
                rowOfSpiderman = row
                colOfSpiderman = col
            }
        }
    }

    // Print the class above SPIDERMAN or "NO" if first row
    if (rowOfSpiderman == 0) {
        println("NO")
    } else {
        println(timetable[rowOfSpiderman - 1][colOfSpiderman])
    }

    // Print the class below SPIDERMAN or "NO" if last row
    if (rowOfSpiderman == rows - 1) {
        println("NO")
    } else {
        println(timetable[rowOfSpiderman + 1][colOfSpiderman])
    }
}