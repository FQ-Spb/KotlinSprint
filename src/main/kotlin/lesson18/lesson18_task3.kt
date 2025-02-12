package org.example.lesson18

open class Animal {
    open fun eat(): String = ""
    open fun getNickname() = ""
}

class Fox(
    private val name: String,
) : Animal() {
    override fun eat() = "Eats berries. "
    override fun getNickname() = name
}

class Dog(
    private val name: String,
) : Animal() {
    override fun eat(): String = "Eats bones."
    override fun getNickname() = name
}

class Cat(
    private val name: String,
) : Animal() {
    override fun eat() = "Eats fish."
    override fun getNickname() = name
}

fun main() {

    val dog: Animal = Dog("Sharick")
    val fox: Animal = Fox("Alice")
    val cat: Animal = Cat("Basilio")
    val listOfAnimals = arrayOf<Animal>(dog, cat, fox)

    listOfAnimals.forEach { println("${it.getNickname()} -> ${it.eat()}") }
}