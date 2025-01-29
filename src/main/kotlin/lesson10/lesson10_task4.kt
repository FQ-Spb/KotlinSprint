package org.example.lesson10

fun main() {

    val throwOfComp = getNumber()
    val throwOfUser = getNumber()
    print("Ход компьютера: ")

    print("Ваш ход, нажмите\"ENTER\":")
    readln()

}

const val REFUSAL = "нет"

fun getNumber() = println((1..6).random())