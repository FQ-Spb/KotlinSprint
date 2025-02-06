package org.example.lesson15


interface Flyable {
    fun fly()
}

interface Swimable {
    fun swim()
}

interface WalkinOnFoot {
    fun walk()
}

class CrucianCarp : Swimable {
    override fun swim() = println("Плавает в толще воды, виляя хвостом.")
}

class Seagull : Flyable, WalkinOnFoot {
    override fun fly() = println("Летает, махая крыльями и издавая мерзкие звуки.")
    override fun walk() = println("Ходит по земле.")
}

class Duck : Swimable, Flyable, WalkinOnFoot {
    override fun swim() = println("Плавает по повехности воды, перебирая лапами.Иногда к верху жопой. ")
    override fun fly() = println("Летает, махая крыльями и забавно крякает.")
    override fun walk() = println("Ходит по земле уверенно, как сутенёр.")
}

fun main() {
    val crucianCarp = CrucianCarp()
    val seagull = Seagull()
    val donaldDuck = Duck()
    crucianCarp.swim()
    seagull.walk()
    seagull.fly()
    donaldDuck.fly()
    donaldDuck.walk()
    donaldDuck.swim()
}