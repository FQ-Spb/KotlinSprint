package org.example.lesson_5

fun main() {

    print("Введите длину пути в километрах: ")
    val pathLength = readln().toFloat()
    print("Введите расход топлива вашего автомобиля на 100 км:")
    val fuelConsumption = readln().toFloat()
    print("Введите стоимость литра топлива:")
    val fuelCost = readln().toFloat()
    val fuelForTrip = pathLength * fuelConsumption / CONSTANT_DIVISOR
    val tripCost = fuelForTrip * fuelCost

    println("Общий расход топлива на $pathLength км " +
            "${String.format("%.2f", fuelForTrip)}л, стоимостью ${String.format("%.2f", tripCost)} рублей.")


}

const val CONSTANT_DIVISOR = 100