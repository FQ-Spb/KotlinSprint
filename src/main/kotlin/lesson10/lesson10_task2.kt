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
    val minPassLength = 4
    val minLogLength = 4
    if (login.length < minLogLength || password.length < minPassLength) return false
    else return true
}