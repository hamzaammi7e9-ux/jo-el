import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val amountOfCases = sc.nextInt()
    sc.nextLine() // Skip line

    repeat (amountOfCases) {
        val numberOfTroops = sc.nextInt()
        sc.nextLine() // Skip line
        val troopsLine = sc.nextLine() // Read the troops

        // Split the troops into an array
        val troopsArray = troopsLine.split(",").toTypedArray()

        // Initialize the list of the troops and other troops
        var mosqueperroTroops = "["
        var otherTroops = "["


        for (troopSpaces in troopsArray) {
            val troop = troopSpaces.trim() // Remove the spaces around the troop

            // Check if the troop contains the word "Mosqueperro"
            val words = troop.split(" ").toTypedArray()
            var containsMosqueperro = false
            for (word in words) {
                if (word == "Mosqueperro") {
                    containsMosqueperro = true
                }
            }

            // Add the troop to its corresponding list
            if (containsMosqueperro) {
                if (mosqueperroTroops.length > 1) mosqueperroTroops += ", "
                mosqueperroTroops += troop
            } else {
                if (otherTroops.length > 1) otherTroops += ", "
                otherTroops += troop
            }
        }

        // Close both lists of troops
        mosqueperroTroops += "]"
        otherTroops += "]"

        // Print them
        println(mosqueperroTroops)
        println(otherTroops)
    }
}