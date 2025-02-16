package org.example.lesson20


fun main() {

    val listOfStrings = mutableListOf("News", "Messages", "Friends", "Notes")
    val listOfLambdas = listOfStrings.map { { println("$it item clicked") } }

    listOfLambdas.forEach { if (listOfLambdas.indexOf(it) % 2 != 0) it() }
}