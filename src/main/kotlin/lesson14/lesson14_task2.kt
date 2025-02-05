package org.example.lesson14

open class Liner2(
    val name: String,
    val speed: Int,
    val passengerCapacity: Int,
    val loadCapacity: Int,
    val breaksAnIce: Boolean = false,
) {
    open fun runLoadingProcess() {
        println("Горизонтальный трап выдвинут.")
    }

    init {
        println(
            "$name: \n Крейсерская скорость - $speed\nВместимость пассажиров - $passengerCapacity\n" +
                    "Грузоподъёмность - $loadCapacity\n Может плыть через льды - $breaksAnIce "
        )
        println()
    }
}

class Cargo2(
    name: String,
    speed: Int,
    passengerCapacity: Int,
    loadCapacity: Int,
) : Liner2(name, speed, passengerCapacity, loadCapacity) {
    override fun runLoadingProcess() {
        println("Грузовой кран активирован.")
    }
}

class Icebreaker2(
    name: String,
    speed: Int,
    passengerCapacity: Int,
    loadCapacity: Int,
) : Liner2(name, speed, passengerCapacity, loadCapacity, breaksAnIce = true) {
    override fun runLoadingProcess() {
        println("Кормовые створки открыты.")
    }
}

fun main() {

    val liner1 = Liner2("Sea Soul", 25, 2000, 200000)
    val cargo1 = Cargo2("Ever Green", 15, 40, 240000)
    val icebreaker = Icebreaker2("Arctic", 7, 53, 500)
}