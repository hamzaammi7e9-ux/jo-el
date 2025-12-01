import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    // Read the number of iterations
    val numberOfCases = sc.nextInt()
    sc.nextLine() // consume line

    repeat(numberOfCases) {
        // Read the line containing the names of the members
        var inputLine = sc.nextLine()

        // Replace the last " i "
        // (The one that separates the last two names of the group)

        //Identify the " i "
        val lastI = inputLine.lastIndexOf(" i ")

        // If at least one " i " exists, replace only the last one with a comma
        if (lastI != -1) {
            //The line now contains all the names from the first position to the position of the last " i ";
            // And the last name that is after the last i ( +3 to skip the 3 character of the string " i ")
            inputLine = inputLine.substring(0, lastI) + ", " + inputLine.substring(lastI + 3)
        }

        // Split the new line into individual members using commas as separators
        val members = inputLine.split(",")

        // String to store the initials of all members
        var initialsResult = ""

        for (member in members) {
            // Remove extra spaces before and after each name
            var noAccentName = member.trim()

            // Remove all possible accents manually
            noAccentName = noAccentName.replace("à", "a").replace("á", "a")
            noAccentName = noAccentName.replace("è", "e").replace("é", "e")
            noAccentName = noAccentName.replace("ì", "i").replace("í", "i")
            noAccentName = noAccentName.replace("ò", "o").replace("ó", "o")
            noAccentName = noAccentName.replace("ù", "u").replace("ú", "u")
            noAccentName = noAccentName.replace("À", "A").replace("Á", "A")
            noAccentName = noAccentName.replace("È", "E").replace("É", "E")
            noAccentName = noAccentName.replace("Ì", "I").replace("Í", "I")
            noAccentName = noAccentName.replace("Ò", "O").replace("Ó", "O")
            noAccentName = noAccentName.replace("Ù", "U").replace("Ú", "U")

            // Store the first letter of the name as an initial
            val initial = noAccentName[0].uppercase()

            // Add all the initials to the result string
            initialsResult += initial
        }

        // Print the result string
        println(initialsResult)
    }
}