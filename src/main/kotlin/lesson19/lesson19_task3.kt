package org.example.lesson19

class SpaceShip {
    fun takeOff() {
        TODO()
    }

    fun land() {
        TODO("It's necessary to prescribe the logic of operation.")
    }

    fun fire() {
        println("The guns have been put in combat alert.")
    }
}

fun main() {
    val spaceShip = SpaceShip()

    spaceShip.fire()
    spaceShip.takeOff()
}