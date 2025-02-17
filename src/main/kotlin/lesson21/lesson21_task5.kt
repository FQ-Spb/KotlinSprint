package org.example.lesson21

class Character2(
    val name: String,
    val listOfSkills: Map<String, Int> = mapOf(
        "Бег" to 2,
        "Задержка дыхания" to 3,
        "Метание" to 3,
    ),
)

fun main() {
    val character = Character2("Крош")

    println(character.listOfSkills.maxCategory())
}

fun Map<String, Int>.maxCategory(): String {
    return this.maxBy { it.value }.key
}