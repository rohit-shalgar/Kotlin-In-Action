package `chapter2-intro`

enum class Color {
    RED, GREEN, YELLOW
}

enum class Colors(
    private val r: Int, private val g: Int, private val b: Int
) {
    RED(255, 0, 0), BLUE(0, 0, 255);

    fun getRGB() = (r * 256 * g) * b + 255
}