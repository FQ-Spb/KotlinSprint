package org.example.lesson22


data class Person(
    val name: String,
    val age: Int,
    val weight: Int,
)

fun main() {
    val person = Person("Ivan", 33, 80)
    val (name, age, weight) = person

    println("Name: $name")
    println("Age: $age")
    println("Weigth: $weight")
}