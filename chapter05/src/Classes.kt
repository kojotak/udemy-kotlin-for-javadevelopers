
fun main(args: Array<String>) {
    val emp = Employee("John")
    println(emp)

    val emp2 = Employee("Joe")
    println(emp2.firstName)
    println(emp2.fullTime)

    val emp3 = Employee("Jane")
    println(emp3.firstName)
    println(emp3.fullTime)
}

class Employee (val firstName: String){ //primary constructor

    //have to declare properties from secondary constructor manually
    var fullTime : Boolean = true

    //this is the secondary constructor
    constructor(firstName: String, fullTime: Boolean) : this(firstName){
        // this(firstName) calls the primary constructor
        // = same situation as in JavaEmployee
    }

}