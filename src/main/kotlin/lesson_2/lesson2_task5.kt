package org.example.lesson_2

import kotlin.math.pow

fun main() {
    val depositAmount = 70000
    val depositTerm = 20
    val futureDepAmount = depositAmount * ((1 + INTEREST_RATE / 100).pow(depositTerm))

    println("%.3f".format(futureDepAmount))
}

const val INTEREST_RATE = 16.7