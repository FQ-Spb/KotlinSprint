package org.example.lesson7



fun main() {

    do {
        val authCode = (1000..9999).random()
        println("Ваш код авторизиции $authCode")
        print("Введите ваш код авторизации: ")
        val userAuthCode = readln().toInt()
    } while (userAuthCode != authCode)

    println("Добро пожаловать!")

}