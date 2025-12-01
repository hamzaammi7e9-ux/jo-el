import java.util.Scanner

fun main() {

// Input:
// A number N representing the size of the box of votes

// Output:
// Print a square matrix. All the borders and the two diagonals must contain "X", the rest of the boxe contain "."

    val scanner = Scanner(System.`in`)

    val size = scanner.nextInt()

    for (row in 1..size) {
        for (column in 1..size) {

            //Initialize booleans for checking the position.
            var border = false //()
            var firstDiagonal = false// ()
            var secondDiagonal = false//()

            //Turn those booleans to true if the current position meets their requirements

            if(row == 1 || row == size || column == 1 || column == size){
                border=true
            }

            if(row == column){
                firstDiagonal=true
            }
            if(row + column == size + 1){
                secondDiagonal=true
            }

            //If it meets them, print "X"
            if (border || firstDiagonal || secondDiagonal) {
                print("X")
            } else {
                print(".")
            }
        }
        println()
    }
}