package org.example.lesson14

import kotlin.math.pow

abstract class Figure(
    val color: String,
) {
    abstract fun calculateArea(): Double
    abstract fun calculatePerimeter(): Double
}

class Circle(
    color: String,
    val radius: Double,
) : Figure(color) {

    override fun calculateArea(): Double {
        val area = Math.PI * radius.pow(2)
        return area
    }

    override fun calculatePerimeter(): Double {
        val perimeter = 2 * Math.PI * radius
        return perimeter
    }
}

class Rectangle(
    color: String,
    val length: Double,
    val width: Double,
) : Figure(color) {

    override fun calculateArea(): Double {
        val area = length * width
        return area
    }

    override fun calculatePerimeter(): Double {
        val perimeter = (length + width) * 2
        return perimeter
    }
}

fun main() {

    val listOfFigures = mutableListOf<Figure>(
        Circle("White", 15.0),
        Circle("Black", 20.3),
        Rectangle("White", 21.5, 11.8),
        Rectangle("Black", 18.6, 9.0)
    )
    var sumPerimetersOfBlackFig = 0.0
    var sumAreasOfWhiteFig = 0.0

    listOfFigures.forEach { if (it.color == "black") sumPerimetersOfBlackFig += it.calculatePerimeter() }
    listOfFigures.forEach { if (it.color == "White") sumAreasOfWhiteFig += it.calculateArea() }
}