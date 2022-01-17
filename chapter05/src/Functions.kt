
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

    val numbers = arrayOf(1,2,3)
    val manyCars = arrayOf(car1, car2, car3)
    printColors(*manyCars, str="foo")//spread operator unpacks an array

    val moreCars = arrayOf(car2, car3)
    val car4 = Car("yellow", "Skoda", 1986)
    val lotsOfCars = arrayOf(manyCars, moreCars, car4)
    for(c in lotsOfCars){
        //println("lots of cars: $c") //this is wrong, will print arrays
    }
    val lotsOfCarsFixed = arrayOf(*manyCars, *moreCars, car4)
    for(c in lotsOfCarsFixed){
        println("lots of cars: $c") //fixed
    }

    //utility class
    val s = "this is some sentence"
    println(Utils().upperFirstAndLast(s))
    //extension functions
    println(s.upperFirstAndLast())//s = receiver object
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

//extension function to String
//there is no parameter... we are using this reference to the string itself
fun String.upperFirstAndLast(): String {
    val upperFirst = this.substring(0,1).toUpperCase() + this.substring(1)
    return upperFirst.substring(0, upperFirst.length-1) + upperFirst.substring(upperFirst.length-1, upperFirst.length).toUpperCase()
}
