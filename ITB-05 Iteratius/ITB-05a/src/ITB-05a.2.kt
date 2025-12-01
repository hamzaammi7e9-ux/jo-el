import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    //Llegim el nombre de casos
    val nombreRepeticions = scan.nextInt()

    repeat(nombreRepeticions) {
        //Llegim el nombre
        val nombre = scan.nextInt()
        //Creem les variables per la suma dels parells i la dels senars amb valor 0, ja que encara no hem sumat.
        var sumaParells = 0
        var sumaSenars = 0

        //Fem un bucle que agafi tots els nombres parells entre 1 i "nombre" i els sumem i guardem a sumaParells.
        //I els parells a la variable de sumaSenars.
        for (i in 1..nombre)
            if (i % 2 == 0) sumaParells += i
            else sumaSenars += i
        //Imprimim la suma dels parells i la dels senars per a cada cas.
        println("PARELLS: $sumaParells SENARS: $sumaSenars ")
    }

}