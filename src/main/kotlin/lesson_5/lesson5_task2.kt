package org.example.lesson_5

import java.util.Calendar

fun main() {

    val calendar = Calendar.getInstance()
    val currentYear = calendar.get(Calendar.YEAR)

    println("Введите свой год рождения :")
    val userYearOfBirth = readln().toInt()
    val result = when {
        (currentYear - userYearOfBirth) >= AGE_OF_MAJORITY -> "Показать экран со скрытым контентом."
        else -> "Доступ закрыт."
    }
    println(result)
}

const val AGE_OF_MAJORITY = 18