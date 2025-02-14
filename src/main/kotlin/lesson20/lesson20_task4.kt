package org.example.lesson20


fun main() {

    val lambda = { it: String -> println("$it item clicked") }
    val listOfLambdas: MutableList<(String) -> Unit> = mutableListOf()
    val listOfStrings = mutableListOf("News", "Messages", "Friends", "Notes")

    listOfStrings.map { listOfLambdas.add(lambda) }

    for (i in listOfLambdas.indices) {
        if (i % 2 != 0)
            listOfLambdas[i](listOfStrings[i])
    }
}