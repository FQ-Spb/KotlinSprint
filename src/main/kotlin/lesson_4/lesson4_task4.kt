package org.example.lesson_4

fun main() {
    val dayNumber = 2
    val isEven = dayNumber % 2 == 0

    println(
        """
        Упражнения для рук:${!isEven}
        Упражнения для ног:$isEven
        Упражнения для спины:$isEven
        Упражнения для пресса:${!isEven}
    """.trimIndent()
    )

}
