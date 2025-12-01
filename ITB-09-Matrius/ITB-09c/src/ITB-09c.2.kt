import java.util.Scanner

//Input:
//Read amount of cases
//Each case has two lines
//First line has three numbers, F, C and K.
//F is the number of rows of the house
//C is the number of columns of the house
//K is the number of ghosts
//Second line has 2*K numbers that represent the positions of the K ghosts
//The first ghost is the blue ghost we control

//Output :
// print THIS IS FINE if the blue ghost can move to at least one position next to it (up down left or right) without touching a wall or another ghost
//Print OH NO if the blue ghost has all four directions blocked.

fun main() {
    val sc = Scanner(System.`in`)
    repeat(sc.nextInt()) {
        val rows = sc.nextInt()
        val columns = sc.nextInt()
        val amountOfGhosts = sc.nextInt()

        val ghosts = Array(amountOfGhosts) { IntArray(2) }
        for (i in 0 until amountOfGhosts) {
            ghosts[i][0] = sc.nextInt()
            ghosts[i][1] = sc.nextInt()
        }

        //Variable to store the blue ghost position
        val blueGhostRow = ghosts[0][0]
        val blueGhostColumn = ghosts[0][1]

        //Boolean to check if the blue ghost can move at least one position
        var canMove = false

        //The possible 4 moves (up, right, left, up, down)
        val directions = arrayOf(intArrayOf(-1,0), intArrayOf(1,0), intArrayOf(0,-1), intArrayOf(0,1))

        //Calculate the new positon of the blue ghost if it moves in that direction
        for (direction in directions) {
            val newRow = blueGhostRow + direction[0]
            val newColumn = blueGhostColumn + direction[1]

            // Check positions inside the house
            if (newRow > 0 && newRow < rows-1 && newColumn > 0 && newColumn < columns-1) {
                //Boolean to check if another ghost occupies the new position
                var blockedDirection = false
                //If another ghost is there, position is blocked.
                for (i in 1 until amountOfGhosts) {
                    if (ghosts[i][0] == newRow && ghosts[i][1] == newColumn) {
                        blockedDirection = true
                    }
                }
                //If it is not blocked by another ghost, the blue ghost can mvoe
                if (!blockedDirection) canMove = true
            }
        }
        //Print the corresponding result.
        if (canMove) println("THIS IS FINE") else println("OH NO")
    }
}