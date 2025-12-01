import java.util.Scanner

//Input
//3 lines
//First line will have 2 numbers, F and C, which represents the dimensions of the matrix
//After that, we introduce F lines with C numbers each
//Lastly, a  k number

//Output
//Print the sum of all the numbers in line k, and the sum of all the numbers in column k
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


    val k = sc.nextInt()
    //Initialize the sums of the numbers in row k and column k
    var sumRow = 0
    var sumCol = 0

    //Fins the numbers in row k and column k and add them up into their corresponding variable.
    for (row in 0 until amountOfRows){
        for (col in 0 until amountOfColumns){
            if(row==k){
                sumRow += matrix[row][col]
            }
            if(col==k){
                sumCol+= matrix[row][col]
            }
        }
    }


    println("$sumRow $sumCol")


}