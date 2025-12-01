import java.awt.event.WindowAdapter
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
//If Albert is not playing "HollowKnight", "DarkSouls" or "Zelda", we add a shitlist level to him. And 2 levels if he is playing LOL.

//Output:
//Print Albert's shitlist level in this format: ["Nivell de Shitlist: "+shitlistLevel]

fun main() {

    val sc = Scanner(System.`in`)
    val amountOfCases = sc.nextInt()

    repeat(amountOfCases) {


  /*      val albertActivityAt15 = sc.next()
        val albertActivityAt16 = sc.next()
        val albertActivityAt17 = sc.next()
        val albertActivityAt18 = sc.next()
        val albertActivityAt19 = sc.next()
        val albertActivityAt20 = sc.next()*/

        val albertActivity = sc.nextLine().split(" ").toTypedArray()
        for(i in 0 until 6){
            albertActivity[i] = sc.next()

        sc.nextLine()

        var shitlistLevel = 0

        val allowedGames: List<String> = listOf("HollowKnight", "DarkSouls", "Zelda")
        sc.nextLine()

        val watchinghours = sc.nextLine().split(" ").toList()

        for (i in 0 until 6) {
            if (!allowedGames.contains(albertActivity[i]) && watchinghours[i] == "15" && albertActivity[i] == "LOL") {
                shitlistLevel
            }

        }
    }


}
}

