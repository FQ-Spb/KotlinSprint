package org.example.lesson_1

fun main() {
    val year = "1961"
    var hour = "09".toInt()
    var minute = "07".toInt()

    println(year)
    println(String.format("%02d", hour))
    println(String.format("%02d", minute))
    hour += 1
    minute += 48
    print("$hour:$minute")
}