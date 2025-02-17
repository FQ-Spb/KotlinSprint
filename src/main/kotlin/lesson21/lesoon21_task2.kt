package org.example.lesson21

fun main() {
    val listOfNumber = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

    println(listOfNumber.evenNumberSum())
}

fun List<Int>.evenNumberSum(): Int {
    return this.filter { it % 2 == 0 }.sum()
}