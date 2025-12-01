import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    var stop = false

    while (stop == false && sc.hasNextLine()) {
        val line = sc.nextLine().split(" ")

        if (line.isNotEmpty()) {

            // Stop the program if the input is 0
            if (line[0] == "0") {
                stop = true
            } else {

                // Get the list of heights (all parts after the first one)
                val heightsBackToFront = line.subList(1, line.size)

                // We reverse the list we just got.
                val heightsFrontToBack = heightsBackToFront.reversed()

                // Tracks the tallest row seen in front
                var tallestSoFar = 0

                // Counts the rows that can see
                var visibleRowCount = 0

                for (i in heightsFrontToBack) {
                    val currentHeight = i.toInt()

                    // A row can see only if it is taller than the tallest row in front of it.
                    if (currentHeight > tallestSoFar) {
                        // This row can see
                        visibleRowCount++

                        // This row now becomes the new tallest one to block the rows behind it.
                        tallestSoFar = currentHeight
                    }
                }

                // Print the result
                println(visibleRowCount)
            }
        }
    }
}