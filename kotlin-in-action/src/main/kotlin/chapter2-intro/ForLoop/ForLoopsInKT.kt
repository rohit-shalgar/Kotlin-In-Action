package `chapter2-intro`.ForLoop

/*
    only for each loop in Kotlin,
    uses range funtion to do the 1 to 100 iteration
    last number in inclusive in KT
 */
fun fizzBuzz(i: Int) = when{
    i%15 == 0 -> "FIZZBUZZ"
    i%3 == 0 -> "FIZZ"
    i%5 == 0 -> "BUZZ"
    else -> "$i"
}

fun main() {
    for (i in 1..100) println(fizzBuzz(i))
}