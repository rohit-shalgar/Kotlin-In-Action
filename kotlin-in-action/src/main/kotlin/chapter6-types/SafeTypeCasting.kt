package `chapter6-types`

/*
    as? is a safe cast operator, it s effective replacing if( other is Person) then cast check
    as? and ?: are often used together to create concise null safe code.
 */
class Persons(private val firstName: String, private val lastName: String) {
    override fun equals(other: Any?): Boolean {
        val otherPerson = other as? Persons ?: return false
        return otherPerson.firstName == firstName &&
                otherPerson.lastName == lastName
    }

    override fun hashCode(): Int {
        var result = firstName.hashCode()
        result = 31 * result + lastName.hashCode()
        return result
    }
}

fun notNullAssertion(s: String?): Int? {
    val nonNullString: String? = s!! // if s is null exception is thrown at this line
    // !! is known as null assertion operator.
    return nonNullString?.length
}

fun main() {
    val person1 = Persons("Rohit", "Shalgar")
    val person2 = Persons("Rohit", "Shalgar")
    println(person1 == person2)

    notNullAssertion(null)

}