package `chapter4-classes`

/*
 Implement add all method from set and check how many objects were actually added.
 */
//by keyword indicates delegation.all the methods from MutableSet are already
// you delegate the implementation of the MutableCollection interface to the container you’re wrapping.
class DelegationExample<T>(
    private val innerSet: MutableCollection<T> = HashSet()
) : MutableCollection<T> by innerSet {
    var objects = 0
    override fun addAll(elements: Collection<T>): Boolean {
        objects += elements.size
        return innerSet.addAll(elements)
    }
}

fun main() {
    val innerSetSample = DelegationExample<Int>()
    innerSetSample.addAll(listOf(1, 2, 4, 5, 5, 2, 4))
    println(
        "${innerSetSample.objects} were attempted to be entered" +
                "but only ${innerSetSample.size} were added."
    )

}