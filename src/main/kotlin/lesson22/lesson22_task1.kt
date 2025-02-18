package org.example.lesson22

class RegularBook(
    val name: String,
    val author: String,
)

data class DataBook(
    val name: String,
    val author: String,
)

fun main() {

    val book1 = RegularBook("Мор - ученик смерти", "Терри Пратчетт")
    val book2 = RegularBook("Мор - ученик смерти", "Терри Пратчетт")
    val book3 = DataBook("Мор - ученик смерти", "Терри Пратчетт")
    val book4 = DataBook("Мор - ученик смерти", "Терри Пратчетт")

    println(book1 == book2)
    println()                   //Результаты отличаются, потому что в обычном классе и дата-классе отличаются принципы присваивания //
    println(book3 == book4)     //хеш-кодов. В обычном классе они присваиваются произвольно, поэтому у объектов с одинаковыми //
                                //значениями полей хеш-коды будут отличаться.//
                                //В дата-классе же два объекта с одинаковыми значениями полей имеют и равные по значению//
                                //хеш-коды.
}