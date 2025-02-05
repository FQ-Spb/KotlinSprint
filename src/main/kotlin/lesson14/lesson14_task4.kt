package org.example.lesson14

abstract class CelestialBody(
    val name: String,
    val isThereAtmosphere: Boolean,
    val isSuitableForLanding: Boolean,
)

class Planet(
    name: String,
    isThereAtmosphere: Boolean,
    isSuitableForLanding: Boolean,
    val listOfSatellite: List<Satellite>,
    val isThereWater: Boolean = false,
) : CelestialBody(name, isThereAtmosphere, isSuitableForLanding)

class Satellite(
    name: String,
    isThereAtmosphere: Boolean = false,
    isSuitableForLanding: Boolean = false,
    val consistOf: String,
) : CelestialBody(name, isThereAtmosphere, isSuitableForLanding)

fun main() {

    val planet1 = Planet(
        "Марс",
        false,
        true,
        listOf(Satellite("Фобос", consistOf = "камень"), Satellite("Деймос", consistOf = "камень")),
        isThereWater = true
    )

    print(" Планета ${planet1.name} обладает спутниками:")
    planet1.listOfSatellite.forEach { print("${it.name} ") }
}