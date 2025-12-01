import java.util.Scanner

fun main() {
    // Input:
    // — Read the number of test cases.
    // — For each case:
    //   — Read N (even number), then N integers.

    // Output:
    // — For each case, print N/2 numbers.
    //   Each number is the sum of two "opposite" elements:
    //   the smallest with the largest, the second smallest with the second largest, etc.

    val sc = Scanner(System.`in`)
    val amountOfCases = sc.nextInt()

    repeat(amountOfCases) {
        val totalNumbers = sc.nextInt()
        val numbersArray = IntArray(totalNumbers)

        for (i in 0 until totalNumbers) {
            numbersArray[i] = sc.nextInt()
        }

        for (i in 0 until totalNumbers - 1) {
            for (i in 0 until totalNumbers - i - 1) {
                if (numbersArray[i] > numbersArray[i + 1]) {
                    val a = numbersArray[i]
                    numbersArray[i] = numbersArray[i + 1]
                    numbersArray[i + 1] = a
                }
            }
        }

        val halfSize = totalNumbers / 2

        for (i in 0 until halfSize) {
            val sumOfOppositeNumbers = numbersArray[i] + numbersArray[totalNumbers - 1 - i]
            print("$sumOfOppositeNumbers ")
        }
        println()
    }
}