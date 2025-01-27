package org.example.lesson9

fun main() {

    val listOfIngredients = mutableListOf("вода", "сахар", "заварка")

    print("В рецепте есть базовые ингредиенты:  ")
    listOfIngredients.forEach { ingredient -> print("$ingredient ") }
println()
    print("Желаете ли что-то добавить?")
    val userAnswer = readln()
    if (!userAnswer.equals(AGREE))return
    print("Какой ингредиент вы хотите добавить?: ")
    val userAddedIngredient = readln()

}

const val AGREE = "да"