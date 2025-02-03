package org.example.lesson12

const val ABSOLUTE_ZERO = -273

class Weather2(_daytimeTempK: Int, _nigthtimeTempK: Int, _isAnyPrecipitation: Boolean) {

    var daytimeTemp = _daytimeTempK + ABSOLUTE_ZERO
    var nighttimeTemp = _nigthtimeTempK + ABSOLUTE_ZERO
    var isAnyPrecipitation = _isAnyPrecipitation

    fun printWeather() = println(
        "Дневная температура - $daytimeTemp, \nНочная температура - $nighttimeTemp, \n" +
                "Осадки - $isAnyPrecipitation"
    )
}

fun main() {
    val friday = Weather2(300, 289, false)

    friday.printWeather()
}