package org.example.lesson19

enum class Ammunition(val damageAmount: Int) {
    BLUE(5),
    GREEN(10),
    RED(20),
}

class Tank(
    private var typeOfAmmunition: Ammunition? = null,
) {
    fun charge(type: Ammunition) {
        typeOfAmmunition = type
        println("${typeOfAmmunition?.name} ammo loaded.")
    }

    fun shoot() =
        println("Tank fired a ${typeOfAmmunition?.name} shell. Enemy damage: ${typeOfAmmunition?.damageAmount}")
}

fun main() {
    val t34 = Tank()

    t34.charge(Ammunition.BLUE)
    t34.shoot()
    t34.charge(Ammunition.RED)
    t34.shoot()
    t34.charge(Ammunition.GREEN)
    t34.shoot()
}