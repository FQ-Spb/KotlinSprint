package org.example.lesson6

fun main() {

    println("Придумайте Логин:")
    val newLogin = readln()
    println("Введите новый пароль:")
    val newPassword = readln()

    do {
        println("Введите ваш Логин:")
        val userLogin = readln()
        println("Введите ваш пароль:")
        val userPassword = readln()
    } while (userLogin != newLogin || userPassword != newPassword)
    println("Авторизация прошла успешно!")

}

