package org.example.lesson22

import java.util.Date

data class GalacticGuide(
    val nameOfPlaceOrEvent: String,
    val descriptionOfPlaceOrEvent: String,
    val dateAndTimeOfEvent: String,
    val distanceFromEarth: Float,
)

fun main() {
    val page1 = GalacticGuide("Alpha Centauri", "New star is born", "Six billions years ago", distanceFromEarth = 4.37f)

    println(page1.component1())
    println(page1.component2())
    println(page1.component3())
    println(page1.component4())
}