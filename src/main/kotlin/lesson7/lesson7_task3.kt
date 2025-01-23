package org.example.lesson7

fun main() {

    println("Введите целое число: ")
    val userInputNumber = readln().toInt()

    if (userInputNumber < 0) {
        for (number in 0 downTo userInputNumber step 2) println(number)
    } else {
        for (number in 0..userInputNumber step 2) println(number)
    }
}