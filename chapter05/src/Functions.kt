
//default return type is Unit (nothing)
fun main(args: Array<String>) : Unit {
    println(labelMultiply(3,4,"The result is: "))
    println(labelMultiply(5,4))

    //can change the order of parameters
    println(labelMultiply(label="Foo", operand2=2, operand1=1))

    val emp = FunEmployee("Jane")
    println("emp: ${emp.upperCaseFirstName()}") //JANE


}

//function with expression body
fun labelMultiply(operand1: Int, operand2: Int, label : String = "The answer is")  =
     ("$label ${operand1 * operand2}")

fun whatever() = 3*4

class FunEmployee(val firstName: String){
    fun upperCaseFirstName() = firstName.toUpperCase()
}


