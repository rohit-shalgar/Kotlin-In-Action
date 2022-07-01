import `chapter2-intro`.Color
import `chapter2-intro`.Colors
import `chapter2-intro`.Person
import `chapter2-intro`.Shape

fun main(args: Array<String>) {
    println("Hello ${if (args.isNotEmpty()) args[0] else "World!"}")

    val answer: Int

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    answer = max(3, 5)
    println(answer)
    println(maxInline(40, 45))

    val person = Person("Rohit", true)
    println("${person.name} is married ? That is -${person.isMarried}")

    val shape = Shape(10, 20)
    println("The shape is square, this statement is -> ${shape.isSquare}")

    println("RGB of color blue is - ${Colors.BLUE.getRGB()} and for Red is - ${Colors.RED.getRGB()}")

    checkWarmth(Color.RED)
}

fun checkWarmth(color: Color) {
    when(color){
      //  color.RED -> "Red is returned"
    }

}


// max is block body function, return type can't be removed.
fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun maxInline(a: Int, b: Int): Int = if (a > b) a else b// expression body, return type can be removed ,