package Class

class Button {

    var id: Int = 0

}

class Button2(_id: Int) {
    var id = _id
}

class Button3(var id: Int) {

}

class Button4(var id: Int, val x: Int = 10, val y: Int = 5)

class Button5(var id:Int){
    var test:String=""

    constructor(id:Int,test:String):this(id){
        this.id=id
        this.test=test
    }
    constructor(test:String):this(10){
        this.test=test
    }

}
fun main(args: Array<String>) {
    val button1: Button = Button()
    val button2=Button2(1)
    val button3=Button3(3)
    val button4=Button4(11)
    val button5=Button5(5,"kimkwangmin")
    button1.id = 10

    println("button1: ${button1.id}");
    println("button2: ${button2.id}");
    println("button3: ${button3.id}");
    println("button4: ${button4.id},${button4.x},${button4.y}");
    println("button5: ${button5.id},${button5.test}")
}