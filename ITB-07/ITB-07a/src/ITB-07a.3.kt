import java.util.Scanner

fun main() {
//Input:
    // — Read the size of the array (K).
    // — Create K lines.
    // — Each one of those lines contain a String.
    // — The last line has the position of the array element to access (N).
//Output:
    // — Print K lines, each one of them with a string from the array.
    // — Print an additional line, which contains the array string at position N.


    val sc = Scanner(System.`in`)


    val arraySizeK = sc.nextInt() //Read the size of the array

    sc.nextLine() //Skip line

    val array = Array<String>(arraySizeK) { "" } //Create a strings array

    //Read the strings for the array in K lines
    for (i in 0 until arraySizeK) {
        array[i] = sc.nextLine()
    }

    //Read the array index the user wants to access
    val arrayIndex = sc.nextInt()

    //Print K lines, each one of them containing a string from the array.
    repeat(arraySizeK) {
        println("${array[it]} ")
    }

    //Print the string at the user's desired position of the array.
    println("${array[arrayIndex]} ")


}

