@file:Suppress("NAME_SHADOWING")

package `chapter8-HighOrderFunctions`

fun ArithmeticOperations(operation: (Int, Int) -> Int = { a, b -> a -b}, a: Int, b: Int) {
    println(operation(a, b))
}


fun main() {
    ArithmeticOperations({ a, b -> a * b }, 1, 2)
    ArithmeticOperations({ a, b -> a + b }, 11, -2)

    println("ABCD".filter { c: Char -> c in 'A'..'C' })
}


fun String.filter(predicate: (Char) -> Boolean): String {
    val stringBuilder = StringBuilder()
    for (index in 0 until this.length) {
        val ele = this[index]
        if (predicate(ele)) stringBuilder.append(ele)
    }
    return stringBuilder.toString()
}