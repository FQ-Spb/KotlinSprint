package org.example.lesson8

fun main() {

    val compositionOfOlivie = arrayOf("Картофель", "Колбаса", "Яйца", "Морковь", "Горошек", "Соль", "Майонез", "Лук")

    for (component in compositionOfOlivie) print("$component ")
    println()

    do {
        print("Какой ингредиент вы хотели бы заменить?")
        val userChanges = readln()

        when (compositionOfOlivie.find { it == userChanges }) {
            userChanges -> {
                println("На что хотите заменить?")
                compositionOfOlivie[compositionOfOlivie.indexOf(compositionOfOlivie.find { it == userChanges })] =
                    readln()
                println("Готово! Вы сохранили следующий список: ")
                for (component in compositionOfOlivie) print("$component ")
                return
            }

            else -> println("Такого ингредиента нет в списке.")
        }
    } while (compositionOfOlivie.find { it == userChanges } == null)

}