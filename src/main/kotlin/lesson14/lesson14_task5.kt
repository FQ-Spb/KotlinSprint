package org.example.lesson14

class Chat(
    private val listOfMessage: MutableList<Message> = mutableListOf(),

    ) {

    fun addMessage(author: String, text: String) {
        val nextId: Int = listOfMessage.size
        listOfMessage.add(Message(id = nextId, author, text))
    }


    fun addThreadMessage(parentMessageId: Int, author: String, text: String) {
        val nextId: Int = listOfMessage.size
        if (listOfMessage.any { it.id == parentMessageId }) {
            listOfMessage.add(ChildMessage(nextId, parentMessageId, author, text))
        } else {
            println("Parent message with id $parentMessageId not found.")
        }
    }


    fun printChat() {
        val groupedMessages = listOfMessage.groupBy {
            if (it is ChildMessage) it.parentMessageId
            else it.id
        }

        groupedMessages.forEach { (_, messageList) ->
            messageList.forEach { message ->
                val tab = if (message is ChildMessage) "\t" else ""
                println("$tab${message.id}. ${message.author}: ${message.text}")
            }
        }

    }
}


open class Message(
    val id: Int,
    val author: String,
    val text: String,
)

class ChildMessage(
    id: Int,
    val parentMessageId: Int,
    author: String,
    text: String,
) : Message(id = id, author = author, text = text)

fun main() {

    val friends = Chat()


    friends.addMessage("Виктор", "Чё как в выходные шашлычим?!")
    friends.addMessage("Саня", "Само собой!")
    friends.addMessage("Аня", "Я в субботу не могу.")
    friends.addThreadMessage(0, "Иван", "Конечно,во сколько собираемся?!")
    friends.addThreadMessage(0, "Виктор", "Давайте часам к трём подваливайте.")
    friends.addThreadMessage(4, "Саня", "Отказы не принимаются!")

    friends.printChat()
}