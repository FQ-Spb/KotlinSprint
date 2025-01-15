package org.example.lesson_2

fun main(){
    val perStaff = 50
    val interns = 30
    val psSalary = 50000
    val intSalary = 20000
    val totalPsSalary = perStaff*psSalary
    val payrollFund = perStaff*psSalary+interns*intSalary
    val averageSal = payrollFund/(perStaff+interns)
    println(totalPsSalary)
    println(payrollFund)
    println(averageSal)
}