package `chapter4-classes`


/*
    Whenever we want to compare the objects ,
        - we need to override equals and hashcode() methods
            - hashset checks for hashcode first and then calls equals method on object.
        - to print object properly we need to override toString() method.
   data class - data keyword indicates kotlin to provide all these methods.
   all the values in primary constructor are used for equals and to calculate hashcode.
 */
data class DataClassSample(
    val name: String, val address: String, val number: Any?
)

fun main() {
    var dataClassSample = DataClassSample("Rohit", "MX", 123)
    dataClassSample = dataClassSample.copy(number = 567)
    // copy methods creates an copy of the class object
    // useful in case of immutability.
}