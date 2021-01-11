package Fucntion

import Class.Book
import Class.EBook


fun main(args: Array<String>) {
    val book = Book("Harry Potter", 10000)
    var eBook = EBook("Harry Potter", 10000, "http:harry_potter.com")
    book.printInfo()
    eBook.printInfo();
}
