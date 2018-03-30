import com.ufosoftware.food.*

fun addFood(): ArrayList<Food> {
    val foodies = ArrayList<Food>()
    manko@ while(true) {
        print("Enter food name (or break to exit): ")
        val nom = readLine() ?: ""
        if (nom == "break") break@manko
        print("Enter type of food: ")
        val v = readLine() ?: ""
        print("Enter price (USD): ")
        val mons: Float = readLine()?.toFloat() ?: 0.0F
        foodies.add(Food(nom, v, mons))
    }
    return foodies
}

fun addDrink(): ArrayList<Drink> {
    val drinkies = ArrayList<Drink>()
    manko@ while(true) {
        print("Enter drink name (or break to exit): ")
        val nom = readLine() ?: ""
        if (nom == "break") break@manko
        print("Enter type of drink: ")
        val v = readLine() ?: ""
        print("Enter price (USD): ")
        val mons: Float = readLine()?.toFloat() ?: 0.0F
        drinkies.add(Drink(nom, v, mons))
    }
    return drinkies
}
fun menuDisplay(Food: ArrayList<Food>, Drink: ArrayList<Drink>) {
    println("-----com.ufosoftware.food.Food Menu-----")
    for(x in 0 until Food.size) {
        val printer = Food[x]
        println(printer.toString())
    }
    println("\n-----com.ufosoftware.food.Drink Menu-----")
    for(x in 0 until Drink.size) {
        val printer = Drink[x]
        println(printer.toString())
    }
}

fun main(args: Array<String>) {
    var DrinkList = ArrayList<Drink>()
    var FoodList = ArrayList<Food>()
    var x: Int
    breaker@ while(true) {
        print("Add food or drink? (1: com.ufosoftware.food.Food, 2: com.ufosoftware.food.Drink) ")
        print("\nEnter -1 to exit menu creation. ")
        x = readLine()?.toInt() ?: -1
        when (x) {
            1 -> {
                FoodList = addFood()

            }
            2 -> {
                DrinkList = addDrink()

            }
            -1 -> break@breaker
            else -> kotlin.system.exitProcess(1)
        }
    }
    aaaa@ while(true) {
        print("\nEnter action (1: modify price, 2: print product info, 3: print menu)")
        print("\nEnter -1 to exit program, if done. ")
        x = readLine()?.toInt() ?: 3
        when(x) {
            1 -> {
                print("Enter either 1 to set food price, or 2 to set drink price. ")
                x = readLine()?.toInt() ?: 1
                when(x) {
                    1 -> {
                        print("Modify which food item? Use index values, starting from 0. ")
                        x = readLine()?.toInt() ?: 0
                        val modFood = FoodList[x]
                        print("Enter new price (Current price is $" + modFood.price)
                        val pp = readLine()?.toFloat() ?: 1.0F
                        modFood.priceSet(pp)
                        FoodList[x] = modFood
                    }
                    2 -> {
                        print("Modify which drink item? Use index values, starting from 0. ")
                        x = readLine()?.toInt() ?: 0
                        val modDrink = DrinkList[x]
                        print("Enter new price (Current price is $" + modDrink.price)
                        val pp = readLine()?.toFloat() ?: 1.0F
                        modDrink.priceSet(pp)
                        DrinkList[x] = modDrink
                    }
                    else -> println("Invalid option.")
                }
            }
            2 -> {
                print("Enter either 1 to print food info, or 2 to print drink info. ")
                x = readLine()?.toInt() ?: 1
                when(x) {
                    1 -> {
                        print("Print which food item? Use index values, starting from 0. ")
                        x = readLine()?.toInt() ?: 0
                        val modFood = FoodList[x]
                        print(modFood.toString())
                    }
                    2 -> {
                        print("Print which drink item? Use index values, starting from 0. ")
                        x = readLine()?.toInt() ?: 0
                        val modDrink = DrinkList[x]
                        print(modDrink.toString())
                    }
                    else -> println("Invalid option.")
                }
            }
            3 -> menuDisplay(FoodList, DrinkList)
            -1 -> kotlin.system.exitProcess(0)
            else -> println("Invalid option.")
        }
    }
}