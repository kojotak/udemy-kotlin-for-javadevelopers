package challenges

import challenges.ch9.Employee

fun main(ars: Array<String>){

    val employee = Employee("Jane", "Smith", 2000)
    employee.lastName = "Jones" //have to add getter and setter to access this field
    employee.salaryLast3Years = floatArrayOf(50000f,55000f,57000.5f) //have to convert FloatArray to float[]

}