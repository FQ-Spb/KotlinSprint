package org.example.lesson21

import java.io.File

fun main() {

    val testFile = File("testFileName")
    testFile.writeToFile("Hello")
}

fun File.writeToFile(word: String) {
    createNewFile()
    writeText("${word.lowercase()} \n${this.readText()}")
}