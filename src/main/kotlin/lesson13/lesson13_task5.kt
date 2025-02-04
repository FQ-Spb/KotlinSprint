package org.example.lesson13

class UserData4(
    val userName: String,
    val phoneNumber: Long,
    val company: String?,
)

fun main() {

    print("Введите имя: ")
    val name = readln()

    try {
        print("Введите телефон: ")
        val phoneNumber = readln().toLong()
    } catch (e: NumberFormatException) {
        println("Произошла ошибка преобразования в число ${e.message}. ")
    }

    print("Введите компанию: ")
    val company = readln()

}