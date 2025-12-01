import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    val amountOfCases = scanner.nextLine().toInt()

    repeat (amountOfCases) {

        // Read the number of elements in the list
        val numElements = scanner.nextLine().toInt()

        // Read the entire line containing the list of numbers
        val numbersLine = scanner.nextLine()

        //Convert to a list
        val list: MutableList<String> = numbersLine.split(" ").toMutableList()

        // Read the third line containing the 2 numbers
        val thirdLine = scanner.nextLine().split(" ")

        // Store the number cutting in
        val numberToCutIn = thirdLine[0]
        // Store the position where it cuts in
        val cutInPosition = thirdLine[1].toInt()

        // Add the number cutting in to the list at the specified position P.
        // The other elements automatically shift over.
        list.add(cutInPosition, numberToCutIn)

        // Print the result
        println(list.joinToString(" "))
    }
}