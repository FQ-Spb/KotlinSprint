package org.example.lesson7



fun main() {

    val numberRange = 1..9
    val charRange = 'a'..'z'
    var password = ""

    while (password.length < PASSWORD_LENGTH) {
        password += charRange.random()
        password += numberRange.random()
    }
    println(password)
}
const val PASSWORD_LENGTH = 6