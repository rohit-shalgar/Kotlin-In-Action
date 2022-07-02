package `chapter6-types`


/*
    ? is known as safe operator
    is it equal to if(x! = null) callFunction else null
    only if the input is not null, then the function is invoked.
 */
class Employee(private val name: String, private val manager: Employee?) {
    fun managerName(): String? {
        return this.manager?.name
    }
}

fun main() {
    val boss = Employee("Alex", null)
    val developer = Employee("Rohit", boss)
    println("Developer is - $developer and his manager is ->${developer.managerName()}")
    println("Boss is - $boss and his manager is ->${boss.managerName()}")
}