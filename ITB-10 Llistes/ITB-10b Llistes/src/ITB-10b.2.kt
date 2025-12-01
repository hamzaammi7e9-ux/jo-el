import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    // Boolean to keep the loop going until 0 is read.
    var keepReading = true

    while (keepReading) {
        val currentLine = scanner.nextLine()

        //Stop when its 0
        if (currentLine == "0") {
            keepReading = false

        } else {
            //Initialize the cloner degree counter
            var clonerDegree = 0

            // The requirement is that it must start and end with '1'
            if (currentLine.startsWith("1") && currentLine.endsWith("1")) {

                // This is the special case of the number "1". Starts and ends with "1", the degree is 1.
                if (currentLine == "1") {
                    clonerDegree = 1
                } else {
                    // Split the string by '1' to analyze the groups of zeros
                    val zeroGroups = currentLine.split('1')

                    // The first group of zeros (position 1) is our model
                    val modelGroup = zeroGroups[1]
                    val modelZeroCount = modelGroup.length // Count the amount of zeros

                    var i = 1
                    var isClonerValid = true // Assume the cloner is valid

                    // Check if all zero groups are identical
                    while (i < zeroGroups.size - 1 && isClonerValid) {
                        val currentGroup = zeroGroups[i]

                        // Check that it only contains zeros, incase it contains something else (for example "10s1")
                        var j = 0
                        var onlyHasZeros = true
                        while (j < currentGroup.length && onlyHasZeros) {
                            if (currentGroup[j] != '0') {
                                onlyHasZeros = false //We found something that isnt a 0
                            }
                            j++
                        }

                        // Check length and if it only has zeros
                        if (currentGroup.length != modelZeroCount || !onlyHasZeros) {
                            isClonerValid = false
                        }
                        i++
                    }

                    if (isClonerValid) {
                        // The degree is the number of zeros + 1
                        clonerDegree = modelZeroCount + 1
                    }
                }
            }

            println(clonerDegree)
        }
    }
}