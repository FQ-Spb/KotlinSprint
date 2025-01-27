package org.example.lesson_5

fun main() {

    print("Введите длину пути в километрах: ")

    val pathLength = readln().toFloat()
    print("Введите расход топлива вашего автомобиля на 100 км:")

    val fuelConsumption = readln().toFloat()
    print("Введите стоимость литра топлива:")

    val fuelCost = readln().toFloat()
    val fuelForTrip = pathLength * fuelConsumption / CONSTANT_DIV
    val tripCost = fuelForTrip * fuelCost

    println(
        String.format(
            "Общий расход топлива на $pathLength км %.2f л, стоимостью %.2f рублей.",
            fuelForTrip,
            tripCost
        )
    )
}

const val CONSTANT_DIV = 100