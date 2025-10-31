import java.util.Scanner

fun main() {
    //Input:
    // — Read the amount iterations the user wants to do.
    // — Each iteration contains 2 lines:
    //   — The first one has K, the size of the array
    //   — The second one contains K numbers

    //Output:
    // — If the array contains two equal values in a row, print "SI". Else, print "NO"

    val sc = Scanner(System.`in`)

    val amountOfCases = sc.nextInt()

    repeat(amountOfCases){
        val arraySizeK = sc.nextInt()
        val numbersList = IntArray(arraySizeK){0}

        for(number in 0 until arraySizeK){
            numbersList[number] = sc.nextInt()
        }

        var twoValuesInARow : Boolean = false

        for(number in 0 until arraySizeK){
            if(numbersList[number]==numbersList[number+1]){
                twoValuesInARow = true
            }
        }

        if (twoValuesInARow) print("SI")
        else print("NO")
    }

}