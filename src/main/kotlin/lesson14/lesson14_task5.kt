package org.example.lesson14

import java.util.UUID

class Chat(
    private val message: MutableList<Message> = mutableListOf(),
) {

    fun addMessage(author: String, text: String) {
        message.add(Message(author = author, text = text))
    }

    fun addThreadMessage(parentMessageId: String, author: String, text: String) {
        message.add(ChildMessage(parentMessageId = parentMessageId, author = author, text = text))
    }

    fun printChat() {
        val groupedMessage = message.groupBy {
            when (it) {
                is ChildMessage -> it.parentMessageId
                else -> it.messageId
            }
        }
    }
}


open class Message(
    val messageId:String = UUID.randomUUID().toString(),
    val author: String,
    val text: String,
) {

}

class ChildMessage(
    val parentMessageId: String,
    author: String,
    text: String,
) : Message(author = author, text = text) {

}

fun main() {


}