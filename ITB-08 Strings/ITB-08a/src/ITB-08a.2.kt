import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    // Read number of iterations
    val numberOfCases = sc.nextInt()
    sc.nextLine() // skip line

    repeat(numberOfCases) {
        // Read the secret word
        val secretWord = sc.nextLine().trim()

        // Read the guesses and split with space
        val guesses = sc.nextLine().trim().split(" ")

        // Define the array containing all the secret word characters, but hidden with asterisks
        val revealed = CharArray(secretWord.length) { '*' }

        var errors = 0

        for (guess in guesses) {
            val guessedChar = guess[0]
            if (secretWord.contains(guessedChar)) {
                // Swap the '*' with the guessed character that it's hiding.
                for (i in secretWord.indices) {
                    if (secretWord[i] == guessedChar) {
                        revealed[i] = guessedChar
                    }
                }
            } else {
                // Wrong guess
                errors++
            }
        }

        // Print the revealed word and the number of errors
        println(String(revealed) + " $errors")
    }
}