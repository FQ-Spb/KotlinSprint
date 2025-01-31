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
        null -> println("Вы ввели неверный логин или пароль.")
        else -> println(getShopBasket(authorize(inputLogin, inputPassword)).joinToString(",\n"))
    }

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

fun authorize(login: String, password: String): String? {

    if (login != CORRECT_LOGIN || password != CORRECT_PASSWORD) return null

    return generateToken()
}

fun getShopBasket(token: String?): List<String?> {
    val error = listOf(
        "Токен: invalidToken\n" +
                "Ошибка доступа к корзине."
    )
    val shoppingBasket = mutableListOf("Ёршик для пупка", "Тапочки для таракана", "Картонный сейф", "Бумажный аквариум")

    return if (token?.length == TOKEN_LENGTH) shoppingBasket
    else error
}