import java.util.Scanner

fun main() {
    //Input:
    // — Read the amount iterations the user wants to do.
    // — Each iteration contains 3 lines:
    //   — The first one has a K number.
    //   — The second one contains K numbers, from 0 to 100
    //   — The third one contains a P number that is < K.

    //Output:
    // — For each iteration, print the value that occupied position P in the array.

    val sc = Scanner(System.`in`)

    //Define the amount of iterations
    val amountOfCases = sc.nextInt()

    repeat (amountOfCases){
        val arraySizeK = sc.nextInt() //Define the array size
        val numbersList = IntArray(arraySizeK){0} //Define the array

        //Read the numbers for the array
        for(number in 0 until arraySizeK){
            numbersList[number] = sc.nextInt()
        }

        val numberP = sc.nextInt() //Read P

        println(numbersList[numberP]) //Print the number in position P in the array.
    }
}