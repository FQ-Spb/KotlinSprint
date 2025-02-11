package org.example.lesson18

class Order1(
    val numberOfOrder: Int,
) {
    fun getData(number: Int, content: String) {
        println("Order №$number contains $content")
    }

    fun getData(number: Int, content: List<String>) {
        println("Order №$number contains ${content.joinToString(", ")}")
    }
}

fun main() {
    val order1 = Order1(numberOfOrder = 1)
    val order2 = Order1(numberOfOrder = 2)

    order1.getData(1, "Hammer")
    order2.getData(2, listOf("Saw", "Backs", "Jigsaw", "Plane", "Angle grinder"))
}