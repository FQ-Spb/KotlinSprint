package org.example.lesson_4

fun main() {

    val isSunnyToday = true
    val isRoofOpenToday = true
    val airHumidityToday = 20
    val seasonToday = "Winter"

    println(
        "Благоприятные ли условия сейчас для роста бобовых? ${
            (isSunnyToday == IS_SUNNY) && (isRoofOpenToday == IS_AWNING_OPEN) &&
                    (airHumidityToday == AIR_HUMIDITY) && (seasonToday != SEASON)
        }"
    )
}

const val IS_SUNNY = true
const val IS_AWNING_OPEN = true
const val AIR_HUMIDITY = 20
const val SEASON = "Winter"