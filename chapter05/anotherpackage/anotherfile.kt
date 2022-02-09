package anotherpackage

import chapter05.CompanyCommunications
import chapter05.Department
import chapter05.whatever //imports a file
import chapter05.upperFirstAndLast //imports a function

fun main(args:Array<String>){
    println("using function from other package: ${whatever()}")

    println(CompanyCommunications.getCopyrightLine())

    println(Department.IT.getInfo())

    println("a string to work with".upperFirstAndLast())
}