package org.example.lesson18

abstract class Dice1(
    private val numberOfEdge: Int,
) {
    fun throwDice() = (1..numberOfEdge).random()
}

class TetrahedralDice(
    numberOfEdge: Int = 4,
) : Dice1(numberOfEdge)

class HexagonalDice(
    numberOfEdge: Int = 6,
) : Dice1(numberOfEdge)

class OctahedralDice(
    numberOfEdge: Int = 8,
) : Dice1(numberOfEdge)

fun main() {
    val dice: Dice1 = TetrahedralDice()
    val dice2: Dice1 = HexagonalDice()
    val dice3: Dice1 = OctahedralDice()
    val kitOfDices = arrayOf<Dice1>(dice, dice2, dice3)

    kitOfDices.forEach { println(it.throwDice()) }

}