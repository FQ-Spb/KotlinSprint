package org.example.lesson10

fun main() {

    print("Введите требуемое количество символов в пароле: ")

    println(generatePassword(readln().toInt()))
}

fun generatePassword(length: Int): String {
    val specialSymbols = arrayOf('!', '"', '#', '$', '%', '.', '&', '\'', '(', ')', '*', '+', ',', '-', '/', ' ')
    val numbers = ('0'..'9')
    val password = CharArray(length)

    for (i in password.indices) {
        if ((i + 1) % 2 == 0) password[i] = specialSymbols.random()
        else password[i] = numbers.random()
    }
    val result = String(password)
    return result
}