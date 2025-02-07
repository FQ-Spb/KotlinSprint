package org.example.lesson15

interface Movement {
    fun startMoving()
    fun stopMoving()
}

interface TransportOfPassengers {
    fun prepareForTransport()
    fun disembarkPassengers()
}

interface CargoHandling {
    fun unfoldRamp()
    fun lowerRamp()
    fun raiseRamp()
    fun openCargoBay()
    fun closeCargoBay()
    fun download()
    fun unload()
}

abstract class Vehicle(
    var maxPassengerCapacity: Int,
    var maxCargoCapacity: Int,
)

class FreightTransport(
    maxPassengerCapacity: Int = 1,
    maxCargoCapacity: Int = 2000,
    var numberOfHumanInCar: Int,
    val currentPassengerCapacity: Int = maxPassengerCapacity - numberOfHumanInCar,
    var massOfCargoInside: Int,
    var currentCargoCapacity: Int = maxCargoCapacity - massOfCargoInside,

    ) : Vehicle(maxPassengerCapacity, maxCargoCapacity), TransportOfPassengers, CargoHandling, Movement {
    override fun startMoving() = println("Радио \"Шансон\"включено. Шторы открыты.Автопилот активирован.")
    override fun stopMoving() = println("\"Шансон\" выключен. Шторы задёрнуты.Автопилот деактивирован")
    override fun unfoldRamp() = println("Аппарель активирована.")
    override fun lowerRamp() = println("Аппарель опущена.")
    override fun raiseRamp() = println("Аппарель поднята.")
    override fun openCargoBay() = println("Грузовой отсек открыт.")
    override fun closeCargoBay() = println("Грузовой отсек закрыт.")
    override fun prepareForTransport() = println("Молитва прочитана.Тапочки надеты")
    override fun disembarkPassengers() {
        println("Уличная обувь возвращена")
        numberOfHumanInCar = 0
    }

    override fun download() {
        println("Груз помещен в грузовой отсек.")
        massOfCargoInside = maxCargoCapacity
    }

    override fun unload() {
        println("Грузовой отсек освобождён.")
        currentCargoCapacity = maxCargoCapacity
    }
}

class LightTransport(
    maxPassengerCapacity: Int = 3,
    maxCargoCapacity: Int = 0,
    var numberOfHumanInCar: Int,
    val currentCapacity: Int = maxPassengerCapacity - numberOfHumanInCar,
) : Vehicle(maxPassengerCapacity, maxCargoCapacity), TransportOfPassengers, Movement {
    override fun startMoving() = println("Двигатель запущен.Режим \"Drive\" активирован.")
    override fun stopMoving() = println("Двигатель заглушен. Режим \"Parking\"активирован.")
    override fun prepareForTransport() {
        println("Двери заблокированы. Ремни безопасности пристегнуты. Принято $currentCapacity людей.")
        numberOfHumanInCar = maxPassengerCapacity
    }

    override fun disembarkPassengers() {
        println("Ремни отстёгнуты.Двери разблокированы. Всё пассажиры высажены.")
        numberOfHumanInCar = 0
    }
}

fun main() {

    var counterOfHumans = 6
    var counterOfCargo = 2000
    val volkswagen = LightTransport(numberOfHumanInCar = 1)
    val freightLiner = FreightTransport(numberOfHumanInCar = 0, massOfCargoInside = 0)
    do {
        if (volkswagen.currentCapacity < volkswagen.maxPassengerCapacity) {
            volkswagen.prepareForTransport()
            counterOfHumans -= volkswagen.currentCapacity
            volkswagen.startMoving()
            volkswagen.stopMoving()
            volkswagen.disembarkPassengers()

        }
        if (counterOfCargo == 0) continue
        else {
            if (freightLiner.currentCargoCapacity <= freightLiner.maxCargoCapacity) {
                freightLiner.unfoldRamp()
                freightLiner.openCargoBay()
                freightLiner.raiseRamp()
                freightLiner.download()
                counterOfCargo -= freightLiner.currentCargoCapacity
                freightLiner.startMoving()
                freightLiner.stopMoving()
                freightLiner.unload()
            }
        }
    } while (counterOfCargo > 0 || counterOfHumans > 0)

}