import java.util.Scanner
fun main() {
    //Input:
// — Read the size of the new array.
// — Read K values and store each one of them inside the array created, with an added space next to them.
// — Read an N value, representing the array index the user wants to access
// — It is guaranteed that N < K
//Output:
// — A line containing the full array, with values separated by spaces.
// — Another line showing the array value at the position N.

    val sc = Scanner(System.`in`)

    //Read the array size
    val arraySizeK = sc.nextInt()
    //Create the array of size K
    val array = Array<Int>(arraySizeK){0}

    //Read the values for the array
    for (i in 0 until arraySizeK) {
        val arrayElement = sc.nextInt()
        array[i] = arrayElement
    }

    val arrayPosition = sc.nextInt() //Read N
    if(arrayPosition>arraySizeK) println("ERROR") //Show error if N > K

    for(i in 0 until arraySizeK) print("${array[i]} ") //Print the full array
    println("") //Skip a line
    println(array[arrayPosition]) //Print N
}

