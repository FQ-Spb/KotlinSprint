package org.example.lesson8

fun main() {

    val compositionOfOlivie = arrayOf("Картофель", "Колбаса", "Яйца", "Морковь", "Горошек", "Соль", "Майонез", "Лук")

    for (component in compositionOfOlivie) print("$component ")
    println()

    print("Какой ингредиент вы хотели бы заменить?")
    val userChanges = readln()

    when (userChanges in compositionOfOlivie) {
        true -> {
            println("На что хотите заменить?")
            compositionOfOlivie[compositionOfOlivie.indexOf(userChanges)] =
                readln()
            println("Готово! Вы сохранили следующий список: ")
            for (component in compositionOfOlivie) print("$component ")
            return
        }

        else -> println("Такого ингредиента нет в списке.")
    }
}