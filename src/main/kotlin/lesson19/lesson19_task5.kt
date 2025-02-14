package org.example.lesson19

const val MALE_INPUT = "Муж"
const val FEMALE_INPUT = "Жен"

enum class Sex {
    MALE,
    FEMALE,
}

class Human(
    val name: String,
    val sex: String,
)

fun main() {
    val listOfUsers = mutableListOf<Human>()
    var user: Human
    var name: String
    var sex: String
    do {
        println("Введите имя человека.")
        name = readln()
        do {
            println("Введите пол человека в формате Муж/Жен:")
            sex = readln()
        } while (!sex.equals(MALE_INPUT, ignoreCase = true) && !sex.equals(FEMALE_INPUT, ignoreCase = true))

        sex = when {
            sex.equals(MALE_INPUT, ignoreCase = true) -> Sex.MALE.name
            else -> Sex.FEMALE.name
        }
        user = Human(name, sex)
        listOfUsers.add(user)
    } while (listOfUsers.size < 5)

    listOfUsers.forEach { (println("Пользователь ${it.name} , Пол:${it.sex}")) }
}