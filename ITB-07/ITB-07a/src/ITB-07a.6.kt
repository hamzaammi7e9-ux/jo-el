import java.util.Locale
import java.util.Scanner

fun main() {
//Input:
    // — Read the array size (N)
    // — Read a line of N values, all of them between 0 and 1, and no more than 2 decimals
//Output:
    // — Print the array, but with the values represented in %, with an % added at the end of each value.

    val sc = Scanner(System.`in`).useLocale(Locale.US)

    val arraySizeN = sc.nextInt() //Read the array size
    val arrayOfPercentatges = DoubleArray(arraySizeN){0.0} //Create the array

    for(i in 0 until arraySizeN){
        arrayOfPercentatges[i] = sc.nextDouble() //Read the array values
        arrayOfPercentatges[i] = arrayOfPercentatges[i] *100 //Turn them into % percentage
    }

    //Print the array values with the % symbol added to them.
    for(i in 0 until arraySizeN){
        print("${arrayOfPercentatges[i]}% ")
    }
}

