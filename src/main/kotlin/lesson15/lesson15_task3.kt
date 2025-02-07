package org.example.lesson15

abstract class Users(
    val id: Int,
    val nickname: String,
) {
    abstract fun readPage(): String
    abstract fun writeMessage(): String
}


class SimpleUser(
    id: Int,
    nickname: String,
    val isRegistered: Boolean,
) : Users(id, nickname) {
    override fun readPage(): String {
        return "Страница открыта для просмотра."
    }

    override fun writeMessage(): String {
        return "Оставьте ваш коментарий."
    }
}

class Admin(
    id: Int,
    nickname: String,
    val rank: String,
    val isRegistered: Boolean = true,
) : Users(id, nickname) {

    override fun readPage(): String {
        return "Страница доступна для чтения."
    }

    override fun writeMessage(): String {
        return "Оставьте ваш коментарий."
    }

    fun deleteUser(): String {
        return "Пользователь удалён из списка участников."
    }

    fun deleteMessage(): String {
        return "Вы удали ссобщение пользователя."
    }
}

fun main() {

    val user1 = SimpleUser(1, "Vasya Pupkin", true)
    val user2 = Admin(777, "Your Lord", "General")

    println(user1.writeMessage())
    println(user1.readPage())
    println()
    println(user2.readPage())
    println(user2.writeMessage())
    println(user2.deleteMessage())
    println(user2.deleteUser())
}