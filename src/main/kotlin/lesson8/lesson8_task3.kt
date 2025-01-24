package org.example.lesson8

fun main() {

    val compositionOfOlivie = arrayOf("Картофель", "Колбаса", "Яйца", "Морковь", "Горошек", "Соль", "Майонез", "Лук")

    println("Какой игредиент вы ищете?")
    val lookingForIngredient = readln()

    val result = when (compositionOfOlivie.find { it == lookingForIngredient }) {
        lookingForIngredient -> "Ингредиент в рецепте есть."
        else -> "Такого ингредиента нет."
    }
    println(result)
}