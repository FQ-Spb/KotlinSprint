package org.example.lesson16

const val FULL_HEALTH = 3

class Character(
    private val name: String,
    private var health: Int = FULL_HEALTH,
    private var impactForce: Int = 10,
) {
    fun takeDamage() {
        health--
        println("Нанесён урон. Текущее здоровье - $health")
    }

    fun cure() {
        if (health > 0) {
            health = FULL_HEALTH
            println("Применено лечение. Текущее здоровье $health")
        } else killCharacter()
    }

    private fun killCharacter() {
        health = 0
        impactForce = 0
        println("Персонаж умер. Лечение недоступно.")
    }
}

fun main() {
    val user1 = Character("Капатыч")

    user1.takeDamage()
    user1.takeDamage()
    user1.cure()
    user1.takeDamage()
    user1.takeDamage()
    user1.takeDamage()
    user1.cure()
}