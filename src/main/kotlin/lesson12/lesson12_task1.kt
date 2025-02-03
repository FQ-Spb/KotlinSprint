package org.example.lesson12

class Weather {

    var daytimeTemp = 12
    var nighttimeTemp = 1
    var isAnyPrecipitation = false

 fun printWeather() = println("Дневная температура - $daytimeTemp, \nНочная температура - $nighttimeTemp, \n" +
         "Осадки - $isAnyPrecipitation")
}

fun main(){

    val monday = Weather()
    val tuesday = Weather()

    monday.nighttimeTemp = 3
    tuesday.daytimeTemp = 15
    tuesday.isAnyPrecipitation = true
    monday.printWeather()
    println()
    tuesday.printWeather()
}