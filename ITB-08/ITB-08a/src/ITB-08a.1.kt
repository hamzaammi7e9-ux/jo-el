import java.util.Scanner

fun main() {
//Input:
// — Read the amount iterations the user wants to do.
// — Each iteration contains 1 line

//Output:
// — For each iteration answer "Es Patata" if the input is a potato, else print "No es Patata"

    val sc = Scanner(System.`in`)
    val amountOfCases = sc.nextInt() //Read the amount of iterations
    sc.nextLine() //Consume end of line

    repeat(amountOfCases) {

        //Read the user input, turned into lowercase
        val input = sc.nextLine().lowercase().split(" ")  //Split in case there is more than 1 word.


        //If the input contains patata, print "Es Patata"
        //Else print "No es Patata".
        if (input.contains("patata")) {
            println("Es Patata")

        } else println("No es Patata")

    }

}