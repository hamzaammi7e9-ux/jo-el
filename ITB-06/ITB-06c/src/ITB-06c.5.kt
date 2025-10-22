import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    //Llegim els casos totals
    val casosTotals = scanner.nextInt()

    repeat(casosTotals){
        //Llegim la profunditat del pou, i els metres que puja de dia i cau de nit el caragol
        val profunditatPou : Int = scanner.nextInt()
        val pujadaDia : Int = scanner.nextInt()
        val caigudaNit : Int = scanner.nextInt()
        //Inicialitzem els metres actuals i els dies trigats del caragol
        var metresActuals : Int = 0
        var diesTrigats : Int = 0
        //Al principi el caragol no aquesta fora del pou
        var foraDelPou : Boolean = false


        if(profunditatPou in 1..999 && pujadaDia in 0..999 && caigudaNit in 0..999) {
            //Primer comprovem que els metres de pujada de dia no siguin més petits o iguals que els de la caiguda de nit
            //Si és cert, significa que el caragol no tindrà possible sortir del pou.
            if (pujadaDia <= caigudaNit && profunditatPou > pujadaDia) println("NO")

            //Fem un bucle on, sempre que els metres actuals siguin menys que els de la profunditat del pou (el caragol no ha sortit del pou)
            else while (metresActuals < profunditatPou) {
                //Cada vegada que el caragol encara estigui dins del pou, s'afegeix un dia trigat
                ++diesTrigats
                //Sumem els metres de pujada de dia als metres actuals
                metresActuals += pujadaDia
                //Si en sumar-los els metres actuals són més grans o iguals que la profunditat del pou, el caragol esta fora.
                if (metresActuals >= profunditatPou) {
                    foraDelPou = true
                } else metresActuals -= caigudaNit //Si no, restem els metres de caiguda de nit als metres actuals
            }
            //Quan el caragol estigui fora del pou, mostrem els dies trigats
            if (foraDelPou) println(diesTrigats)

        }
        else println()
    }
}