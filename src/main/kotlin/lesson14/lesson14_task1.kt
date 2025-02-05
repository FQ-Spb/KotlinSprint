package org.example.lesson14

open class Liner(
    val speed: Int,
    val passengerCapacity: Int,
    val loadCapacity: Int,
    val breaksAnIce: Boolean = false,
)

class Cargo(
    speed: Int,
    passengerCapacity: Int,
    loadCapacity: Int,
) : Liner(speed, passengerCapacity, loadCapacity)


class Icebreaker(
    speed: Int,
    passengerCapacity: Int,
    loadCapacity: Int,
) : Liner(speed, passengerCapacity, loadCapacity, breaksAnIce = true)

fun main() {

    val liner1 = Liner(25, 2000, 200000)
    val cargo1 = Cargo(15, 40, 240000)
    val icebreaker = Icebreaker(7, 53, 500)
}