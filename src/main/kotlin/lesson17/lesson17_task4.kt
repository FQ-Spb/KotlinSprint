package org.example.lesson17

import kotlin.random.Random

class Package(
    val idNumber: Int = Random.nextInt(),
    private var _currentLocation: String,
    var relocationCounter: Int = 0,
) {
    var currentLocation
        get() = _currentLocation
        set(value) {
            if (value != _currentLocation) {
                _currentLocation = value
                relocationCounter++
            } else println("Местоположение не изменилось.Счётчик перемещений не задействован.")
        }
}

fun main() {
    val cup = Package(_currentLocation = "Saint-Petersburg")

    cup.currentLocation = "Saint-Petersburg"
    println("${cup.currentLocation}\nЗначение счётчика: ${cup.relocationCounter}")
    println()
    cup.currentLocation = "Moscow"
    println("${cup.currentLocation}\nЗначение счётчика: ${cup.relocationCounter}")
}