package org.example.lesson20

class Gamer(
    val name: String,
    val maxHealth: Int = 10,
    var currentHealth: Int,
)

fun main() {
    val gamer1 = Gamer("Олег", currentHealth = 2)
    val healingPotion = { it: Gamer ->
        it.currentHealth = it.maxHealth
        println("Здоровье восстановлено текущее значение ${it.currentHealth}")
    }

    healingPotion(gamer1)
}