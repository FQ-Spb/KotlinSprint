package org.example.lesson7

fun main() {

    println("Введите целое число: ")
    val userInputNumber = readln().toInt()

    for (number in 0..userInputNumber step 2) println(number)
}