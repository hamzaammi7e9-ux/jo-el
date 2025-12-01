import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    //Llegim els diners
    val diners = scan.nextInt()

    //Creem un bucle on, sempre que sigui més petit o igual que el valor de diners introduït, es continuarà sumant 1 milió a i i imprimint-lo.
    //D'aquesta manera contarà de milió en milió fins que arribi a diners.
    var i = 1000000
    while(i<=diners){
        println(i)
        i+=1000000
    }

}
