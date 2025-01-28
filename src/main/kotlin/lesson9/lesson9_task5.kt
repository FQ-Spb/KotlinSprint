package org.example.lesson9

fun main() {

    val listOfIngredients = mutableSetOf<String>()

    println("Введите пять ингредиентов после каждого нажимая \"ENTER\": ")
    do {
        listOfIngredients.add(readln())
    } while (listOfIngredients.size < 5)

    println(listOfIngredients.sorted().joinToString().capitalize())
}