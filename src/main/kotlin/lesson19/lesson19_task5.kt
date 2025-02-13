package org.example.lesson19

const val MALE_GENDER = "Муж"
const val FEMALE_GENDER = "Жен"

enum class Sex {
    MAN,
    WOMAN,
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
        } while (sex.equals(MALE_GENDER, ignoreCase = true) || sex.equals(FEMALE_GENDER, ignoreCase = true))
        when {
            sex.equals(MALE_GENDER, ignoreCase = true) -> sex = Sex.MAN.name
            sex.equals(FEMALE_GENDER, ignoreCase = true) -> sex = Sex.WOMAN.name
        }
        user = Human(name, sex)
        listOfUsers.add(user)
    } while (listOfUsers.size < 5)
    listOfUsers.forEach { (println("Пользователь ${it.name} , Пол:${it.sex}")) }
}