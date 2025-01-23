package org.example.lesson_4

fun main() {

    val weightBox1 = 20
    val volueBox1 = 80
    val weightBox2 = 50
    val volueBox2 = 100

    println(
        "Груз весом $weightBox1 и объёмом $volueBox1 соответствует категории \"Average\":" +
                " ${(weightBox1 > MIN_WEIGHT) && (weightBox1 <= MAX_WEIGHT) && (volueBox1 < MAX_VOLUE)} "
    )

    println(
        "Груз весом $weightBox2 и объёмом $volueBox2 соответствует категории \"Average\":" +
                " ${(weightBox2 > MIN_WEIGHT) && (weightBox2 <= MAX_WEIGHT) && (volueBox2 < MAX_VOLUE)} "
    )

}

const val MIN_WEIGHT = 35
const val MAX_WEIGHT = 100
const val MAX_VOLUE = 100

