import java.util.Scanner

fun main() {
//Input, 3 lines:
//Read the number of cases
//Each case has 2 lines; the first one has the amount of alumnes (which represent the lines) and the amount of mòduls(which represent the columns)
//Followed by alumnes*mòduls numbers which represent the grade grid.

//Output:
//Print the average grades of all alumnes. Ignore the commas, only show the number.

    val sc = Scanner(System.`in`)
    val amountOfCases = sc.nextInt()

    repeat(amountOfCases) {
        //Read the dimensions of the matrix
        val lines = sc.nextInt()
        val columns = sc.nextInt()

        //Define the matrix
        val matrix = Array(lines) { IntArray(columns) }

        //Read all the numbers inside the matrix
        for (row in 0 until lines) {
            for (col in 0 until columns) {
                matrix[row][col] = sc.nextInt()
            }
        }

        //Initialize the variable to store the average grade of the student
        var averageGrade = 0


        for (row in 0 until lines) {
            for (col in 0 until columns) {
                //Add the grades of the student to the averageGrade variable
                averageGrade += matrix[row][col]
            }
            //Show the average grade of that student
            print("${averageGrade/columns} ")
            //Reset the counter to 0 and proceed with the next student
            averageGrade = 0
        }
    }
}