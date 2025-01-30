package org.example.lesson9

import java.util.*

fun main() {

    val listOfIngredients = mutableSetOf<String>()

    println("Введите пять ингредиентов после каждого нажимая \"ENTER\": ")
    do {
        listOfIngredients.add(readln().trim())
    } while (listOfIngredients.size < 5)

    println(listOfIngredients.sorted().joinToString()
        .replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() })
}