
fun main(args: Array<String>) {
    val emp = Employee("John")
    println(emp)
}

class Employee constructor(firstName: String){ //this is declared primary constructor
    //primary constructor doesn't contain code

    val firstName: String

    init { //initialization block
        this.firstName = firstName
    }
}