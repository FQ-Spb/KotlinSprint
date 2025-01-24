package org.example.lesson6

import kotlin.random.Random

fun main() {

    var number1: Int
    var number2: Int
    var numberOfAttemp = 3

    println("Докажите что вы не робот.\nВыполните арифметическое действие и введите результат: ")
    do {
        number1 = Random.nextInt(1, 9)
        number2 = Random.nextInt(1, 9)
        print("$number1 + $number2 =")
        val userResult = readln().toInt()
        if (userResult == (number1 + number2)) {
            println("Добро пожаловать!")
            return
        } else {
            numberOfAttemp--
        }

    } while (numberOfAttemp > 0)
    println("Доступ запрещён!")
}
