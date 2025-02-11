package org.example.lesson17

class Ship(
    private val _name: String = "Пётр Великий",
    val averageSpeed: Double = 15.3,
    val portOfRegistry: String = "Североморск",
) {
    var name = _name
        set(value) {
            println("Вы не можете изменить имя корабля.")
        }
}

fun main() {
    val ship = Ship()

    ship.name = "Адмирал Кузнецов"
    println(ship.name)
}