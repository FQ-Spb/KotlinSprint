package org.example.lesson_2

fun main() {
    val depHour = 9
    val depMin = 56
    val travelTime = 457
    val depInMin = depHour * MINUTES_IN_HOUR + depMin
    val arrTimeInMin = depInMin + travelTime
    val arrivalHour = arrTimeInMin / MINUTES_IN_HOUR
    val arrivalMin = arrTimeInMin % MINUTES_IN_HOUR

    println("${String.format("%02d", arrivalHour)}:${String.format("%02d", arrivalMin)}")

}

const val MINUTES_IN_HOUR = 60