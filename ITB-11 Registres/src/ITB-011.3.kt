import java.util.Scanner
import java.util.Locale

// Data class to store student info
data class Student(
    val name: String,
    val partial1: Double,
    val partial2: Double,
    val finalScore: Double
)

fun main() {
    val scanner = Scanner(System.`in`).useLocale(Locale.US)

    //Read student count and define the list
    val studentCount = scanner.nextInt()
    val students : MutableList<Student> = mutableListOf()

    //Read the student info and add to the list
    for (i in 0 until studentCount) {
        val name = scanner.next()
        val score1 = scanner.nextDouble()
        val score2 = scanner.nextDouble()

        // Calculate final: 40% of first + 60% of second
        val finalCalc = (score1 * 0.40) + (score2 * 0.60)

        students.add(Student(name, score1, score2, finalCalc))
    }

    // Read student ranks
    val rankP1 = scanner.nextInt()
    val rankP2 = scanner.nextInt()

    // Sort by the score of the second partial , high to low.
    val sortedByPartial2 = students.sortedByDescending { it.partial2 }
    val student1 = sortedByPartial2[rankP1 - 1]

    // Sort by the final score , high to low.
    val sortedByFinal = students.sortedByDescending { it.finalScore }
    val student2 = sortedByFinal[rankP2 - 1]

    // Print the result
    println("${student1.name} ${student1.partial1} ${student1.partial2} %.2f".format(Locale.US, student1.finalScore))
    println("${student2.name} ${student2.partial1} ${student2.partial2} %.2f".format(Locale.US, student2.finalScore))

}