package org.example.lesson16

class Cube(
    private val edgeOfCube: Int = (1..6).random(),
) {
    fun getValueOfEdge() {
        println("Число на кубике $edgeOfCube")
    }
}

fun main() {
    val redCube = Cube()

    redCube.getValueOfEdge()
}