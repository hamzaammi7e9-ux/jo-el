import java.util.Scanner

fun main() {
//Input:
    // — Read the amount iterations the user wants to do.
    // — Each iteration contains:
    //   — A line with the size of the array of shoes.
    //   — Another line of K numbers representing the shoes sizes (All of them between 8 and 60)
    //   — Lastly, a number M, representing the user shoe size.
//Output:
    // — Depending on the user input:
    //   — Print "SI" if there is a shoe size in the array that fits well for the user's.
    //     (Only when it is either equal to M, one less or one more)
    //
    //   — Print "NO" if there is no shoe that meets those requirements.

    val sc = Scanner(System.`in`)

    val amountOfCases = sc.nextInt() //Read the amount of cases

    //Repeat the amount of cases
    for (case in 0 until amountOfCases) {

        val arraySizeK = sc.nextInt() //Read the array size
        val array = IntArray(arraySizeK) { 0 } //Create the array of shoes

        // Read all the shoe sizes for the array
        for (i in 0 until arraySizeK) {
            array[i] = sc.nextInt()
        }

        val userShoeSize = sc.nextInt() // Read the user shoe size

        //Initialize a boolean that represents if the shoe size fits well for the user.
        var correctShoeSize : Boolean = false


        for (i in 0 until arraySizeK) {

            //If a value that meets the requirements inside the array is found, the boolean correctShoeSize will is true.
            if (array[i] == userShoeSize || array[i] == (userShoeSize - 1) || array[i] == (userShoeSize + 1)) {
                correctShoeSize = true
            }

        }

        //If a correct shoe size is found, print "SI"
        if(correctShoeSize) println("SI")
        //Else print "NO"
        else println("NO")
    }

}

