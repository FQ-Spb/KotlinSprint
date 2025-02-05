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
        Circle(WHITE_COLOR, 15.0),
        Circle(BLACK_COLOR, 20.3),
        Rectangle(WHITE_COLOR, 21.5, 11.8),
        Rectangle(BLACK_COLOR, 18.6, 9.0)
    )
    val listOfWhiteFigures = listOfFigures.filter { it.color == WHITE_COLOR }
    val listOfBlackFigures = listOfFigures.filter { it.color == BLACK_COLOR }

    val sumPerimetersOfBlackFig = listOfBlackFigures.sumOf { it.calculatePerimeter() }
    val sumAreasOfWhiteFig = listOfWhiteFigures.sumOf { it.calculateArea() }

    println(String.format("%.2f", sumPerimetersOfBlackFig))
    println(String.format("%.2f", sumAreasOfWhiteFig))

}

const val WHITE_COLOR = "White"
const val BLACK_COLOR = "Black"