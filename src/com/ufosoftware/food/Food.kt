package com.ufosoftware.food

open class Food(private val name: String, private val type: String, var price: Float) {
    fun priceSet(newPrice: Float) {
        price = newPrice
        println("New price $$price set.")
    }

    override fun toString(): String {
        return "$name, a $type, costs $$price."
    }
}