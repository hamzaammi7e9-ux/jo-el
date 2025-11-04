import java.util.Scanner

fun main() {
//Input:
// — Read the amount iterations the user wants to do.
// — Each iteration contains 2 lines:
//   — A line with K, that represents the number of lines
//   — After that, K-1 lines, each of them with the name of an animal
//   — The last line is the name of the animal that we are looking for.

//Output:
// — If the wanted animal is in the list of animals, print "SI". Else, print "NO"

    val sc = Scanner(System.`in`)
    val amountOfCases = sc.nextInt()

    repeat(amountOfCases){
        val K = sc.nextInt()
        val animals = Array<String>(K){""}

        for(animal in



    }












}