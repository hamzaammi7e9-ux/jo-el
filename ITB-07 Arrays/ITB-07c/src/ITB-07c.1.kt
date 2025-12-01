import java.util.Scanner

fun main() {
    // Input:
    // — First line: number of test cases.
    // — Each test case: 7 numbers from 1 to 13 (the cards).

    // Output:
    // — If royal straight found, print "ESCALA REIAL"
    // — Else if straight found, print "ESCALA"
    // — Else print "NO"

    val sc = Scanner(System.`in`)
    val totalCases = sc.nextInt() // Number of test cases.

    repeat(totalCases) {
        val totalCards = 7
        val cards = IntArray(totalCards) // Array to store the 7 cards.

        // Read all the cards.
        for (i in 0 until totalCards) {
            cards[i] = sc.nextInt()
        }

        // Sort the cards from smallest to biggest.
        for (i in 0 until totalCards - 1) {
            for (j in 0 until totalCards - i - 1) {
                if (cards[j] > cards[j + 1]) {
                    val temp = cards[j]
                    cards[j] = cards[j + 1]
                    cards[j + 1] = temp
                }
            }
        }

        // Remove duplicates.
        var uniqueCount = 1
        for (i in 1 until totalCards) {
            if (cards[i] != cards[i - 1]) {
                cards[uniqueCount] = cards[i]
                uniqueCount++
            }
        }

        // Check if it has 10, 11, 12, 13 and 1.
        var tenFound = false
        var jackFound = false
        var queenFound = false
        var kingFound = false
        var aceFound = false

        for (i in 0 until uniqueCount) {
            if (cards[i] == 10) tenFound = true
            if (cards[i] == 11) jackFound = true
            if (cards[i] == 12) queenFound = true
            if (cards[i] == 13) kingFound = true
            if (cards[i] == 1) aceFound = true
        }

        val royalStraightFound = tenFound && jackFound && queenFound && kingFound && aceFound


        var consecutiveCount = 1
        var straightFound = false

        // Check if there are 5 consecutive numbers.
        for (i in 1 until uniqueCount) {
            if (cards[i] == cards[i - 1] + 1) {
                consecutiveCount++
                if (consecutiveCount >= 5) straightFound = true
            } else {
                consecutiveCount = 1
            }
        }

        if (royalStraightFound) {
            println("ESCALA REIAL")
        } else if (straightFound) {
            println("ESCALA")
        } else {
            println("NO")
        }
    }
}