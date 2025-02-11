package org.example.lesson16

import kotlin.random.Random

class Order(
    private val numberOfOrder: Int = Random.nextInt(),
    var readinessStatus: String = "Не готов",
) {
    fun changeStatus(newStat: String) {
        readinessStatus = newStat
    }
}

fun main() {
    val order1 = Order()

    makeRequest(order1, "Собран")
}

fun makeRequest(order: Order, newStatus: String) {
    order.changeStatus(newStatus)
}