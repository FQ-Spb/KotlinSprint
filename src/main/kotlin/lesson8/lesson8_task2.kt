package org.example.lesson8

fun main() {

    val compositionOfOlivie = arrayOf("Картофель", "Колбаса", "Яйца", "Морковь", "Горошек", "Соль", "Майонез", "Лук")

    println("Какой игредиент вы хотите найти?")
    val lookingForIngredient = readln()

    for (component in compositionOfOlivie) {
        if (component != lookingForIngredient) continue
        else {
            println("Ингредиент $lookingForIngredient в рецепте есть.")
            return
        }
    }
    println("Ингредиента $lookingForIngredient в рецепте нет.")
}