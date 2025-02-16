package org.example.lesson20

fun main() {
    val splashScreen: (String) -> Unit = { username: String -> println("С Наступающим Новыи Годом $username!!") }

    splashScreen("Иван")
}