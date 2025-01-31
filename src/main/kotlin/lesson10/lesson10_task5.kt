package org.example.lesson10


const val CORRECT_LOGIN = "Ivan"
const val CORRECT_PASSWORD = "Kashin"
const val TOKEN_LENGTH = 32
fun main() {

    print("Ведите свой Логин: ")
    val inputLogin = readln()
    print("Введите свой пароль: ")
    val inputPassword = readln()
    when (authorize(inputLogin, inputPassword)) {
        null -> {
            println("Ошибка авторизации.")
            return
        }

        else -> println("Успешная авторизация")
    }
    println(verifyToken(generateToken()))

}

fun generateToken(): String {
    val stringToken: String
    val setOfSymbols = ('1'..'9') + ('a'..'z') + ('A'..'Z')
    val token = Array<Char?>(32) { null }
    for (element in token.indices) {
        token[element] = setOfSymbols.random()
    }
    token.shuffle()
    stringToken = token.joinToString("")
    return stringToken
}

fun authorize(login: String, password: String): Int? {

    if (login != CORRECT_LOGIN || password != CORRECT_PASSWORD) return null

    return 0
}

fun verifyToken(token: String): String {
    return if (token.length == TOKEN_LENGTH) getShopBasket().joinToString(", ")
    else "Invalid token"
}

fun getShopBasket(): List<String> =
    mutableListOf("Ёршик для пупка", "Тапочки для таракана", "Картонный сейф", "Бумажный аквариум")
