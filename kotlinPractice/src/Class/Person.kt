package Class

class Person(

    val name: String,
    var age: Int

)

fun main(args: Array<String>) {
    val person = Person("KwangMin", 31)

    person.age = 30;

    println(person.name)
    println(person.age)

}