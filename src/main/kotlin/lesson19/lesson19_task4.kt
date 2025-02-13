package org.example.lesson19

enum class Ammunition(val damageAmount: Int) {
    BLUE(5),
    GREEN(10),
    RED(20),
}

class Tank(
    private var typeOfAmmunition: Ammunition? = null,
) {
    fun charge(id: Int) {
        typeOfAmmunition = Ammunition.entries[id]
        println("$typeOfAmmunition ammo loaded.")
    }

    fun shoot() = println("Tank fired a ${typeOfAmmunition?.name} shell. Enemy damage: ${typeOfAmmunition?.damageAmount}")
}

fun main() {
    val t34 = Tank()

    t34.charge(0)
    t34.shoot()
    t34.charge(1)
    t34.shoot()
    t34.charge(2)
    t34.shoot()
}