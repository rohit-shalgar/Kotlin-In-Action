package `chapter8-HighOrderFunctions`

enum class Delivery { STANDARD, EXPEDITE }

class Order(val items: Int)

fun calculateShippingCharges(delivery: Delivery): (Order) -> Double {
    if (delivery == Delivery.EXPEDITE) return { order: Order -> 1.2 * 3 * order.items }
    return { order: Order -> 1.2 * order.items }
}

fun main() {
    val delivery = Delivery.EXPEDITE
    val charges = calculateShippingCharges(delivery)
    println("Shipping charges will be -> ${charges(Order(21))}$")
}