package org.example.lesson_1



fun main() {
    val totalTime = 6480
    val hour = totalTime / 3600
    val minutes = totalTime % 3600 / 60
    val seconds = totalTime - hour * 3600 - minutes * 60

    println(
        String.format("%02d", hour) + ':' + String.format("%02d", minutes) +
                ':' + String.format("%02d", seconds)
    )

}

