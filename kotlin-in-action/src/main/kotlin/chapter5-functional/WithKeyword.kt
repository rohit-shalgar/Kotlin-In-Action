package `chapter5-functional`

fun alphabets(): String {
    val result = StringBuilder()
    for (c in 'A'..'Z') {
        result.append(c)
    }
    return result.toString()
}

fun main() {
    println("Without With receiever -> ${alphabets()}")
    println("With receiever -> ${alphabetsWith()}")
    println("Apply -> ${alphabetApply()}")
    println("BuildString in KT -> ${alphabetApply()}")
}

/*
    using with keyword, we can recieve this object and make it simplier instead of calling methods
    on the same object ( result) in above exmaple.
 */

/*
    with reciever takes the Stringbuilder reciever object and lambda
    and calls methods on this.
    you can also use this keyword.
    the first argument is considered as reciever to the lambda.
 */
fun alphabetsWith(): String {
    val result = StringBuilder()
    return with(result) {
        for (c in 'A'..'Z') {
            append(c)
        }
        toString()
    }
}

/*
    Apply function returns the reciever object.
    here StringBuilder is reciever to the apply lambda expression
    when the object is returned we call toString to get the string value.
 */
fun alphabetApply() = StringBuilder().apply {
    for (c in 'A'..'Z') append(c)
}.toString()


/*
    buildString is a library function which builds string builder and returns toString() on it by def.
    reciever to this lambda function is string builder.
 */
fun alphabetBuilder() = buildString {
    for (c in 'A'..'Z') append(c)
}