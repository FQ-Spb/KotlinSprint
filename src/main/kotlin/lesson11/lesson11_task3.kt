package org.example.lesson11

const val STATUS_TALKING = "разговаривает"
const val STATUS_MIC_OFF = "микрофон выключен"
const val STATUS_USER_MUTED = "пользователь заглушен"

class Room(
    val coverUrl: String = "https://i.pinimg.com/originals/7e/1b/fd/7e1bfd1191112533fe9872ef47398823.jpg",
    val title: String,
    val memberAndStatus: MutableMap<String, String>,
) {

    fun addMember(newMember: String) {
        memberAndStatus[newMember] = STATUS_USER_MUTED
    }

    fun changeStatus(member: String, status: String) {
        memberAndStatus[member] = status
    }
}

fun main() {
    val room1 = Room(
        title = "Болталка", memberAndStatus = mutableMapOf(
            "URL of Image1" to STATUS_TALKING,
            "URL of Image2" to STATUS_MIC_OFF,
            "URL of Image3" to STATUS_USER_MUTED,
        )
    )
    //Проверка корректности работы методов
    println(room1.memberAndStatus)
    println()

    room1.changeStatus("URL of Image1", STATUS_USER_MUTED)
    println(room1.memberAndStatus)
    println()

    room1.addMember(readln())
    println(room1.memberAndStatus)

}