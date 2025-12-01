import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    // Read the amount of iterations
    val amountOfCases = sc.nextInt()
    sc.nextLine() // skip line

    repeat(amountOfCases) {
        val sentence = sc.nextLine()

        //String for the resulting sentence after swapping the letters.
        var newSentence = ""

        for (char in sentence) {
            //Replace all the b with v, and viceversa. The same in uppercase.
            newSentence += when (char) {
                'b' -> 'v'
                'v' -> 'b'
                'B' -> 'V'
                'V' -> 'B'
                else -> char
            }
        }

        // Print the swapped sentence
        println(newSentence)
    }
}