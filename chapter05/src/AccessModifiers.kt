
//top level modifier is public by default in Kotlin (vs package in java)
//Kotlin checkes access modifiers at compile time, because they are compiled into java's byte code
fun main(args: Array<String>) {

    val emp = Employee()
    println(emp)
}

//internal = visible from this module only

//private = visible from this file only
private class Employee {

}