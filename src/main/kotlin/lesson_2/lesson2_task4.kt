package org.example.lesson_2

fun main() {
    val crystalOre = 7
    val ironOre = 11

    println("Поздравляю,тебе накинули ${(crystalOre * (BAFF_IN_PERCENT / CONSTANT_DIVISOR)).toInt()} кристалической руды!")
    println("Поздравляю,тебе накинули ${(ironOre * (BAFF_IN_PERCENT / CONSTANT_DIVISOR)).toInt()} железной руды!")
}

const val BAFF_IN_PERCENT = 20f
const val CONSTANT_DIVISOR = 100