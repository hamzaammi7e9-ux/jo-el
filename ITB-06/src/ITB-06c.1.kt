import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    //Llegim els casos totals
    var casosTotals = scanner.nextInt()


    repeat(casosTotals) {
        //Llegim el valor de la vida del monstre, l'atac de rammus i el veri de twitch.
        var vidaMaxMonstre: Int = scanner.nextInt()
        val atacRammus: Int = scanner.nextInt()
        val veriTwitch: Int = scanner.nextInt()
        //Creem un boolean de mortPerRammus i mortPerTwitch que s'inicialitzin a false. Un dels dos sera true quan el monstre hagi mort pel seu atac
        var mortPerRammus: Boolean = false
        var mortPerTwitch: Boolean = false
        //Creem variables per contar la quantitat d'atacs que ha fet cadascú, comptem des de 0.
        var quantitatAtacsRammus: Int = 0
        var quantitatAtacsTwitch: Int = 0
        //Restem un cas
        --casosTotals
        //Ara creem un bucle on, sempre que la vida del monstre > 0, primer atacarà Rammus i se sumarà 1 atac al seu contador
        //Fem un condicional que canviarà mortPerRammus a true si l'atac de Rammus ha fet que la vida del monstre baixi a 0 o menys.
        //Després, fem el mateix per a l'atac de Twitch.
        while (vidaMaxMonstre > 0) {
            vidaMaxMonstre -= atacRammus
            ++quantitatAtacsRammus
            if (vidaMaxMonstre <= 0) {
                mortPerRammus = true
            }
            vidaMaxMonstre -= veriTwitch
            ++quantitatAtacsTwitch
            if (vidaMaxMonstre <= 0) {
                mortPerTwitch = true
            }
        }
        //Si mortPerRammus és cert, imprimim "RAMMUS" junt amb els atacs que ha llençat
        //El mateix per a mortTwitch si aquest és cert.
        if (mortPerRammus) println("RAMMUS $quantitatAtacsRammus")
        else if (mortPerTwitch) println("TWITCH $quantitatAtacsTwitch")
    }
}



