import java.util.*

    fun main() {
        val scanner = Scanner(System.`in`)
        //Llegim els casos totals
        val casosTotals = scanner.nextInt()
        scanner.nextLine()

        repeat(casosTotals) {
            //Llegim la sequencia de paraules, en minúscula, i amb les paraules separades
            val sequenciaParaules = scanner.nextLine().lowercase().split(", ")
            // Llegim la capacitat de la teranyina
            val capacitatTeranyina: Int = scanner.nextInt()
            scanner.nextLine()
            //Inicialitzem els comptadors

            var lalafelsEsperant: Int = 0 //Comptador de lalafels esperant a entrar a una teranyina

            var teranyinesPosibles: Int = 0 //Comptador de teranyines possibles, la quantitat de teranyines que poden emplenar els lalafels

            var teranyinesBuides: Int = 0 //Comptador de teranyines que estiguin buides

            //Ara fem un bucle que recorri totes les paraules de la sequencia.
            for (paraula in sequenciaParaules) {
                //Si la paraula és lalafel, significarà que hi ha un lalafel més esperant
                if (paraula == "lalafel" ) ++lalafelsEsperant
                //Si la paraula és telaranya, significarà que hi ha una nova teranyina buida.
                if (paraula == "telaranya") ++teranyinesBuides
                //Quan aparegui una aranya, tots els lalafels i les teranyines desapareixen
                if (paraula == "aranya") {
                    lalafelsEsperant = 0
                    teranyinesBuides = 0
                }
            }

            //Sempre que la capacitat de la teranyina sigui més gran que 0;
            //Calculem la quantitat de teranyines que es poden emplenar depenent de quants lalafels estiguin esperant i quanta capacitat té cada teranyina.
            if(capacitatTeranyina>0) teranyinesPosibles = lalafelsEsperant/capacitatTeranyina
            //Si la capacitat és 0, cap teranyina és possible d'emplenar.
            else teranyinesPosibles=0

            //A més, pot pasar que els lalafels poden emplenar més teranyines de les que hi han aparegut.
            //Però descartem aquest cas, ja que només ens importa les teranyines buides que han aparegut.
            if (teranyinesPosibles>teranyinesBuides) teranyinesPosibles=teranyinesBuides


            println("Hay $teranyinesPosibles telaranyas llenas.")
        }
    }


