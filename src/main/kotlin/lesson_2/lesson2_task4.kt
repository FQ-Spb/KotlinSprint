package org.example.lesson_2

fun main(){
    val crystalOre = 7
    val ironOre = 11
    val crystalOreBaff = (crystalOre*1.2-crystalOre).toInt()
    val ironOreBaff = (ironOre*1.2-ironOre).toInt()
    println("Поздравляю,тебе накинули $crystalOreBaff кристалической руды!")
    println("Поздравляю,тебе накинули $ironOreBaff железной руды!")
}