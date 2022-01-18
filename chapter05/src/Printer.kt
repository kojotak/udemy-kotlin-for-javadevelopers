
fun main(args: Array<String>){
    val laserPrinter = LaserPrinter("Brother 134")
    laserPrinter.printModel()
}

open //all classes are final by default in Kotlin, have to mark as open for inheritance
abstract //abstract classes have to be subclassed... so we can delete the open keyword here
class Printer(val modelName: String) {

    open fun printModel() = println("The model name of this printer is $modelName")

    abstract fun bestSellingPrice(): Double
}

class LaserPrinter(modelName:String): Printer(modelName)   {

    //have to declare override... and the overriden function have to be open
    override fun printModel () = println("The model name of this laser printer is $modelName")

    //the overriden function is implicitly open from the abstract keyword
    override fun bestSellingPrice() : Double = 129.9
}