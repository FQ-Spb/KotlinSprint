package org.example.lesson7


fun main() {

    var authCode: Int
    var userAuthCode: Int

    do {
        authCode = (1000..9999).random()
        println("Ваш код авторизиции $authCode")
        print("Введите ваш код авторизации: ")
        userAuthCode = readln().toInt()
    } while (userAuthCode != authCode)

    println("Добро пожаловать!")

}