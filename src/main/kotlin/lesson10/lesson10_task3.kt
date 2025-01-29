package org.example.lesson10

fun main() {

    print("Введите требуемое количество символов в пароле: ")

    println(passGen(readln().toInt()))
}

fun passGen(length: Int): String {
    val specialSymbols = arrayOf("!", "\"", "#", "$", "%", ".", "&", "'", "(", ")", "*", "+", ",", "-", "/", "\b")
    val numbers = (0..9)
    var password = ""

    do {
        password += numbers.random()
        password += specialSymbols.random()
    } while (password.length < length)

    return password
}