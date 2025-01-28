package org.example.lesson8

fun main() {

    println("Какое количество ингредиентов будет в вашем рецепте?")
    val numberOfIngredients = readln().toInt()
    val listOfIngredients = Array<String?>(numberOfIngredients) { null }

    for (i in 0 until listOfIngredients.size) {
        print("Введите ингредиент ${i + 1}: ")
        listOfIngredients[i] = readln()
    }

    println(listOfIngredients.joinToString())
}