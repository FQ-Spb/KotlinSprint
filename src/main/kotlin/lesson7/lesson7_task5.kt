package org.example.lesson7

fun main() {

    val rangeOfNumbers = ('1'..'9')
    val rangeOfLowercase = ('a'..'z')
    val rangeOfUppercase = ('A'..'Z')
    val password = mutableListOf<Char>()
    var passwordLength: Int
    val setOfSymbols = rangeOfNumbers + rangeOfLowercase + rangeOfUppercase
    var result = ""

    do {
        print("Введите требуемое количество символов в пароле, но не меньше 6: ")
        passwordLength = readln().toInt()
    } while (passwordLength < 6)

    password.add(rangeOfNumbers.random())
    password.add(rangeOfUppercase.random())
    password.add(rangeOfLowercase.random())

    while (password.size < passwordLength) password.add(setOfSymbols.random())
    password.shuffle()

    for (i in password) result += i
    println(result)
}