import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val amountOfCases = scanner.nextInt()
    scanner.nextLine() //skip line

    repeat (amountOfCases) {
        val sentence = scanner.nextLine() // read the full sentence

        // Split the sentence into words using space as separator
        val wordsArray = sentence.split(" ").toTypedArray()

        var maxWordLength = 0 // variable to keep track of the longest word length

        for (word in wordsArray) {
            val wordLength = word.length // count length in the current word
            if (wordLength > maxWordLength) {
                maxWordLength = wordLength // update if this word is longer
            }
        }
        //Loops through all the words until the longest word is found.

        // Print the length of the longest word
        println(maxWordLength)
    }
}