package org.example.lesson_4

fun main() {

    val undamagedShipCrew = (55..70)

    print("Корабль не имеет повреждений(true или false): ")
    val isShipUndamaged = readln().toBoolean()
    print("Количество человек в экипаже: ")
    val crewSize = readln().toInt()
    print("Количество ящиков провизии на борту: ")
    val amountOfFood = readln().toInt()
    print("Благоприятна ли погода(true или false): ")
    val isWeatherGood = readln().toBoolean()
    val shipCanSail = (isShipUndamaged && (crewSize in undamagedShipCrew) &&
            (amountOfFood > MIN_AMOUNT_OF_FOOD) && (isWeatherGood || !isWeatherGood)) ||
            (!isShipUndamaged && (crewSize == DAMAGE_SHIP_CREW) && (amountOfFood >= MIN_AMOUNT_OF_FOOD) && isWeatherGood)

    if (shipCanSail) {
        println("Корабль может плыть!")
    } else {
        println("Корабль плыть не может!")
    }
}

const val DAMAGE_SHIP_CREW = 70
const val MIN_AMOUNT_OF_FOOD = 50