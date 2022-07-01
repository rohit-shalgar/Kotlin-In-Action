package `chapter4-classes`

import kotlin.Comparator

data class Person(val name: String) {
    object PersonComparator : Comparator<Person> {
        override fun compare(p1: Person, p2: Person): Int {
            return if (p1.name == p2.name) 0 else p1.name.compareTo(p2.name)
        }
    }

    fun anonymousObj(): Any {
        // object here is similar to Java's inner class.
        // This is known as object expression. they can access all the members of the function
        // they are declared in.
        // in Java only final variables in the function can be accessed.
        val ann = object {
            override fun toString(): String {
                return super.toString()
            }
        }
        return ann
    }

    /*
        companion object can access private member of the class.
        when constructor is private we can use companion object.
        it is like creating a nested inner class.
     */
    companion object {
        fun demoCompanion() = println("Inside companion.")
    }
}

fun main() {
    val persons = listOf(Person("ZX"), Person("AY"))
    println(persons.sortedWith(Person.PersonComparator)) // Similar to static methods in Java
    //Kotlin does not support static methods or static variables
    //Hence we can use object declaration.
    Person.demoCompanion()
}


