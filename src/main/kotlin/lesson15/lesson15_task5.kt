package org.example.lesson15

interface Movement {
    fun startMoving()
    fun stopMoving()
}

interface TransportOfPassengers {
    fun putInCar()
    fun getOutOfCar()
}

interface CargoHandling {
    fun load()
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
    override fun putInCar() {
        if ((maxPassengerCapacity - numberOfHumanInside) > 0) {
            println("В кабину село ${maxPassengerCapacity - numberOfHumanInside} человек.")
            numberOfHumanInside = maxPassengerCapacity
        }
    }

    override fun getOutOfCar() {
        if (numberOfHumanInside >0) {
            println("Пассажир покинул кабину")
            numberOfHumanInside=0
        }
    }

    override fun load() {
        println("${maxCargoCapacity - massOfCargoInside} кг груза помещено в грузовой отсек.")
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
    override fun putInCar() {
        println("Двери заблокированы. Ремни безопасности пристегнуты. Принято ${maxPassengerCapacity - numberOfHumanInside} людей.")
    }

    override fun getOutOfCar() {
        println("Ремни отстёгнуты.Двери разблокированы. Всё пассажиры высажены.")
        numberOfHumanInside = 0
    }
}


fun main() {

    val vehicle1 = FreightTransport(numberOfHumanInside = 1, massOfCargoInside = 1200)
    val vehicle2 = LightTransport(numberOfHumanInside = 2)
    var currentPassengerCapacity: Int
    var currentCargoCapacity: Int
    var numberOfHumansForTransport = 6
    var volueOfCargoForTransport = 2000

    do {
        currentCargoCapacity = vehicle1.maxCargoCapacity - vehicle1.massOfCargoInside
        currentPassengerCapacity = (vehicle1.maxPassengerCapacity - vehicle1.numberOfHumanInside) +
                (vehicle2.maxPassengerCapacity - vehicle2.numberOfHumanInside)
        vehicle1.load()
        vehicle1.putInCar()
        numberOfHumansForTransport -= currentPassengerCapacity
        volueOfCargoForTransport -= currentCargoCapacity
        vehicle1.startMoving()
        vehicle1.stopMoving()
        vehicle1.getOutOfCar()
        vehicle1.unload()
        vehicle2.putInCar()
        numberOfHumansForTransport -= currentPassengerCapacity
        vehicle2.startMoving()
        vehicle2.stopMoving()
        vehicle2.getOutOfCar()

    } while (numberOfHumansForTransport > 0 || volueOfCargoForTransport > 0)

}