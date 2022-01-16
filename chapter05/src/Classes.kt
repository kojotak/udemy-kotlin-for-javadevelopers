
fun main(args: Array<String>) {
    val emp = Employee("John")
    println(emp)
    emp.fullTime = false
    println(emp.fullTime)

    val emp2 = Employee("Joe")
    println(emp2.firstName)
    println(emp2.fullTime)

    val emp3 = Employee("Jane")
    println(emp3.firstName)
    println(emp3.fullTime)

    println(Demo().dummy)
}

class Employee (val firstName: String, fullTime: Boolean = true){

    //ted je fullTime parametr
    //a my si rucne vytvorime property
    //Kotlin ma pouze properties, anebo backing field
    var fullTime = fullTime
    get(){
        println("running the custom get")
        return field
    }
    set(value){
        println("running the custom set")
        field = value
    }

}

class Demo {//we don't have to declare primary constructor
    val dummy: String

    constructor(){
        dummy = "Hello"
    }
}