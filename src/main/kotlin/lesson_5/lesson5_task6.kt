package org.example.lesson_5

import kotlin.math.pow

fun main() {

    println("Введите ваш вес в килограммах:")
    val userWeight = readln().toDouble()
    println("Введите свой рост в сантиметрах:")
    val userHeight = readln().toFloat()
    val bodyMassInd = userWeight / (userHeight / 100).pow(2)
    val result = when {
        bodyMassInd < LIMIT_OF_NORMAL_BODY_MASS -> "Недостаточная масса тела"

        bodyMassInd >= LIMIT_OF_NORMAL_BODY_MASS && bodyMassInd < LIMIT_OF_OVERWEIGHT -> "Нормальная масса тела"

        bodyMassInd >= LIMIT_OF_OVERWEIGHT && bodyMassInd < LIMIT_OF_OBESITY -> "Избыточная масса тела"

        else -> "Ожирение"
    }

    println("Ваш Индекс Массы Тела равен ${String.format("%.2f", bodyMassInd)} - $result")
}

const val LIMIT_OF_NORMAL_BODY_MASS = 18.5
const val LIMIT_OF_OVERWEIGHT = 25
const val LIMIT_OF_OBESITY = 30

