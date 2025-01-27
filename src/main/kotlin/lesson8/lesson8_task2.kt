package org.example.lesson8

fun main() {

    val compositionOfOlivie = arrayOf("Картофель", "Колбаса", "Яйца", "Морковь", "Горошек", "Соль", "Майонез", "Лук")

    println("Какой игредиент вы хотите найти?")
    val lookingForIngredient = readln()

    for (component in compositionOfOlivie) {
        if (component == lookingForIngredient) {
            println("Ингредиент $lookingForIngredient в рецепте есть")
            return
        }
    }
    println("Такого ингредиента в рецепте нет")
}