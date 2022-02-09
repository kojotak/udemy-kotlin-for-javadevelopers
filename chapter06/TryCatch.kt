import java.lang.NumberFormatException

fun main(ars: Array<String>){
    println(getNumber("42"))  //42
    println(getNumber("4.2")) //0 instead of number format exception
    println( getNull() ?: "I can not print the result")
    notImplementedYet("zzz")
}

fun notImplementedYet(something: String) : Nothing {
    throw IllegalArgumentException("Implement me!")
}

fun getNull(): Int? = null

fun getNumber(str: String) : Int{
    return try{
        Integer.parseInt(str)
    } catch( e: NumberFormatException){
        0
    } finally {
        println("finally")
        1 //this one will be ignored
    }
}