package org.example.lesson7

fun main() {

    println("Сколько секунд нужно засечь?")
    val numberOfSeconds = readln().toInt()
    for (second in numberOfSeconds downTo 1) {
        println("Осталось секунд: $second")
        Thread.sleep(1000)
    }
    println("Время вышло.")
}