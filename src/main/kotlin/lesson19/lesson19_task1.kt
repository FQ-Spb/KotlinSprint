package org.example.lesson19


fun main() {

    println(
        "Вы можете добавить в свой аквариум одну или несколько из следующих рыб: \n" +
                Fish.entries.joinToString(", ")
    )
}

enum class Fish {
    GUPPY,
    ANGELFISH,
    SIAMESE_FIGHTING_FISH,
    GOLDFISH,
}