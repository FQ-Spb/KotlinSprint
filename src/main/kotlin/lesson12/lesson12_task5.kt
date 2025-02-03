package org.example.lesson12

const val DAYS_IN_MONTH = 30

class Weather5(
    val daytimeTemp:Int,
    val nigthtimeTemp:Int,
)


fun main(){

    val weatherDuringMonth = mutableListOf<Weather5>()
    while (weatherDuringMonth.size< DAYS_IN_MONTH){
        val weatherDuringDay = Weather5((20..30).random(),(15..25).random())
        weatherDuringMonth.add(weatherDuringDay)
    }
    println("${weatherDuringMonth.size}")
}