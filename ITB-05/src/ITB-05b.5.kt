import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)

    //Primer tenim les variables dels videos i strikes a 0, ja que encara no s'han introduït els nombres
    var nombreVideos: Int = 0
    var nombreStrikes: Int = 0

    //Creem un bucle on cada vegada que es llegeixi un -1 es suma 1 strike, si no, es sumara 1 video
    while (nombreStrikes != 3) {
        val qualsevolNombre: Int = scan.next().toInt()
        if (qualsevolNombre == -1) nombreStrikes += 1
        else if (qualsevolNombre > 0) nombreVideos += 1
    }
    //I quan arribi a 3 strikes, s'acaba el bucle i s'imprimeix el nombre de videos que hi havia abans dels 3 strikes.
    print(nombreVideos)
}
