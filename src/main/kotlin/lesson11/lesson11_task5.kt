package org.example.lesson11

class MemberOfForum(
    val userId: Int,
    val userName: String,
)

class ForumMessage(
    val authorId: Int,
    val message: String,
)

class Forum(
    private val users: MutableList<MemberOfForum> = mutableListOf(),
    private val messages: MutableList<ForumMessage> = mutableListOf(),
    private var nextUserId: Int = 1,
) {

    fun createNewUser(userName: String): MemberOfForum {
        val newUserOfForum = MemberOfForum(nextUserId, userName)
        users.add(newUserOfForum)
        nextUserId++

        return newUserOfForum
    }

    fun createNewMessage(authorId: Int, message: String): ForumMessage? {
        when (users.find { it.userId == authorId }) {
            null -> {
                println("Для отправки сообщений зарегистрируйтесь.")
                return null
            }

            else -> {
                val newMessage = ForumMessage(authorId, message)
                messages.add(newMessage)
                return newMessage
            }
        }
    }

    fun printTread() {
        messages.forEach { message ->
            val author = users.find { it.userId == message.authorId }?.userName ?: "Unknown"
            println("$author: ${message.message}")
        }
    }
}

fun main() {

    val forum1 = Forum()
    val user1 = forum1.createNewUser("Ivan")
    val user2 = forum1.createNewUser("Alla")

    forum1.createNewMessage(user1.userId, "Привет,как дела?!")
    forum1.createNewMessage(user2.userId, "Привет, отлично! Как отработал?")
    forum1.createNewMessage(user1.userId, "Всё тип-топ!Гулять пойдём?")
    forum1.createNewMessage(user2.userId, "Конечно!")

    forum1.printTread()
}