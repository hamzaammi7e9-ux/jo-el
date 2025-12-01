import java.util.Scanner


fun main() {

    val sc = Scanner(System.`in`)
    val amountOfCases = sc.nextInt()
    sc.nextLine()

    repeat(amountOfCases) {

        // Read the line with the queue of names
        val nameQueue = sc.nextLine().split(" ")


        // Read the single banned name
        val bannedName = sc.nextLine()

        // This list that stores the people who actually get into the club
        val clubList: MutableList<String> = mutableListOf()

        // Variable to track tracks if the one allowed person with the banned name has entered, initialized to false
        var bannedNameUsed = false

        for (personName in nameQueue) {

            if (personName == bannedName) {
                // Current person has the banned name, check the boolean
                if (!bannedNameUsed) {
                    // "bannedNameUsed" is false, so this is the first one and he can enter
                    clubList.add(personName)
                    // Set the boolean to true so no more can enter.
                    bannedNameUsed = true
                }
            } else {
                clubList.add(personName)
            }
        }

        // Print list result
        println(clubList)
    }
}