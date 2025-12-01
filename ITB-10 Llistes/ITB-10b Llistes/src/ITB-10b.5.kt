import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val amountOfCases = sc.nextInt()

    repeat(amountOfCases) {

        // Read how many shoes are in the list
        val numShoesInList = sc.nextInt()

        // Define the shoe list
        val shoeList = MutableList(numShoesInList) { 0 }

        //Read the shoe list
        for (i in shoeList.indices) {
            shoeList[i] = sc.nextInt()
        }

        sc.nextLine()

        // Read the line with my size and the margin that I consider acceptable
        val sizeAndMarginLine = sc.nextLine().split(" ")

        // Split the size and margin line by the space
        val mySize = sizeAndMarginLine[0].toInt()
        val margin = sizeAndMarginLine[1].toInt()

        // Calculate the range of sizes we accept
        val minSize = mySize - margin
        val maxSize = mySize + margin

        // Counter for the shoes that fit
        var fittingShoes = 0

        // Now check each shoe in the list
        for (shoe in shoeList) {
            val shoeSize = shoe

            // Check if the shoe size is within our range
            if (shoeSize >= minSize && shoeSize <= maxSize) {
                // If it fits, add 1 to the counter
                fittingShoes++
            }
        }

        // Print the result
        println(fittingShoes)
    }
}