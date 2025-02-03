package org.example.lesson12

import kotlin.random.Random

const val DAYS_IN_MONTH = 30

class Weather5(
    val daytimeTemp:Int,
    val nigthtimeTemp:Int,
    val isAnyPrecipitation:Boolean
)


fun main(){

    val weatherDuringMonth = mutableListOf<Weather5>()
    while (weatherDuringMonth.size< DAYS_IN_MONTH){
        val weatherDuringDay = Weather5((20..30).random(),(15..25).random(),Random.nextBoolean())
        weatherDuringMonth.add(weatherDuringDay)
    }
   val daytimeTemp = mutableListOf<Int>()
    weatherDuringMonth.map{it->daytimeTemp.add(it.daytimeTemp)}

    val nighttimeTemp = mutableListOf<Int>()
    weatherDuringMonth.map{it-> nighttimeTemp.add(it.nigthtimeTemp)}

    val rainyDays = mutableListOf<Boolean>()
    weatherDuringMonth.map{it-> rainyDays.add(it.isAnyPrecipitation==true)}

    println(rainyDays)
}