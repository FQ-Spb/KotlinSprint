package org.example.lesson9

fun main() {

    val listOfIngredients = mutableListOf("вода", "сахар", "заварка")

    print("В рецепте есть базовые ингредиенты:  ")
    listOfIngredients.forEach { ingredient -> print("$ingredient ") }
    println()
    print("Желаете ли что-то добавить?")
    val userAnswer = readln()
    if (!userAnswer.equals(AGREE, ignoreCase = true)) return

    print("Какой ингредиент вы хотите добавить?: ")
    listOfIngredients.add(readln())
    print("Теперь в рецепте есть следующие ингредиенты: ${listOfIngredients.joinToString(", ")}")
}

const val AGREE = "да"