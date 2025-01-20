package org.example.lesson_5

fun main() {

    val testNumber1 = (0..10).random()
    val testNumber2 = (0..20).random()

    println("Здравствуйте! Подтвердите, что вы не робот, сложив два числа : $testNumber2+$testNumber1")
    val answer = readln().toInt()
    val result = if (answer == (testNumber1 + testNumber2)) "Добро пожаловать!"
    else "Доступ запрещён!"
    println(result)
}

