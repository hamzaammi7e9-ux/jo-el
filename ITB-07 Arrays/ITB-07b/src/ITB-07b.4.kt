import java.util.Scanner

fun main() {
    //Input:
    // — Read the amount iterations the user wants to do.
    // — Each iteration contains 3 lines:
    //   — The first one has a K number.
    //   — The second one contains K numbers, from 0 to 100
    //   — The third one contains a P number.

    //Output:
    // — For each iteration, print the times P has appeared in the array.

    val sc = Scanner(System.`in`)

    val amountOfCases = sc.nextInt() //Define the amount of iterations.

    repeat(amountOfCases){
        val arraySizeK = sc.nextInt() //Define the array size
        val numbersList = IntArray(arraySizeK){0} //Define the array

        for(number in 0 until arraySizeK){ //Read the array numbers
            numbersList[number] = sc.nextInt()
        }

        val numberP = sc.nextInt() //Read P
        var timesPAppeared = 0 //Counter of times P appeared

        for(number in 0 until arraySizeK){ //When a number equal to P is found, add up 1 to the P counter.
            if(numbersList[number] == numberP) ++timesPAppeared
        }

        println(timesPAppeared) //Print the result

    }


}