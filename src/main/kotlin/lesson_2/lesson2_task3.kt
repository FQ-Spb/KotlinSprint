package org.example.lesson_2

fun main(){
   val depHour = 9
    val depMin = 56
    val travelTime = 457
    val depInMin = depHour*60+depMin
    val arrTimeInMin = depInMin+travelTime
val arrivalHour = arrTimeInMin/60
    val arrivalMin = arrTimeInMin%60

    println(String.format("%02d",arrivalHour)+':'+String.format("%02d",arrivalMin))

}