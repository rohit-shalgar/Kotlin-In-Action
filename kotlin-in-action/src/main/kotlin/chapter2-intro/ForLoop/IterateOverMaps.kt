package `chapter2-intro`.ForLoop

import java.util.*

fun createAndPrintBinaries() {
    val binaries = TreeMap<Char, String>()
    for (c in 'A'..'F') binaries[c] = Integer.toBinaryString(c.toInt())
    for ((character, string) in binaries) println("$character = $string")
}

fun main() {
    createAndPrintBinaries()
}

