fun main() {

    val listOfIngredients = mutableListOf("вода", "сахар", "заварка", "лимон")

    println("В рецепте есть следующие ингредиенты:")
    listOfIngredients.forEach { ingredient -> println(ingredient) }
}