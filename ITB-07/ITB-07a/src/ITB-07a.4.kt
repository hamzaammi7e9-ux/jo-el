import java.util.Scanner

fun main() {
//Input:
    // — Read the size of the array (K).
    // — Read a line that contains K numbers needed for the array
    // — Read a value N and add it up to all the numbers from the array
//Output:
    // — Print a line with the full array separated by spaces after adding up N to all the numbers.

    val sc = Scanner(System.`in`)

    //Read the array size
    val arraySizeK = sc.nextInt()
    //Create the array
    val array = IntArray(arraySizeK){0}

    //Read each value of the array
    for(i in 0 until arraySizeK) array[i] = sc.nextInt()

    //Read the number the user wants to add up
    val addingNumberN = sc.nextInt()

    //Add up that number to all the values in the array and print the result.
    for(i in 0 until arraySizeK) print("${array[i] + addingNumberN} ")

}

