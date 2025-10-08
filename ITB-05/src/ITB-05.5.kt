import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    var nombre = scan.nextInt()
    var nombresPositius = 0
    var nombresNegatius = 0

    while(nombre!=0){
        if(nombre>0) ++nombresPositius
        else ++nombresNegatius
        nombre = scan.nextInt()
    }
    if(nombresPositius>nombresNegatius) print("POSITIUS")
    else if (nombresNegatius>nombresPositius) print("NEGATIUS")
    else print("IGUALS")

}