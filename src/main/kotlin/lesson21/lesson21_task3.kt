package org.example.lesson21

class Player2(
    val name: String,
    val maxHealth: Int = 10,
    val currentHealth: Int = 10,
)

fun main() {
    val player = Player2("Smith")

    println(player.isHealthy())
}

fun Player2.isHealthy(): Boolean {
    return this.maxHealth == this.currentHealth
}