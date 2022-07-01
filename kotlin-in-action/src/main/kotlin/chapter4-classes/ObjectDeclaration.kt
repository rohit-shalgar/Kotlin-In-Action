package `chapter4-classes`

object ObjectDeclaration {
    val payrollAllEmployes = ArrayList<Any>()
}

/*
    object declaration allows you to create a class and a variable in the same line
    Here ObjectDeclaration class has payrollAllEmployes variable and its a singleton as only object will
    ever be created.
    object declarations cant have primary or secondary constructors.
 */
// it is converted to class with static field and static single instance
// excatly how we would write a singleton class in Java.
fun main() {
    ObjectDeclaration.payrollAllEmployes.add(
        DataClassSample(
            name = "Rohit",
            address = "MX",
            number = 123
        )
    )
    println(ObjectDeclaration.payrollAllEmployes.size)
}