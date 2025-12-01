import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    //Read the amount of cases the user wants to do.
    val amountOfCases = scan.nextInt()

    //Repeat the amount of cases
    repeat(amountOfCases) {
        //Read the size of the list
        val numberOfElements = scan.nextInt()
        //Create the list to store the numbers, with size of numberOfElements.
        val listOfNumbers = IntArray(numberOfElements)  // array de k elements

        //Read a number and put it in each position of the list until the maximum amount of elements needed is reached.
        for (i in 0 until numberOfElements) {
            listOfNumbers[i] = scan.nextInt()
        }

        //Read the values for P1 and P2
        val numberP1 = scan.nextInt()
        val numberP2 = scan.nextInt()

        // Substitute all numbers equal to P1 for P2
        for (i in 0 until numberOfElements) {
            if (listOfNumbers[i] == numberP1) {
                listOfNumbers[i] = numberP2
            }
        }

        // Show the resulting list of numbers
        for (i in 0 until numberOfElements) {
            print("${listOfNumbers[i]} ") //With an added space
        }
    }
}

