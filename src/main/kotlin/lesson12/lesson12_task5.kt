package org.example.lesson12

import kotlin.random.Random

const val DAYS_IN_MONTH = 30

class Weather5(
    val daytimeTemp: Int,
    val nighttimeTemp: Int,
    val isAnyPrecipitation: Boolean,
)


fun main() {

    val weatherDuringMonth = mutableListOf<Weather5>()

    while (weatherDuringMonth.size < DAYS_IN_MONTH) {
        val weatherDuringDay = Weather5((20..30).random(), (15..25).random(), Random.nextBoolean())
        weatherDuringMonth.add(weatherDuringDay)
    }
    val daytimeTemp = mutableListOf<Int>()
    weatherDuringMonth.map { daytimeTemp.add(it.daytimeTemp) }

    val nighttimeTemp = mutableListOf<Int>()
    weatherDuringMonth.map { nighttimeTemp.add(it.nighttimeTemp) }

    val rainyDays = mutableListOf<Boolean>()
    weatherDuringMonth.map { if (it.isAnyPrecipitation) rainyDays.add(it.isAnyPrecipitation) }

    println(String.format("%.2f", daytimeTemp.average()))
    println(String.format("%.2f", nighttimeTemp.average()))
    println(rainyDays.size)
}