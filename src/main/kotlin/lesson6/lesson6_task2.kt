package org.example.lesson6

fun main() {

    var secondsCounter = 0

    print("Сколько секунд нужно засечь?")
    var numberOfEnteredSec = readln().toInt()

    do {
        println("${numberOfEnteredSec--}")
        secondsCounter++
        Thread.sleep(1000)
    } while (numberOfEnteredSec > 0)
    println("Прошло $secondsCounter секунд.")
    while (numberOfEnteredSec == 0) Thread.sleep(1000)
}