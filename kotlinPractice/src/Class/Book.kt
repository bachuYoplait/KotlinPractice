package Class

open class Book(var title: String, var price: Int) {

    open fun printInfo() {
        println("title = $title, price = $price")

    }
}