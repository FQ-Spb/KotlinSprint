package org.example.lesson11

const val STATUS_TALKING = "разговаривает"
const val STATUS_MIC_OFF = "микрофон выключен"
const val STATUS_USER_MUTED = "пользователь заглушен"

class ParticipantData(
    val nickname: String,
    val avatarUrl: String,
    var status: String = STATUS_USER_MUTED,
)

class Room(
    val coverUrl: String,
    val title: String,
    val participant: MutableList<ParticipantData> = mutableListOf(),
) {

    fun addMember(newMember: ParticipantData) {
        participant.add(newMember)
    }

    fun changeStatus(member: String, status: String) {
        val newStatusOfUser = participant.find { it.nickname == member }
        newStatusOfUser?.status = status
    }
}

fun main() {

    val room1 = Room("https://i.pinimg.com/originals/7e/1b/fd/7e1bfd1191112533fe9872ef47398823.jpg", title = "Болталка")
    val user1 = ParticipantData("Pinky", "URL of Pinky avatar")

    room1.addMember(user1)
    room1.participant.forEach { it -> (println("${it.nickname} - ${it.status}")) }
    println()
    room1.changeStatus("Pinky", STATUS_TALKING)
    room1.participant.forEach { it -> (println("${it.nickname} - ${it.status}")) }
}