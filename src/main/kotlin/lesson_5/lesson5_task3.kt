package org.example.lesson_5

fun main() {

    println("Для получения главного приза, угадайте два числа от 0 до 42.\n Ведите первое число и нажмите \"Enter\":")
    val enteredNumber1 = readln().toInt()
    println("Ведите второе число и нажмите \"Enter\":")
    val enteredNumber2 = readln().toInt()
    val result = when {
        (enteredNumber1 == HIDDEN_NUMBER1 && enteredNumber2 == HIDDEN_NUMBER2) ||
                (enteredNumber1 == HIDDEN_NUMBER2 && enteredNumber2 == HIDDEN_NUMBER1) -> "Поздравляем! Вы выиграли главный приз!"

        enteredNumber1 == HIDDEN_NUMBER1 || enteredNumber1 == HIDDEN_NUMBER2 &&
                enteredNumber2 != HIDDEN_NUMBER1 && enteredNumber2 != HIDDEN_NUMBER2 -> "Вы выиграли утешительный приз!"

        enteredNumber2 == HIDDEN_NUMBER1 || enteredNumber2 == HIDDEN_NUMBER2 &&
                enteredNumber1 != HIDDEN_NUMBER1 && enteredNumber1 != HIDDEN_NUMBER2 -> "Вы выиграли утешительный приз!"

        else -> "Неудача."
    }
    println(result)
}

const val HIDDEN_NUMBER1 = 37
const val HIDDEN_NUMBER2 = 9