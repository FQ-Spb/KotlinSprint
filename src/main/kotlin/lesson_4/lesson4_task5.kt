package org.example.lesson_4

fun main() {


    print("Корабль не имеет повреждений(true или false): ")
    val noDamage = readlnOrNull().toBoolean()
    print("Количество человек в экипаже: ")
    val crewSize = readlnOrNull()!!.toInt()
    print("Количество ящиков провизии на борту: ")
    val amountOfFood = readlnOrNull()!!.toInt()
    print("Благоприятна ли погода(true или false): ")
    val weather = readlnOrNull().toBoolean()

    if (noDamage == false) {
        println("Повреждения значительны?")
        val significantDamage = readlnOrNull().toBoolean()
        if (significantDamage == true) {
            return println("Корабль плыть не может!")
        } else {
            if ((crewSize == 70) && (amountOfFood >= 50) && (weather == true)) {
                println("Корабль может отплывать!")
            } else {
                println("Корабль плыть не может!")
            }
        }
    } else {
        if ((noDamage == true) && (crewSize >= 55) && (crewSize <= 70) && (amountOfFood > 50) && (weather == true) ||
            (weather == false)
        ) {
            println("Корабль может отплывать!")
        } else {
            println("Корабль плыть не может!")
        }

    }
}