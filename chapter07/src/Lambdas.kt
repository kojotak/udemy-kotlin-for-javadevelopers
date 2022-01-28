fun main(ars: Array<String>){

    run{ println("I am in a lambda")}

    val employees = listOf( Employee("John","Smith", 2012),
                            Employee("Jane", "Wilson", 2015),
                            Employee("Mary", "Johnson", 2010),
                            Employee("Mike", "Jones", 2002))

    //println( employees.minByOrNull { e->e.startYear}) //Mike Jones
    //println( employees.minByOrNull { e : Employee ->e.startYear}) //can specify type
    //println( employees.minByOrNull { it.startYear}) //it... the default argument
    println( employees.minByOrNull(Employee::startYear)) //double colon - like in java

    var num = 10
    run {
        num +=15 //can modify variable outside a lambda! (does not work in java)
        println("after $num")
    }

    run(::topLevel)
}

fun topLevel() = print("I am in a function")

fun useParameter(employes : List<Employee>, num: Int) {
    employes.forEach{
        println("${it.firstName}")
    }
}

data class Employee(val firstName:String, val lastName: String, val startYear: Int){

}