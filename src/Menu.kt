import java.lang.*
fun addFood(): ArrayList<Food> {
    var foodies = ArrayList<Food>()
    manko@ while(true) {
        print("Enter food name (or break to exit): ")
        var nom = readLine() ?: ""
        if (nom.equals("break")) break@manko
        print("Enter type of food: ")
        var v = readLine() ?: ""
        print("Enter price (USD): ")
        var mons: Float = readLine()?.toFloat() ?: 0.0F
        foodies.add(Food(nom, v, mons))
    }
    return foodies
}

fun addDrink(): ArrayList<Drink> {
    var drinkies = ArrayList<Drink>()
    manko@ while(true) {
        print("Enter drink name (or break to exit): ")
        var nom = readLine() ?: ""
        if (nom.equals("break")) break@manko
        print("Enter type of drink: ")
        var v = readLine() ?: ""
        print("Enter price (USD): ")
        var mons: Float = readLine()?.toFloat() ?: 0.0F
        drinkies.add(Drink(nom, v, mons))
    }
    return drinkies
}

fun main(args: Array<String>) {
    var DrinkList = ArrayList<Drink>()
    var FoodList = ArrayList<Food>()
    var x: Int
    breaker@ while(true) {
        print("Add food or drink? (1: Food, 2: Drink) ")
        x = readLine()?.toInt() ?: 1
        when (x) {
            1 -> {
                FoodList = addFood()
                break@breaker
            }
            2 -> {
                DrinkList = addDrink()
                break@breaker
            }
            else -> kotlin.system.exitProcess(0)
        }
    }
    aaaa@ while(true) {

    }
}