package org.example.lesson18

open class Dice1(
    val numberOfEdge: Int,
) {
    open fun throwDice() = ""
}

class TetrahedralDice(
    numberOfEdge: Int = 4,
    private val cameUpNumber:Int = (1..4).random()
) : Dice1(numberOfEdge) {
    override fun throwDice(): String = "Came up number: $cameUpNumber"
}

class HexagonalDice(
    numberOfEdge: Int = 6,
    private val cameUpNumber:Int = (1..6).random(),
) : Dice1(numberOfEdge) {
    override fun throwDice():String = "Came up number: $cameUpNumber"
}

class OctahedralDice(
    numberOfEdge: Int = 8,
    private val cameUpNumber:Int = (1..8).random(),
) : Dice1(numberOfEdge) {
    override fun throwDice():String = "Came up number: $cameUpNumber"
}

fun main() {
    val dice = Dice1(4)

}