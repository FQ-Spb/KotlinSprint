package org.example.lesson15

interface Movement {
    fun startMoving()
    fun stopMoving()
}

interface TransportOfPassengers {
    fun putInCar(humans: Int)
    fun getOutOfCar()
}

interface CargoHandling {
    fun load(currentCapacity: Int)
    fun unload()
}

abstract class Vehicle(
    val maxPassengerCapacity: Int,
    val maxCargoCapacity: Int,
    var numberOfHumanInside: Int,
    var massOfCargoInside: Int,
)

class FreightTransport(

    maxPassengerCapacity: Int = 1,
    maxCargoCapacity: Int = 2000,
    numberOfHumanInside: Int,
    massOfCargoInside: Int,
) : Vehicle(maxPassengerCapacity, maxCargoCapacity, numberOfHumanInside, massOfCargoInside), TransportOfPassengers,
    CargoHandling, Movement {

    override fun startMoving() = println("Движение началось.")
    override fun stopMoving() = println("Движение остановлено")
    override fun putInCar(humans: Int) {
        if (humans > 0) println("В грузовик сел $humans человек.")

        numberOfHumanInside = maxPassengerCapacity

    }

    override fun getOutOfCar() {
        if (numberOfHumanInside > 0) {
            println("Пассажир покинул кабину")
            numberOfHumanInside = 0
        }
    }

    override fun load(currentCapacity: Int) {

        println("Loading $currentCapacity kg ")
    }

    override fun unload() {
        println("Грузовой отсек освобождён.")
        massOfCargoInside = 0
    }
}

class LightTransport(
    maxPassengerCapacity: Int = 3,
    maxCargoCapacity: Int = 0,
    numberOfHumanInside: Int,
    massOfCargoInside: Int = 0,
) : Vehicle(maxPassengerCapacity, maxCargoCapacity, numberOfHumanInside, massOfCargoInside), TransportOfPassengers,
    Movement {

    override fun startMoving() = println("Двигатель запущен.Режим \"Drive\" активирован.")
    override fun stopMoving() = println("Двигатель заглушен. Режим \"Parking\"активирован.")
    override fun putInCar(humans: Int) {
        println("В легковую машину село $humans людей.")
    }

    override fun getOutOfCar() {
        println("Всё пассажиры высажены.")
        numberOfHumanInside = 0
    }
}


fun main() {

    val vehicle1 = FreightTransport(numberOfHumanInside = 1, massOfCargoInside = 1200)
    val vehicle2 = LightTransport(numberOfHumanInside = 2)
    var currentFreightPassengerCapacity: Int
    var currentLightPassengerCapacity: Int
    var currentCargoCapacity: Int
    var numberOfHumansForTransport = 6
    var volueOfCargoForTransport = 2000


    while (volueOfCargoForTransport > 0) {
        currentCargoCapacity = vehicle1.maxCargoCapacity - vehicle1.massOfCargoInside
        if (currentCargoCapacity < vehicle1.maxCargoCapacity || volueOfCargoForTransport > vehicle1.maxCargoCapacity) {
            vehicle1.load(currentCargoCapacity)
        } else vehicle1.load(volueOfCargoForTransport)
        volueOfCargoForTransport -= currentCargoCapacity
        vehicle1.unload()
    }

    while (numberOfHumansForTransport > 0) {
        currentFreightPassengerCapacity =
            vehicle1.maxPassengerCapacity - vehicle1.numberOfHumanInside
        currentLightPassengerCapacity = vehicle2.maxPassengerCapacity - vehicle2.numberOfHumanInside
        when {
            numberOfHumansForTransport > vehicle2.maxPassengerCapacity -> {
                vehicle1.putInCar(currentFreightPassengerCapacity)
                vehicle2.putInCar(currentLightPassengerCapacity)
                vehicle1.getOutOfCar()
                vehicle2.getOutOfCar()
            }

            else -> {
                vehicle2.putInCar(numberOfHumansForTransport)
                vehicle2.getOutOfCar()
            }
        }
        numberOfHumansForTransport =
            numberOfHumansForTransport - currentLightPassengerCapacity - currentFreightPassengerCapacity
    }

}