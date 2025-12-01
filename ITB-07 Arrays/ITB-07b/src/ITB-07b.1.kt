import java.util.Scanner

fun main() {
    //Input:
    // — Read the amount iterations the user wants to do.
    // — Each iteration contains:
    //   — A line with the various numbers
    //   — The first number is the amount of options that are voted (k).
    //   — After that, there is k numbers, that represent the votes that each option got.
    //   — It is guaranteed that a tie between 2 winners is impossible.

//Output:
    // — For each iteration, print the value of the option that won the most votes.

    val sc = Scanner(System.`in`)

    val amountOfCases = sc.nextInt()

    repeat(amountOfCases){
        val amountOfOptions = sc.nextInt() //Read the array size
        val optionsToVote = IntArray(amountOfOptions){0} //Create the array

        // Read the array values
        for (option in 0 until amountOfOptions){
            optionsToVote[option] = sc.nextInt()
        }


        var greatestNumber = optionsToVote[0] //Represents the greatest number found yet
        var greatestNumberPosition = 1 //Represents the current greatest number position
        var position = 0 //Index in the array


        while(position<amountOfOptions){ //While we don't reach the max position in the array:
            if(optionsToVote[position]>greatestNumber){ //If the option in the position has more votes than the current greatest number:
                greatestNumber = optionsToVote[position] //That value is now the greatest number
                greatestNumberPosition = position + 1
            }
            ++position //Advance one position. The bucle will go on until the max position is reached.
        }
        println(greatestNumberPosition) //Print the option with the most votes
    }



}