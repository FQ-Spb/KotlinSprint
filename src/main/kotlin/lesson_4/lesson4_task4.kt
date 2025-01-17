package org.example.lesson_4

fun main() {
    val dayNumber = 2

    println(
        """
        Упражнения для рук:${dayNumber % 2 != 0}
        Упражнения для ног:${dayNumber % 2 == 0}
        Упражнения для спины:${dayNumber % 2 == 0}
        Упражнения для пресса:${dayNumber % 2 != 0}
    """.trimIndent()
    )

}