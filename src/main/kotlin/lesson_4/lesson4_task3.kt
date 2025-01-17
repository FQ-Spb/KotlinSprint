package org.example.lesson_4

fun main() {
    //критерии для роста бобовых
    val sunny = true
    val openRoof = true
    val airHumidity = 20
    val season = "Winter"
    // Условия на ферме сегодня
    val sunnyToday = true
    val openRoofToday = true
    val airHumidityToday = 20
    val seasonToday = "Winter"

    println(
        "Благоприятные ли условия сейчас для роста бобовых? ${
            (sunnyToday == sunny) && (openRoofToday == openRoof) &&
                    (airHumidityToday == airHumidity) && (seasonToday != season)
        }"
    )
}