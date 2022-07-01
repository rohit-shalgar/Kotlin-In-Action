package `chapter2-intro`.IfWhen

import kotlin.IllegalArgumentException

//marker interface, just an holder to show interface being implemented.
interface Expr

class Num(val value: Int) : Expr

class Sum(val left: Expr, val right: Expr) : Expr

fun eval(e: Expr): Int =
    /*
        if statement returns value in Kotlin as it is an expression and not a statement like in Java.
        for one line of code inside if block, we dont need {}

     */
    if (e is Num) e.value
    else if (e is Sum) eval(e.right) + eval(e.left)
    else throw IllegalArgumentException("Unknown expresion")

/*
    Recommended to use When , instead of if cascade, here through smart casting we can just return the required values.
 */
fun evalWithWhen(e: Expr): Int =
    when (e) {
        is Num -> e.value
        is Sum -> evalWithWhen(e.left) + evalWithWhen(e.right)
        else -> throw IllegalArgumentException("Unknown")
    }

fun main() {
    println(
        eval(
            Sum(
                Sum(Num(1), Num(2)),
                Num(4)
            )
        )
    )
    println(
        evalWithWhen(
            Sum(
                Sum(
                    Num(1),
                    Num(5)
                ),
                Num(7)
            )
        )
    )
}
