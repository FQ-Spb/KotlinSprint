package org.example.lesson13

class UserData3(
    var userName: String,
    var phoneNumber: Long?,
    var company: String?,
) {
    fun printContact() = println("$userName, $phoneNumber, $company")
}

fun main() {

    val phoneBook: MutableList<UserData3> = mutableListOf()

    print("Введите имя: ")
    val nameOfContact = readln()

    print("Введите номер телефона: ")
    val phoneNumber = readln().toLongOrNull()

    print("Введите компанию: ")
    var companyOfContact: String? = readln()

    if (phoneNumber == null) {
        println("Контакт не может быть добавлен, введите номер телефона")
        return
    }
    if (companyOfContact == "") companyOfContact = null

    val contact = UserData3(nameOfContact, phoneNumber, companyOfContact)
    phoneBook.add(contact)
    contact.printContact()

}