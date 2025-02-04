package org.example.lesson12

const val ZERO_KELVIN = -273

class Weather3(_daytimeTempK: Int, _nigthtimeTempK: Int, _isAnyPrecipitation: Boolean) {

    var daytimeTemp = _daytimeTempK + ZERO_KELVIN
    var nighttimeTemp = _nigthtimeTempK + ZERO_KELVIN
    var isAnyPrecipitation = _isAnyPrecipitation

    init {
        println(
            "Дневная температура - $daytimeTemp, \nНочная температура - $nighttimeTemp, \n" +
                    "Осадки - $isAnyPrecipitation"
        )
    }
}

fun main() {
    val friday = Weather3(300, 289, false)
}