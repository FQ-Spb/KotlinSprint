package org.example.lesson17

class User(
    private var _login: String,
    private val _password: String,
) {
    var login = ""
        set(value) {
            _login = value
            println("Login successfully updated")
        }
}