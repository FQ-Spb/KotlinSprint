package org.example.lesson16

import kotlin.math.pow

class Circle(
    protected val radius: Double = 3.0,
    private val numberPi: Double = 3.14,
) {
    fun countLengthOfCircumference(): Double {
        val result = 2 * numberPi * radius
        return result
    }

    fun countArea(): Double {
        val result = numberPi * radius.pow(2)
        return result
    }
}

fun main() {
    val circle1 = Circle()

    println(circle1.countLengthOfCircumference())
    println(circle1.countArea())
}