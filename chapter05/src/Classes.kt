
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

class Employee (val firstName: String, var fullTime: Boolean = true){

}