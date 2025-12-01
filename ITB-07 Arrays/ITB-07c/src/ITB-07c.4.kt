import java.util.Scanner

fun main() {
    // Input:
    // — First line: number of test cases.
    // — Each test case has 2 lines:
    //   1. The amount Celia bought.
    //   2. The requests of her classmates, ending with 0.

    // Output: print how many requests were accepted.

    val sc = Scanner(System.`in`)
    val totalCases = sc.nextInt() // Number of test cases.

    repeat(totalCases) {
        val totalMoney = sc.nextInt() // Money Celia has for the lottery.

        // Read all the requests until 0 is found.
        val requests = IntArray(100) // Maximum 100 requests.
        var requestCount = 0
        var currentRequest = sc.nextInt()

        while (currentRequest != 0) {
            requests[requestCount] = currentRequest
            requestCount++
            currentRequest = sc.nextInt()
        }

        // Sort requests from smallest to biggest.
        for (i in 0 until requestCount - 1) {
            for (j in 0 until requestCount - i - 1) {
                if (requests[j] > requests[j + 1]) {
                    val temp = requests[j]
                    requests[j] = requests[j + 1]
                    requests[j + 1] = temp
                }
            }
        }

        // Try to accept as many requests as possible.
        var acceptedRequests = 0
        var remainingMoney = totalMoney

        for (i in 0 until requestCount) {
            if (requests[i] <= remainingMoney) {
                remainingMoney -= requests[i]
                acceptedRequests++
            }
        }

        println(acceptedRequests)
    }
}