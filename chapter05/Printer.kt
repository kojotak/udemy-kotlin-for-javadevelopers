package chapter05
fun main(args: Array<String>){
    val laserPrinter = LaserPrinter("Brother 134", 15)
    laserPrinter.printModel()

    SomethingElse("chapter05.whatever")
}

open //all classes are final by default in Kotlin, have to mark as open for inheritance
abstract //abstract classes have to be subclassed... so we can delete the open keyword here
class Printer(val modelName: String) {

    open fun printModel() = println("The model name of this printer is $modelName")

    abstract fun bestSellingPrice(): Double
}

open class LaserPrinter(modelName:String, ppm: Int): Printer(modelName)   {

    //have to declare override... and the overriden function have to be open
    final override fun printModel () = println("The model name of this laser printer is $modelName")

    //the overriden function is implicitly open from the abstract keyword
    //all fuctions with override are automaticlly open as well
    override fun bestSellingPrice() : Double = 129.9
}

class SpecialLaserPrinter(modelName: String, ppm: Int): LaserPrinter(modelName, ppm){

    //can not override, printModel is final!
    //override fun printModel() = println("this is special laser printer: $modelName")
}

open class Something: MySubInterface {
    //without primary constructor

    val someProperty: String
    override val number: Int = 25 //for the chapter05.MySubInterface

    constructor(someParameter: String){
        someProperty = someParameter
        println("I'm in the parent's constructor")
    }

    override fun mySubFunction(num: Int): String {
        TODO("Not yet implemented")
    }

    override fun myFunction(str: String): String {
        TODO("Not yet implemented")
    }
}

class SomethingElse: Something {

    //we can do this only when there is no primary constructor
    //because primary constructor have to be called
    constructor(someOtherParameter: String): super(someOtherParameter){
        println("I'm in the child's constructor")
    }
}

//data classes can not be extended, so it can not be open
//the following line can not be compiled
//open data class DataClass(val number: Int){
//}

interface MyInterface {
    fun myFunction(str: String): String

    val number: Int //this is abstract

    //val number2: Int = 42 //can not initialize value, because it have to be abstract
    val number2: Int
    get() = number * 100 //how to return a value for abstract property
}

//no need to declare open, interfaces are always open
interface MySubInterface: MyInterface {
    fun mySubFunction(num: Int): String
}
