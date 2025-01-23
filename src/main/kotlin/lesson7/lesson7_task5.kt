package org.example.lesson7

fun main() {

    val setSymbols = listOf((1..9).random(), ('a'..'z').random(), ('A'..'Z').random())
    var password = ""

    print("Введите требуемое количество символов в пароле: ")
    val passwordLength = readln().toInt()

    while (password.length < passwordLength) {
        password += setSymbols[(0..2).random()]
    }
    println(password)
}