package org.example.lesson20

interface RobotSkills {
    fun say()
    fun setModifier(modifier: (String) -> String)
}

fun main() {

    val modifier = { it: String -> it.reversed() }
    val listOfPhrases =
        listOf("Let's go working.", "I'm tired", "Pour me a cup of oil", "Leave me alone, the leather bag")
    var phrase = listOfPhrases[(0..listOfPhrases.lastIndex).random()]
    val robot = object : RobotSkills {
        override fun say() = println(phrase)

        override fun setModifier(modifier: (String) -> String) {
            phrase = modifier(phrase)
        }
    }

    robot.say()
    robot.setModifier(modifier)
    robot.say()

}