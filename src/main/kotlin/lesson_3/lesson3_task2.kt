package org.example.lesson_3

fun main() {

    val personName = "Татьяна"
    var personSurname = "Андреева"
    val nameOfFather = "Сергеевна"
    var personAge = 20

    println("$personSurname $personName $nameOfFather, $personAge")
    personAge += 2
    personSurname = "Сидорова"
    println("$personSurname $personName $nameOfFather, $personAge")
}