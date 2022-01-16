
//konstanty - chci val, nikoliv var
val MY_CONSTANT = 100 //defaultni typ = Int

fun main(args: Array<String>) {

    println("my constant: $MY_CONSTANT")

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

    println("data class demo:")
    val car = Car("blue","Toyota", 2015)
    val car2 = Car("blue","Toyota", 2015)
    val car3 = car.copy(year=2016)
    println("car: $car, copy $car3")

    val empJohn2 = Employee("John")
    println("equals Johns ${emp == empJohn2}") //false - defaultne se porovnavaji instance
    println("equals cars ${car == car2}") //true - defaultne overridnuty equals
}

//rozdil od klasicke tridy:
//prepdpripravene equals, hashcody, toString a copy funkce
//maji desctructuring
//primary constructor musi mit min. 1 prametr a musi byt vsechny val nebo var
//muzou byt abstract, sealed ci inner classes
data class Car(val color: String, val model: String, val year: Int){

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