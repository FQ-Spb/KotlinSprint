package org.example.lesson19

import kotlin.random.Random
import kotlin.random.nextUInt

enum class ProductCategory {
    CLOTH {
        override fun getNameOfCategory(): String = "\"Одежда\""
    },
    STATIONARY {
        override fun getNameOfCategory(): String = "\"Канцелярские товары\""
    },
    SUNDRY {
        override fun getNameOfCategory(): String = "\"Всякое\""
    };

    abstract fun getNameOfCategory(): String
}

class Merchandise(
    private val name: String,
    private val id: UInt = Random.nextUInt(),
    private val category: String,
) {
    fun getMerchandiseInfo() = println("Товар $name с артикулом $id относится к категории $category.")
}

fun main() {

    val product1 = Merchandise("Тетрадь", category = ProductCategory.STATIONARY.getNameOfCategory())
    val product2 = Merchandise("Футболка", category = ProductCategory.CLOTH.getNameOfCategory())
    val product3 = Merchandise("Расчёска", category = ProductCategory.SUNDRY.getNameOfCategory())

    product1.getMerchandiseInfo()
    println()
    product2.getMerchandiseInfo()
    println()
    product3.getMerchandiseInfo()
}