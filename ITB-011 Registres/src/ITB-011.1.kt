import java.util.Locale
import java.util.Scanner

data class Product(var name: String, var price: Float)

fun main() {

    val sc = Scanner(System.`in`).useLocale(Locale.UK)

    //Read amount of products
    val amountOfProducts = sc.nextInt()

    //Define the product list
    val productList: MutableList<Product> = mutableListOf()

    //Read the products
    repeat(amountOfProducts) {
        productList.add(Product(sc.next(), sc.nextFloat()))
    }

    //Read P
    val P = sc.nextInt()

    //Sort the product list by descending price so that the first price is the most expensive and the last one is the cheapest one
    productList.sortByDescending { it.price }

    //Print most expensive product
    println("EL MES CAR: ${productList.first().name} ${productList.first().price}")

    //Print cheapest product
    println("EL MES BARAT: ${productList.last().name} ${productList.last().price}")

    //Print the product at position P
    println("EL BUSCAT: ${productList[P-1].name} ${productList[P - 1].price}")


}