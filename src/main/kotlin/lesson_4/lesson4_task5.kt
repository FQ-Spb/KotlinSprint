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
    val shipCanSail = (noDamage && (crewSize in 55..70) && (amountOfFood > 50) && weather || !weather) ||
            (!noDamage && (crewSize == 70) && (amountOfFood >= 50) && weather)

    if (shipCanSail) {
        println("Корабль может плыть!")
    } else {
        println("Корабль плыть не может!")
    }
}