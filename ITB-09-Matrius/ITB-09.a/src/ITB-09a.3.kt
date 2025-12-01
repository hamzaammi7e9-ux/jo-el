import java.util.Scanner

fun main() {
//Input, 3 lines:
//First one has 2 numbers, F and C, which represent the size of the matrix.
//After that, there has to be F lines with C numbers each.
//Last line has 2 numbers, i and j.

//Output:
//First, print the matrix line by line, with the numbers separated by spaces.
//Then, in another line, show the content of the matrix in line i and column j

    val sc = Scanner(System.`in`)

    //Read the size of the matrix
    val rows = sc.nextInt()
    val columns = sc.nextInt()

    //Define the matrix
    val matrix = Array(rows){ IntArray(columns) }

    //Read all the numbers inside the matrix
    for (row in 0 until rows){
        for (col in 0 until columns) {
            matrix[row][col] = sc.nextInt()
        }
    }


    val i = sc.nextInt()
    val j = sc.nextInt()

    //Print the matrix
    for (row in 0 until rows) {
        for (col in 0 until columns) {
            print("${matrix[row][col]}")
            if (col < columns - 1) print(" ")
        }
        println()
    }

    //Print the content of the matrix in row i, column j.
    println(matrix[i][j])
}