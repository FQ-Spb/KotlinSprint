package org.example.lesson15


abstract class WeatherStationStats() {
    abstract fun getData(): String
}

class Temperature(
    val degrees: Int,
) : WeatherStationStats() {
    override fun getData(): String {
        return "Температура сегодня - $degrees градусов"
    }
}

class PrecipitationAmount(
    val amount: Double,
) : WeatherStationStats() {
    override fun getData(): String {
        return "Сегодня выпало $amount мм осадков."
    }
}

class WeatherServer() {
    fun sendData(data: WeatherStationStats) {
        println(data.getData())
    }
}

fun main() {

    val mondayTemp = Temperature(15)
    val mondayPrecip = PrecipitationAmount(20.3)
    val server = WeatherServer()

    server.sendData(mondayTemp)
    server.sendData(mondayPrecip)
}