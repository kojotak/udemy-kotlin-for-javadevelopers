
//default return type is Unit (nothing)
fun main(args: Array<String>) : Unit {
    println(labelMultiply(3,4,"The result is: "))
    println(labelMultiply(5,4))

    //can change the order of named parameters
    println(labelMultiply(label="Foo", operand2=2, operand1=1))

    val emp = FunEmployee("Jane")
    println("emp: ${emp.upperCaseFirstName()}") //JANE

    val car1 = Car("blue","Toyota", 2015)
    val car2 = Car("red", "Mazda", 2011)
    val car3 = Car("gray", "Ford", 2012)

    printColors(car1, car2, car3, str = "message")
    //kdyz by vararg byl posledni parametr, nemusel bych pouzit named prameter pro urceni, co je string
}

//function with expression body
fun labelMultiply(operand1: Int, operand2: Int, label : String = "The answer is")  =
     ("$label ${operand1 * operand2}")

fun whatever() = 3*4

class FunEmployee(val firstName: String){
    fun upperCaseFirstName() = firstName.toUpperCase()
}

data class FunCar(val color: String, val model: String, val yer: Int){

}

fun printColors(vararg cars: Car, str: String){
    for(car in cars){
        println("car color ${car.color}")
    }
}

