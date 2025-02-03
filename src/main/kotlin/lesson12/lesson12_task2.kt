package org.example.lesson12

class Weather1(
    var daytimeTemp:Int,
    var nighttimeTemp:Int,
    var isAnyPrecipitation:Boolean,
) {
    fun printWeather() = println("Дневная температура - $daytimeTemp, \nНочная температура - $nighttimeTemp, \n" +
            "Осадки - $isAnyPrecipitation")
}

fun main(){
    val wednesday = Weather1(20,10,true)
    wednesday.printWeather()
}