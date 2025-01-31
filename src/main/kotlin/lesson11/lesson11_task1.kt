package org.example.lesson11


class User(
    val id: Int,
    val login: String,
    val password: String,
    val eMail: String,
)

fun main() {
    val user1 = User(1, "Ivan", "Kashin", "ivankashin110491@gmail.com")
    val user2 = User(2, "Vasya", "Pupkin", "smthtxt@mail.ru")

    println("${user1.id}, ${user1.login}, ${user1.password}, ${user1.eMail}")
    println()
    println("${user2.id}, ${user2.login}, ${user2.password}, ${user2.eMail}")
}