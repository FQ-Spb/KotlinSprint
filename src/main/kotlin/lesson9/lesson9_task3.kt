package org.example.lesson9

fun main() {

    val volueOfIngForOne = listOf(2, 50, 15)

    print("Сколько порций вы хотите приготовить?: ")
    val numberOfPortions = readln().toInt()
    val volueForSeveralPortions = volueOfIngForOne.map { volue -> volue * numberOfPortions }

    print("На $numberOfPortions порций вам понадобится: ")
    volueForSeveralPortions.forEach {
        when (volueForSeveralPortions.indexOf(it)) {
            0 -> print("Яиц - $it шт ")
            1 -> print("Молока - $it мл ")
            2 -> print("Масла - $it гр ")
        }
    }

}