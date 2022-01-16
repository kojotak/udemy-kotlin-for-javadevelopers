
fun main(args: Array<String>) {
    val emp = Employee("John")
    println(emp)
}

class Employee constructor(firstName: String){ //this is declared primary constructor
    //primary constructor doesn't contain code

    //shorthand for initialization block
    val firstName: String = firstName
}