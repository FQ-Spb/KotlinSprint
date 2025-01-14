package org.example.lesson_1

import java.time.LocalTime
import javax.print.attribute.DateTimeSyntax

fun main(){
    val totalTime = 6481 //добавил одну секунду для наглядности
    val hour = totalTime/3600
    val minutes = totalTime%3600/60
    val seconds = totalTime - hour*3600 - minutes*60

   println(String.format("%02d",hour)+ ':'+ String.format("%02d",minutes)+
           ':'+ String.format("%02d",seconds))
//единственный метод, который я сумел найти
// для автоматического добавления нуля слева.
}

