package org.example.lesson_4

fun main() {

    val todayRes = 13
    val tomorrowRes = 9

    println(
        "Доступность столиков на сегодня:${todayRes < TOTAL_TABLE_AMT} \n" +
                " Доступность столиков на завтра: ${tomorrowRes < TOTAL_TABLE_AMT}"
    )
}

const val TOTAL_TABLE_AMT = 13