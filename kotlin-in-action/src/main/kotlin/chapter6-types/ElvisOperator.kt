package `chapter6-types`

class Address(val country: String, val city: String)

class Person(val name: String, val address: Address?)


fun Person.getCountry(): String {
    return this.address?.country ?: "Not Found"
}

/*
    ?: is known as Elvis operator
    it returns a default value if the returned value is null.
    right side of the operator can be null or exception can be thrown.
 */

fun main() {
    val person = Person("Rohit", null)
    println(person.getCountry())
}