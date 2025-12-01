import java.util.Scanner

fun main() {
//Input, 3 lines:
//Read the number of cases
//For each case, first read the dimensions of the matrix, followed by f*c numbers

//Output:
//Print the position (line, column) of the greatest number in the matrix

    val sc = Scanner(System.`in`)
    val amountOfCases = sc.nextInt()

    repeat(amountOfCases) {
        //Read the dimensions of the matrix
        val rows = sc.nextInt()
        val columns = sc.nextInt()

        //Define the matrix
        val matrix = Array(rows) { IntArray(columns) }

        //Read all the numbers inside the matrix
        for (row in 0 until rows) {
            for (col in 0 until columns) {
                matrix[row][col] = sc.nextInt()
            }
        }

        //Initialize the variables to store the greatest number and its position.
        var greatestNumber = 0
        var greatestNumberPosition = ""

        //Look for the greatest number in the array
        for (row in 0 until rows) {
            for (col in 0 until columns) {
                if (matrix[row][col] > greatestNumber) {
                    greatestNumber = matrix[row][col]
                    greatestNumberPosition = "${row+1} ${col+1}" //Columns and lines are expressed as a human would.
                }
            }
        }

        println(greatestNumberPosition)
    }
}