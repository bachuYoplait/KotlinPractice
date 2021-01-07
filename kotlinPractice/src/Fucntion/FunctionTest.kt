package Fucntion

fun main(args: Array<String>): Unit {

    var name:String="test";
    var value:Int=11;

    println("Happy new Year")
    println(sum(1, 2))
    println(sum2(1, 2))
    println(sum3(1, 2))
    println(sum4(1))
    println(value)
}

fun sum(a: Int, b: Int): Int {

    return a + b
}

fun sum2(a: Int, b: Int): Int = a + b
fun sum3(a: Int, b: Int) = a + b
fun sum4(a: Int, b: Int = 10) = a + b