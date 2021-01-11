package Class

class EBook(title: String, price: Int, var url: String) : Book(title, price) {

    override fun printInfo() {
        println("title = $title, price = $price, url = $url")
    }
}