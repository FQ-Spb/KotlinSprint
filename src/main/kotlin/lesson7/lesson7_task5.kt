package org.example.lesson7

fun main() {

    val listOfSymbols = listOf((1..9).random(), ('a'..'z').random(), ('A'..'Z').random())
    var password = charArrayOf()
    var passwordLength: Int
    val setOfSymbols = (1..9) + ('a'..'z') + ('A'..'Z')

    do {
        print("Введите требуемое количество символов в пароле, но не меньше 6: ")
        passwordLength = readln().toInt()
    } while (passwordLength < 6)

    for (i in listOfSymbols) password.add(i)

    while (password.size < passwordLength) password.add(setOfSymbols.random())



}