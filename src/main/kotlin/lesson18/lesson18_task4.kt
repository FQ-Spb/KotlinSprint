package org.example.lesson18

import kotlin.math.pow

const val NUMBER_OF_FACES_OF_CUBE = 6
const val CONSTANT_COEFFICIENT = 2

open class Box {
    open fun calculateSurfaceArea() = 0
}

class RectangularBox(
    private val length: Int,
    private val width: Int,
    private val height: Int,
) : Box() {
    override fun calculateSurfaceArea() =
        CONSTANT_COEFFICIENT * ((length * width) + (length * height) + (height * width))
}

class SquareBox(
    private val lengthOfEdge: Int,
) : Box() {
    override fun calculateSurfaceArea() = (lengthOfEdge.toDouble().pow(2) * NUMBER_OF_FACES_OF_CUBE).toInt()
}

fun main() {

    val box1: Box = RectangularBox(1, 2, 3)
    val box2: Box = SquareBox(4)

    println(
        "Площадь поверхности прямоугольной коробки - ${box1.calculateSurfaceArea()}\n" +
                "Площадь поверхности квадратной коробки - ${box2.calculateSurfaceArea()}"
    )
}