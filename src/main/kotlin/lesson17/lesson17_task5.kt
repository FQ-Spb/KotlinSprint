package org.example.lesson17

class User(
    private var _login: String?,
    private val _password: String,
) {
    var login: String? = null
        set(value) {
            field = value
            _login = login
            println("Login successfully updated")
        }
    var password
        get() = "*".repeat(_password.length)
        set(value) {
            println("You can not change password.")
        }
}

fun main() {
    val user1 = User("Ivan", "password123")

    println(user1.password)
    user1.password = "123"
    println(user1.password)
    user1.login = "John"
    println("Your new login is: \"${user1.login}\"")
}