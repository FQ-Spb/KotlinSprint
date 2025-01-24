package org.example.lesson6

fun main() {

    val hiddenNumber = (1..9).random()
    var attemptCounter = 5

    println("Угадайте число от 1 до 9")
    var inputNumber = readln().toInt()
    attemptCounter--
    while (attemptCounter > 0) {
        if (inputNumber == hiddenNumber) {
            println("Это была великолепная игра! Загаданное число действительно $hiddenNumber")
            return
        } else {
            println("Не угадал.Попробуй ещё.")
            inputNumber = readln().toInt()
            --attemptCounter
        }
    }
    println("Попытки кончились. Было загадано число $hiddenNumber")
}