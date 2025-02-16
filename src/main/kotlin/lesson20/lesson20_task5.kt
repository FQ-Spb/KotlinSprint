package org.example.lesson20

class Robot(

    private val listOfPhrases: List<String> =
        listOf("Let's go working.", "I'm tired", "Pour me a cup of oil", "Leave me alone, the leather bag"),
    private var phrase: String = listOfPhrases[(0..listOfPhrases.lastIndex).random()],
    private var modifier: (String) -> String = { it },
) {
    fun say() = println(modifier(phrase))

    fun setModifier(modifier: (String) -> String) {
        this.modifier = modifier
    }
}

fun main() {

    val robot1 = Robot()

    robot1.say()
    robot1.setModifier(modifier = { it: String -> it.reversed() })
    robot1.say()
}