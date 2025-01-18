package org.example.lesson_2

fun main() {
    val ratingPit = 3f
    val ratingTom = 4f
    val ratingBill = 3f
    val ratingAlex = 5f
    val averageScore = (ratingPit + ratingTom + ratingBill + ratingAlex) / NUMBER_OF_STUDENTS

    println(averageScore)
}

val NUMBER_OF_STUDENTS = 4