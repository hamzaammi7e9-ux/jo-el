import java.util.Scanner

fun main() {
    //Input:
    // — Read the amount iterations the user wants to do.
    // — Each iteration contains 3 lines:
    //   — The first one has a K number.
    //   — The second one contains K numbers, from 0 to 100
    //   — The third one contains a FOLI number.

    //Output:
    // — For each iteration, print the position of the foli that is equal to FOLI. If there is repeated folis, print the position of the first one
    // — If foli does not appear, print -1.

    val sc = Scanner(System.`in`)

    val amountOfCases = sc.nextInt() //Define the amount of iterations.

    repeat(amountOfCases){
        val arraySizeK = sc.nextInt() //Define the array size
        val numbersList = IntArray(arraySizeK){0} //Define the array

        for(number in 0 until arraySizeK){ //Read the array numbers
            numbersList[number] = sc.nextInt()
        }


        val foli = sc.nextInt() //Read foli

        // Initialize the position of the first foli to -1
        // -1 indicates that the foli has not been found yet
        var positionFirstFoli = -1


        for(number in 0 until arraySizeK){
            // If we find the foli and haven't recorded any position yet;
            if(numbersList[number] == foli && positionFirstFoli == -1){
                // Save the position of the first foli
                positionFirstFoli = number
            }
        }

        // Print the position of the first foli or -1 if not found.
        println(positionFirstFoli)

    }
}