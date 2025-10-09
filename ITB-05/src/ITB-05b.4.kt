import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    val diners = scan.nextInt()

    while((diners%1000000)>0){
        for (i in 1000000..diners){
            if (i % 1000000 ==0) print(i)
        }
    }

}
