package org.example.lesson10

import org.example.lesson9.AGREE

fun main() {
    var throwOfComp: Int
    var throwOfUser: Int
    var whoWin: String
    var result = 0
    var answer: String
    do {
        throwOfComp = getNumber()
        throwOfUser = getNumber()

        playRound(throwOfComp, throwOfUser)

        whoWin = when {
            throwOfComp > throwOfUser -> "Выиграл Компьютер."
            throwOfComp < throwOfUser -> "Вы выиграли!"
            else -> "Ничья."
        }
        if (whoWin == "Вы выиграли!") result++

        println(whoWin)
        println("Хотите сыграть ещё? Введите Да/Нет")
        answer = readln()
    } while (answer.equals(AGREE, ignoreCase = true))

    println("Хорошо. Вы выиграли $result партий.")
}

fun playRound(throwOfComp: Int, throwOfUser: Int) {
    print("Ход компьютера: ")
    println(throwOfComp)
    print("Ваш ход, нажмите\"ENTER\":")
    readln()
    println(throwOfUser)
}

fun getNumber() = (1..6).random()
