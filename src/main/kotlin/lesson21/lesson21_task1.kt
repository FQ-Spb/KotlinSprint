package org.example.lesson21

fun main(){

val testString = "Привет меня зовут Иван."
   println( testString.vowelCount(testString))
}

fun String.vowelCount(inputString:String):Int{
    val vowels = "[аоуыэеёиюяАОУЫЭЕЁИЮЯ]".toRegex()
    val listOfVowels = vowels.findAll(inputString).joinToString(""){it.value}
    return listOfVowels.length
}