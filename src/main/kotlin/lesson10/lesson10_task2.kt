package org.example.lesson10

fun main() {

    println("Enter your login: ")
    val userLogin = readln()

    println("Enter your password: ")
    val userPassword = readln()

    if (checkLength(userLogin, userPassword)) println("Welcome!")
    else println("Length of Login or Password is not enough.")
}

fun checkLength(login: String, password: String): Boolean {
    if (login.length < 4 || password.length < 4) return false
    else return true
}