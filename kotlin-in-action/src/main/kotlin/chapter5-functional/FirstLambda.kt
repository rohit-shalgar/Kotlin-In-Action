package `chapter5-functional`

data class Person(val name: String, val age: Int)

fun main() {
    val persons = listOf(Person("ALiice", 29), Person("Bob", 56))
    println("Oldest Person is -> ${persons.maxByOrNull { person -> person.age }}")
    println("Youngest Person is -> ${persons.minByOrNull(Person::age)}")
    run(::salute)

    val numbers = listOf(1, 2, 3, 4, 5, 6)
    println("even numbers = ${numbers.filter { number -> number % 2 == 0 }}")
    println("Below 30 = ${persons.filter { person -> person.age < 30 }}")
}

/*
    Lambdas can access local variables in the functions.
    variables don't have to be final.
    In Java, you can only access final variables.
 */

fun salute() = println("Salute")

