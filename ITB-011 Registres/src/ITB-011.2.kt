import java.util.Locale
import java.util.Scanner

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
    //Read the name of product we want to find.
    val productName = sc.next()

    //Sort the product list by name alphabetical order.
    productList.sortBy{it.name[0]}

    //Initialize a boolean to check if the product has been found to false.
    var foundProduct : Boolean = false


    for(i in 0 until productList.size){
        //If we find the product print "SI, M'HA COSTAT {price}"
        if(productList[i].name==productName){
            print("SI, M'HA COSTAT ${productList[i].price} ")
            foundProduct = true //The product has been found

            //BUT, if the product was NOT in the first position in alphabetical order, also print the price and name of the previous product.
            if(i!=0){
                print("I TAMBE TINC ${productList[i-1].name} A ${productList[i - 1].price}")
            }
        }
    }
    //If the product has not been found print "NO N'HI HAVIA"
    if(!foundProduct) println("NO N'HI HAVIA")
}