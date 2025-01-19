package org.example.lesson_1


fun main() {
    val totalTime = 6480
    val hour = totalTime / (SECONDS_IN_HOUR)
    val minutes = totalTime % SECONDS_IN_HOUR / SECONDS_IN_MINUTE
    val seconds = totalTime - hour * SECONDS_IN_HOUR - minutes * SECONDS_IN_MINUTE

    println(
        String.format("%02d", hour) + ':' + String.format("%02d", minutes) +
                ':' + String.format("%02d", seconds)
    )

}

const val SECONDS_IN_MINUTE = 60
const val SECONDS_IN_HOUR = 3600