package org.example.lesson_2

fun main() {
    val crystalOre = 7
    val ironOre = 11

    println("Поздравляю,тебе накинули ${(crystalOre * (BAFF_IN_PERCENT / 100)).toInt()} кристалической руды!")
    println("Поздравляю,тебе накинули ${(ironOre * (BAFF_IN_PERCENT / 100)).toInt()} железной руды!")
}

const val BAFF_IN_PERCENT = 20f