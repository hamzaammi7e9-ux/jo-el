import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    //Llegim el nombre
    var nombre = scan.nextInt()
    //Creem variables amb valor 0 per als nombres negatius i els nombres positius
    var nombresPositius = 0
    var nombresNegatius = 0

    //Creem un bucle on, sempre que el número introduït no sigui 0, es continuarà llegint nombres.
    //I si el nombre és positiu s'afegeix 1 a "nombresPositius". El mateix a "nombresNegatius" si és negatiu.
    while(nombre!=0){
        if(nombre>0) ++nombresPositius
        else ++nombresNegatius
        nombre = scan.nextInt()
    }
    //Si hi ha més nombres positius que negatius imprimim "POSITIUS"
    //A l'inrevés, imprimim "NEGATIUS"
    //I si hi ha empat "IGUALS"
    if(nombresPositius>nombresNegatius) print("POSITIUS")
    else if (nombresNegatius>nombresPositius) print("NEGATIUS")
    else print("IGUALS")

}