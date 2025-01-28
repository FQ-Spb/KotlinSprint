package org.example.lesson10

fun main() {

    val numberOfComputer = getNumber()
    val numberOfUser = getNumber()

    println("Ход компьютера: \n$numberOfComputer")
    println("Ваш ход. Для броска нажмите \"ENTER\":")
    readln()
    println(numberOfUser)

    when {
        numberOfUser > numberOfComputer -> println("Победило человечество")
        numberOfUser < numberOfComputer -> println("Победила машина")
        else -> println("Победила дружба")
    }
}

fun getNumber(): Int = (1..6).random()