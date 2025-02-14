package org.example.lesson20

class Player(
    val name: String,
    var isHaveKey: Boolean = false,
)

fun main() {

    val gamer1 = Player("Oleg")
    val key = { it: Player -> it.isHaveKey = true }
    val door = { it: Player ->
        when {
            it.isHaveKey -> println("The door is OPEN")
            else -> println("The door is CLOSE")
        }
    }

    door(gamer1)
    println()
    key(gamer1)
    door(gamer1)
}