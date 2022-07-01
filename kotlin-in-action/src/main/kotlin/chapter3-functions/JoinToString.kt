package `chapter3-functions`

fun <T> joinToString(
    collection: Collection<T>,
    prefix: String = "",
    joiner: String = ",",
    postFix: String = ""
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(joiner)
        result.append(element)
    }
    result.append(postFix)
    return result.toString();
}

fun String.lastChar(): Char = this[length - 1]

fun main() {
    val list = listOf("A", "B", "C")
    println(joinToString(list, prefix = "(", joiner = ";", postFix = ")"))
    /*
        Function can have default values and we can specify the argument names to function as shown above.
     */

    /*
        String.lastChar() is an extension function to String class
        it is part of String class but recides outside of it.
        String class is called - reciever type
        whereas, the input is called reciever object
        Compiled code will have these methods as Java static methods, hence they cant be extended.
     */
    println("Kotlin".lastChar())
}