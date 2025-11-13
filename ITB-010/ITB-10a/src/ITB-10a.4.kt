import java.util.Scanner

//Make a program that reads a phrase with various words, then separate them with a split in an array of words.
//Then add an ellipsis at the end of each word if it is shorter than the next one, but don't add them to the last word.

//Input:
//amount of cases to test
//Each case has 3 lines
//Line 1: we will go over a list of what Albert does every hour at class (6 hours, from 15 to 21), whether it is the game he plays, or doing Eclipse.
//Line 2: a number (N) that represents the amount of times that Marc focuses on what Albert does
//Line 3: N numbers, representing the hours in which he watches Albert (15 to 20).
//If in any moment Marc catches Albert doing anything but Eclipse, he will judge him.
//If Albert is not playing "HollowKnight", "DarkSouls" or "Zelda", a shitlist level will be given to him. 2 levels if he is playing LOL.

//Output:
//Print Albert's shitlist level in this format: ["Nivell de Shitlist: "+shitlistLevel]

fun main() {

    val sc = Scanner(System.`in`)
    val amountOfCases = sc.nextInt()
    sc.nextLine()

    repeat(amountOfCases) {

        val albertActivity = IntArray(6){sc.nextInt()}

        val timesMarcFocused = sc.nextInt()
        val watchingHours = IntArray(timesMarcFocused)
        for(i in 0 until timesMarcFocused){
            watchingHours[i] = sc.nextInt()
        }



    }
}

