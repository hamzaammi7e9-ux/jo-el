import java.util.Scanner

//Input:
//amount of cases to test
//Each case has multiple lines.
//1. a number (k) representing the amount of cars in the competition.
//2. K lines, each containing a name of a car.
// It is guaranteed that one of the cars is named ❝Francesco Virgolini”, and it can never occupy the first position.

//Output:
//For each case print the list of cars having ❝Francesco Virgolini” passed one position. In this format: [.., ...]

fun main() {

    val sc = Scanner(System.`in`)
    val amountOfCases = sc.nextInt()

    repeat(amountOfCases) {

        val amountOfCars = sc.nextInt()
        val cars: MutableList<String> = mutableListOf()

        sc.nextLine()

        //Read the names of the cars and add them to the list.
        for(car in 0 until amountOfCars) {
            cars.add(sc.nextLine())
        }

        //Get the position where "Francesco Virgolini" is located
        val francescoPos = cars.indexOf("Francesco Virgolini")

        if (francescoPos != -1 && francescoPos > 0) {
            //Get the position of the car we want to pass
            val passedCar = cars[francescoPos - 1]
            //Make "Francesco Virgolini" pass 1 position
            cars[francescoPos - 1] = cars[francescoPos]
            //Make the car we wanted to pass go back 1 position.
            cars[francescoPos] = passedCar
        }
        println(cars)
    }
}
