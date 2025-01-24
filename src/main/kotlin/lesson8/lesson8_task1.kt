package org.example.lesson8

fun main() {

    val daysOfTheWeek = arrayOf("Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье")
    var viewsPerWeek = intArrayOf()
    var totalViews = 0

    for (day in daysOfTheWeek) {
        println("Сколько просмотров было в $day:")
        viewsPerWeek += readln().toInt()
    }
    for (index in viewsPerWeek) {
        totalViews += viewsPerWeek[index]
    }
    println(totalViews)
}

