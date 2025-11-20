import java.util.Scanner

//Input:
//amount of cases to test
//Each case has 3 lines
//1. a number (k)
//2. K names of a single word.
//3. a number (P)

//Output:
//For each case print the list of names introduced, except the name at position P. Consider 0 as the first position.

fun main() {

    val sc = Scanner(System.`in`)
    val amountOfCases = sc.nextInt()

    repeat(amountOfCases){

        val k = sc.nextInt()
        val students: MutableList<String> = mutableListOf()

        //Read the students names and add them into the students list.
        for (i in 0 until k){
            students.add(sc.next())
        }

        val P = sc.nextInt()

        //Remove the name at position P in the list.
        students.removeAt(P)

        //Print the list after removing the name.
        for(i in students.indices){
            print("${students[i]} ")
        }
        println("")
    }
}