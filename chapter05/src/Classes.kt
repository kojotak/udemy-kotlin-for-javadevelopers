
fun main(args: Array<String>) {
    val emp = Employee("John")
    println(emp)
}

class Employee (firstName: String){ //can remove the constructor keyword - it will generate public one

    //Kotlin will declare firstName property for us

}