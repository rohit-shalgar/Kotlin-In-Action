package `chapter2-intro`

class Shape(
    private val height: Int, private val width: Int
) {
    val isSquare: Boolean get() = height == width
}