import java.util.Scanner

fun main() {
    // Input:
    // — Read the number of test cases.
    // — For each test case:
    // — Read a line containing N (the number of students) followed by their heights.

    // Output:
    // — For each test case, print the maximum difference in height (tallest - shortest).

    val sc = Scanner(System.`in`)
    val amountOfCases = sc.nextInt() // Number of test cases

    repeat(amountOfCases) {
        val n = sc.nextInt() // Number of students
        val heights = IntArray(n) // Array to store the heights

        for (i in 0 until n) { // Read each height
            heights[i] = sc.nextInt()
        }

        // Initialize max and min values with the first student's height
        var maxHeight = heights[0]
        var minHeight = heights[0]

        for (i in 1 until n) { // Find the tallest and shortest student
            if (heights[i] > maxHeight) {
                maxHeight = heights[i]
            }
            if (heights[i] < minHeight) {
                minHeight = heights[i]
            }
        }

        val difference = maxHeight - minHeight // Calculate the difference
        println(difference) // Print the result
    }
}