package org.example.lesson_5


fun main() {

    val hiddenNumbers = listOf((0..42).random(), (0..42).random(), (0..42).random())

    println("Введите три числа от 0 до 42:")
    val enteredNumbers = MutableList(3) { readln().toInt() }
    val intersection = hiddenNumbers.intersect(enteredNumbers)
    val result = when (intersection.count()) {
        3 -> "Вы угадали все три числа и выиграли джек-пот!"
        2 -> "Вы угадали два числа! Вам положен крупный приз!"
        1 -> "Вы угадали одно число. Утешительный приз ваш."
        else -> "Вы не угадали ни одного числа."
    }
    println("$result Загаданные числа были $hiddenNumbers")

}