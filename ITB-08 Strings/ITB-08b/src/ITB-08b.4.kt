import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val totalCases = sc.nextInt()
    sc.nextLine() // skip line

    repeat(totalCases) {
        // Read the counts of each letter
        val lettersCount = IntArray(26)
        for (i in 0 until 26) {
            lettersCount[i] = sc.nextInt()
        }
        sc.nextLine() // skip line

        val words = Array(100) { "" } // store the words
        var wordCount = 0
        var line = sc.nextLine()

        // Read all words until a "." appears
        while (line != ".") {
            words[wordCount] = line.uppercase() // convert to uppercase
            wordCount++
            line = sc.nextLine()
        }


        var totalFormed = 0
        val formedWords = Array(wordCount) { "" } // store words we can form

        // For each word, check if it can be formed
        for (i in 0 until wordCount) {
            val word = words[i]
            val lettersNeeded = IntArray(26) { 0 } // how many letters we need for this word

            // Count letters needed
            for (i in 0 until word.length) {
                val c = word[i]
                if (c in 'A'..'Z') {
                    lettersNeeded[c - 'A']++
                }
            }

            // Check if we have enough letters
            var canForm = true
            for (i in 0 until 26) {
                if (lettersNeeded[i] > lettersCount[i]) {
                    canForm = false
                }
            }

            // If the word can be formed, subtract letters
            if (canForm) {
                formedWords[totalFormed] = word
                totalFormed++
                for (i in 0 until 26) {
                    lettersCount[i] -= lettersNeeded[i]
                }
            }
        }

        // Print the result
        print(totalFormed)
        if (totalFormed > 0) print(" ")
        for (i in 0 until totalFormed) {
            print(formedWords[i])
            if (i != totalFormed - 1) print(" ")
        }
        println()
    }
}