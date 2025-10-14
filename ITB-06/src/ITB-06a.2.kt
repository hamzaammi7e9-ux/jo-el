import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val notes = scanner.nextInt()
    while(notes!=-1 && notes<=10){
        val notes= scanner.nextInt()
        var notesValides = 0
        ++notesValides
        var notesMitjana = 0
        var excellent = 0
        var notable = 0
        var be = 0
        var suficient = 0
        var insuficient = 0
        var molt_deficient = 0

        if (notes in 9..10) ++excellent
        else if(notes in 7 in 8) ++notable
        else if(notes == 6 ) ++ be
        else if(notes == 5) ++ suficient
        else if(notes == 4) ++ insuficient
        else if(notes in 1..3) ++molt_deficient
    }
    println("NOTES: $notesVal MITJANA: $notes E: xxx N: xxx B: xxx S: xxx I: xxx MD: xxx\n")
}