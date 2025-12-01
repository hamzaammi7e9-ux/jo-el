import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val amountOfCases = sc.nextInt()
    sc.nextLine() // skip line

    repeat (amountOfCases) {
        val numberOfWords = sc.nextInt()
        sc.nextLine() // skip line

        // Read all words and put them into an array
        val wordsArray = Array(numberOfWords) { sc.nextLine().trim() }

        var isCorrect = true // we assume the sequence is correct initially
        val wordLength = wordsArray[0].length // all words must have same length
        var wordPos = 1 //index in the array

        // Check each word in the sequence and see if they meet the conditions
        while (wordPos < numberOfWords && isCorrect) {
            val currentWord = wordsArray[wordPos]
            val previousWord = wordsArray[wordPos - 1]

            // All words must have same length
            if (currentWord.length != wordLength) {
                isCorrect = false
            }

            // There has to be exactly one different letter in the previous word
            var differences = 0
            var pos = 0
            while (pos < wordLength && isCorrect) {
                if (currentWord[pos] != previousWord[pos]) differences++
                pos++
            }
            if (differences != 1) {
                isCorrect = false
            }

            wordPos++
        }

        // Print result
        if (isCorrect) {
            println("CORRECTE")
        } else {
            println("INCORRECTE")
        }
    }
}