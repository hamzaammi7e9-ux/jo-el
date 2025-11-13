import java.util.Scanner

//Make a program that reads a phrase with various words, then separate them with a split in an array of words.
//Then add an ellipsis at the end of each word if it is shorter than the next one, but don't add them to the last word.

//Input:
//amount of cases to test
//Each case has 1 line, containing a phrase formed by letters of the english alphabet and spaces.

//Output:
//For each case print the same line with the corresponding ellipsis added.

fun main() {

    val sc = Scanner(System.`in`)
    val amountOfCases = sc.nextInt()
    sc.nextLine()

    repeat(amountOfCases) {

        //Split the words in the line and turn them into an array
        val line = sc.nextLine().split(" ").toTypedArray()

        //Loop through the words in the line
        for (word in 0 until line.lastIndex) {
            //If the word is shorter than the next one, add an ellipsis to it.
            if (line[word].length < line[word + 1].length) {
                line[word] = "${line[word]}..."
            }
        }

        //Print the result
        println(line.joinToString(" "))
    }
}

