data class Drink(val name: String, val type: String, var price: Float) {
    fun PriceSet(newPrice: Float) {
        price = newPrice
        println("New price $$price set.")
    }

    override fun toString(): String {
        return "$name, a $type drink, costs $$price."
    }
}