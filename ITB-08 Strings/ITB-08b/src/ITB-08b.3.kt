import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val totalCases = sc.nextInt()
    sc.nextLine()

    repeat(totalCases) {
        val line = sc.nextLine()
        val length = line.length
        val halfLength = length / 2

        // split the phrase in two halves
        val firstHalf = line.substring(0, halfLength)
        val secondHalf = line.substring(length - halfLength, length)

        // count letters in first half
        val countFirst = MutableList(128) { 0 }
        for (i in firstHalf) {
            val pos = i.code // simple integer representation
            countFirst[pos] = countFirst[pos] + 1
        }

        // count letters in second half
        val countSecond = MutableList(128) { 0 }
        for (i in secondHalf) {
            val pos = i.code
            countSecond[pos] = countSecond[pos] + 1
        }

        // compare counts
        var sameCounts = true
        for (i in 0 until 128) {
            if (countFirst[i] != countSecond[i]) {
                sameCounts = false
            }
        }

        //Print the result
        if (sameCounts) {
            println("SI")
        } else {
            println("NO")
        }
    }
}