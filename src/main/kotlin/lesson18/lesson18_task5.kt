package org.example.lesson18

class Screen {

    fun draw(shape: String, omX: Int, omY: Int, radius: Int) {
        println("The $shape with radius $radius was drawn with the coordinates of the center ($omX;$omY)")
    }

    fun draw(shape: String, omX: Float, omY: Float, radius: Float) {
        println("The $shape with radius $radius was drawn with the coordinates of the center ($omX;$omY)")
    }

    fun draw(shape: String, omX: Int, omY: Int, lengthOfSide: Float) {
        println("The $shape with length of side $lengthOfSide was drawn from point with the coordinates ($omX;$omY)")
    }

    fun draw(shape: String, omX: Float, omY: Float, lengthOfSide: Int) {
        println("The $shape with length of side $lengthOfSide was drawn from point with the coordinates ($omX;$omY)")
    }

    fun draw(omX: Int, omY: Int) {
        println("A point with coordinates ($omX;$omY) is drawn.")
    }

    fun draw(omX: Float, omY: Float) {
        println("A point with coordinates ($omX;$omY) is drawn.")
    }
}

fun main() {
    val figure1 = Screen()

    figure1.draw("Circle", 15, 20, 10)
    figure1.draw("Circle", 15.3f, 20.3f, 10f)
    println()
    figure1.draw("Square", 30, 35, 10f)
    figure1.draw("Square", 30f, 35f, 10)
    println()
    figure1.draw(18, 19)
    figure1.draw(18f, 19f)
}









