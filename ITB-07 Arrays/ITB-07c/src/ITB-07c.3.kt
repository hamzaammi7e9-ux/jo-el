import java.util.Scanner

fun main() {
    // Input:
    // — First line: number of iterations.
    // — For each iteration: A line 4 numbers (initial position (from 0 to 7) and 3 dice rolls (from 1 to 6)).

    // Output:
    // - For each iteration print the final position after the 3 dice rolls.
    //  (If at one moment you arrive at the last box (8) you've already won and all the other dice rolls become irrelevant)

    val sc = Scanner(System.`in`)
    val totalCases = sc.nextInt() // Number of test cases.

    repeat(totalCases) {
        val numbersInCase = 4
        val gameData = IntArray(numbersInCase) // Store the initial position and dice rolls.

        // Read the 4 numbers.
        for (i in 0 until numbersInCase) {
            gameData[i] = sc.nextInt()
        }

        var position = gameData[0] // Starting position.
        val goal = 8 // Final box
        var finished = false // True if the player reached the goal.

        // Do the 3 dice rolls.
        for (i in 1 until numbersInCase) {
            if (!finished) { // Only move if not finished yet.
                position += gameData[i] // Move forward.

                // If it goes past the goal, go backwards.
                if (position > goal) {
                    val extraSteps = position - goal
                    position = goal - extraSteps
                }

                // If i treaches the goal, stop moving next turns.
                if (position == goal) {
                    finished = true
                }
            }
        }

        println(position)
    }


}