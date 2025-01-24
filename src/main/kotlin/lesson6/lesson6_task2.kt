package org.example.lesson6

fun main() {

    print("Сколько секунд нужно засечь?")
    val numberOfEnteredSec = readln().toLong()

    Thread.sleep(numberOfEnteredSec * 1000)
    println("Прошло $numberOfEnteredSec секунд.")

    while (numberOfEnteredSec >= 0) Thread.sleep(1000)
}