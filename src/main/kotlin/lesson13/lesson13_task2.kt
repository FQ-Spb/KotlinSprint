package org.example.lesson13

class UserData1(
    val userName: String,
    val phoneNumber: Long,
    val company: String?,
) {
    fun printUserData() {
        println("- $userName\n- $phoneNumber\n- ${company ?: "Не указано"}")
    }
}

fun main() {
    val user1 = UserData1("John", 89215803900, null)

    user1.printUserData()
}