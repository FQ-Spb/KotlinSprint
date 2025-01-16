package org.example.lesson_3

fun main(){

    val inputLine = "D2-D4;0"

    val list = inputLine.split(";", "-").map { it.trim() }

    val from = list.get(0)
    val to = list.get(1)
    val moveNum = list.get(2)
println("""
    $from
    $to
    $moveNum
""".trimIndent())

}