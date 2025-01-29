package org.example.lesson10

import org.example.lesson9.AGREE

fun main() {

    do {
        round()
        println("Хотите сыграть ещё? Введите Да/Нет")
        val answer = readln()
    } while (answer.equals(AGREE))
}

fun round() {
    val throwOfComp = getNumber()
    val throwOfUser = getNumber()
    print("Ход компьютера: ")
    println(throwOfComp)
    print("Ваш ход, нажмите\"ENTER\":")
    readln()
    println(throwOfUser)
    println(whoWin(throwOfComp, throwOfUser))
}

fun getNumber() = (1..6).random()

fun whoWin(compNumber: Int, userNumber: Int): String {
    val result = when {
        compNumber > userNumber -> "Выиграл Компьютер."
        compNumber < userNumber -> "Вы выиграли!"
        else -> "Ничья."
    }
    return result
}