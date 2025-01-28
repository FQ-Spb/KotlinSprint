package org.example.lesson9

fun main() {

    val listOfIngredients = mutableSetOf<String>()

    println("Введите через запятую 5 ингредиентов:  ")
    val userInputValues = readln().split(", ")

    userInputValues.forEach { value -> listOfIngredients.add(value) }
    val result = listOfIngredients.sorted()
    println(result.joinToString())
}