package org.example.lesson11

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val eMail: String,
    var bio: String = "",
) {
    fun printUserInfo() = println("$id,$login,$password,$eMail,$bio")

    fun changeBio() {
        println("Введите свою группу крови: ")
        bio = readln()
    }

    fun changePassword() {
        print("Введите текущий пароль: ")
        val currentPass = readln()
        if (currentPass == password) {
            print("Введите новый пароль: ")
            password = readln()
            println("Пароль изменён.")
        } else println("Неверный пароль.")
    }

}

fun main() {

    val user1 = User2(1, "Ivan", "Kashin", "ivankashin110491@gmail.com")

    user1.changeBio()
    user1.changePassword()
    user1.printUserInfo()

}