package org.example.lesson6

fun main() {

    print("Сколько секунд нужно засечь?")
    var numberOfEnteredSec = readln().toInt()

    while (numberOfEnteredSec > 0) {
        println("Осталось секунд: ${numberOfEnteredSec--}")
        Thread.sleep(1000)
    }
    println("Время вышло.")
}