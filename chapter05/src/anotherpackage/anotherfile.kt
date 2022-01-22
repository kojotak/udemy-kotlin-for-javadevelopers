package anotherpackage

import whatever //imports a file
import upperFirstAndLast //imports a function

fun main(args:Array<String>){
    println("using function from other package: ${whatever()}")

    println(CompanyCommunications.getCopyrightLine())

    println(Department.IT.getInfo())

    println("a string to work with".upperFirstAndLast())
}