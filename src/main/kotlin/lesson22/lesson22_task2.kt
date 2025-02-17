package org.example.lesson22

class RegulBook(
    val name:String,
    val author:String,
)

data class BookData(
    val name:String,
    val author:String,
)

fun main(){

    val book1 = RegulBook("Тайный сыск царя Гороха","Андрей Белянин")
    val book2 = BookData("Тайный сыск царя Гороха","Андрей Белянин")

    println(book1)      //Вывод в консоль отличается, потому что для объектов дата-класса//
    println()           // функция toString(), вызываемая методом println(), заранее переопределена//
    println(book2)      // и выводит понятную для чтения строку через интерполяцию свойств класса.//
}