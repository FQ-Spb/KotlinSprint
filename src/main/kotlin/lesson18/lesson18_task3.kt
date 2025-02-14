package org.example.lesson18

abstract class Animal(
    private val name: String,
    private val favoriteFood: String,
) {
    fun eat(): String = "$name -> eats $favoriteFood "
}

class Fox(
    name: String,
    favoriteFood: String = "berries",
) : Animal(name, favoriteFood)

class Dog(
    name: String,
    favoriteFood: String = "bones",
) : Animal(name, favoriteFood)

class Cat(
    name: String,
    favoriteFood: String = "fish",
) : Animal(name, favoriteFood)

fun main() {

    val dog: Animal = Dog("Sharick")
    val fox: Animal = Fox("Alice")
    val cat: Animal = Cat("Basilio")
    val listOfAnimals = arrayOf<Animal>(dog, cat, fox)

    listOfAnimals.forEach { println(it.eat()) }
}