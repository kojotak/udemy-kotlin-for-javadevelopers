package chapter07

fun main(ars: Array<String>){

    run{ println("I am in a lambda")}

    val employees = listOf( Employee("John","Smith", 2012),
                            Employee("Jane", "Wilson", 2015),
                            Employee("Mary", "Johnson", 2010),
                            Employee("Mike", "Jones", 2002))

    //ekvivalentni zapisy
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

    findByLastName(employees, "Wilson")
    findByLastName(employees, "Smithson")

    "Some string".apply outer@ { //labelem si oznacim lambdu
        "Another string".apply {
            println(toLowerCase()) //nemusim psat this... je to ten vnitrni this, tj. another string
            println(this@outer.toUpperCase()) //SOME STRING
        }
    }
}

fun findByLastName(employees: List<Employee>, lastName: String){
    employees.forEach returnBlock@ {
        if(it.lastName ==lastName){
            println("Yes, there is an employee with last name $lastName")
            //return@returnBlock //vrati se na returnBlock... ale to nechceme
            return //ukonci jak lambdu pro forEach, ale i funkcni
        }
    }
    println("No, there is no employee with last name $lastName")
}

fun topLevel() = println("I am in a function")

fun useParameter(employes : List<Employee>, num: Int) {
    employes.forEach{
        println("${it.firstName}")
    }
}

data class Employee(val firstName:String, val lastName: String, val startYear: Int){

}