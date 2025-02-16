package org.example.lesson21

fun main() {

    val testString = "Привет меня зовут Иван."

    println(testString.vowelCount())
}

fun String.vowelCount(): Int {
    val vowels = "аоуыэеёиюяАОУЫЭЕЁИЮЯ"
    return this.count { it in vowels }
}