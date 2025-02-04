package org.example.lesson13

class UserData(
    val userName: String,
    val phoneNumber: Long,
    val company: String?,
)

fun main() {
    val user1 = UserData("John", 89215803900, null)
}