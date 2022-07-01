package `chapter2-intro`.casting

import java.lang.IllegalArgumentException

//marker interface, just an holder to show interface being implemented.
interface Expr

class Num(val value: Int) : Expr

class Sum(val left: Expr, val right: Expr) : Expr

fun eval(e: Expr): Int {
    /*
        if e is num is Java style, need to do casting before we access in Java,
        in Kotlin its not required, complier does smart cast for you.
        is - instanceOf
        as - casting () in Java

     */
    if (e is Num) {
        val value = e as Num
        return value.value
    }
    if (e is Sum) return eval(e.right) + eval(e.left)
    throw IllegalArgumentException("Unknown expresion")
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
}
