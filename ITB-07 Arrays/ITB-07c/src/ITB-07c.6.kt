import java.util.Scanner

fun main() {
    // Input:
    // — Read the number of test cases.
    // — For each case:
    //   — Read K, the number of lines that follow.
    //   — Read K−1 animal names (the collection).
    //   — Read the last line, which is the animal we are searching for.

    // Output:
    // — For each case, print "SI" if the animal is in the collection, otherwise print "NO".

    val sc = Scanner(System.`in`)
    val amountOfCases = sc.nextInt() // Define the number of test cases
    sc.nextLine()

    repeat(amountOfCases) {
        val k = sc.nextInt() // Read K
        sc.nextLine()

        val animals = Array(k - 1) { "" } // Define the array for the animal collection

        for (i in 0 until k - 1) { // Read the K−1 animals
            animals[i] = sc.nextLine()
        }

        val searchedAnimal = sc.nextLine() // Read the animal to search

        var found = false // Variable to check if it’s found

        for (i in 0 until k - 1) { // Check each animal
            if (animals[i] == searchedAnimal) {
                found = true
            }
        }

        if (found) println("SI")
        else println("NO")

    }
}