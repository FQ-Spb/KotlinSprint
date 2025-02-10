package org.example.lesson16

class User(
    val login: String = "Ivan",
    private val password: String = "password123",
) {
    fun checkPassword(passwordForChecking: String): Boolean {
        return passwordForChecking == password
    }
}

fun main() {
    val user1 = User()

    print("Введите пароль: ")
    println(user1.checkPassword(readln()))
}