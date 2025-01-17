package org.example.lesson_4

fun main() {

    val minWeight = 35
    val maxWeight = 100
    val maxVolue = 100
    val weightBox1 = 20
    val volueBox1 = 80
    val weightBox2 = 50
    val volueBox2 = 100

    println(
        "Груз весом $weightBox1 и объёмом $volueBox1 соответствует категории \"Average\":" +
                " ${(weightBox1 > minWeight) && (weightBox1 <= maxWeight) && (volueBox1 < maxVolue)} "
    )

    println(
        "Груз весом $weightBox2 и объёмом $volueBox2 соответствует категории \"Average\":" +
                " ${(weightBox2 > minWeight) && (weightBox2 <= maxWeight) && (volueBox2 < maxVolue)} "
    )

}

