package org.example.lesson15

interface FindComponent {
    fun checkInDatabase() = println("Идёт поиск комплектующих по базе.")
}

abstract class Product(
    val name: String,
    val remainingStock: Int,
) {}


class MusicalInstrument(
    name: String,
    remainingStock: Int,
    val soundProductionMethod: String,
    val classType: String,
) : Product(name, remainingStock), FindComponent {
    override fun checkInDatabase() {
        super.checkInDatabase()
        println("Искомые комплектующие найдены.")
    }
}


class Component(
    name: String,
    remainingStock: Int,
    val madeIn: String,
    val isOriginal: Boolean,
) : Product(name, remainingStock) {}

fun main() {
    val instrument = MusicalInstrument("Треугольник", 50, "Ударные", "Профессиональный")
    instrument.checkInDatabase()
}