package org.example.lesson9

fun main() {

   val friedEggsIngredients = mutableMapOf("Яйцо (шт)" to 2,"Молоко (мл)" to 50, "Масло (гр)" to 15)

   print("Сколько порций вы хотите приготовить?: ")
   val numberOfPortions = readln().toInt()
   println("Для приготовдения $numberOfPortions порций вам потребуется: ")
   friedEggsIngredients.forEach{ (key,value) -> println("$key - ${value*numberOfPortions}")}
}