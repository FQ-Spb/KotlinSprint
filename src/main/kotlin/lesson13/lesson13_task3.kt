package org.example.lesson13

class UserData2(
    val userName: String,
    val phoneNumber: Long,
    val company: String?,
)

fun main() {

    val listOfUsers = mutableListOf(
        UserData2("Ivan", 6813518, "Tesla"),
        UserData2("Peter", 6843584, null),
        UserData2("Mary", 687684486, "null"),
        UserData2("Helen", 68446818, null),
        UserData2("Alex", 684468486, "GazProm")
    )

    listOfUsers.forEach { if (it.company != null) println(it.company) }
}