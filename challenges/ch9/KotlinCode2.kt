package challenges.ch9

fun sayHelloToJava2(name: String){
    println("Kotlin says hello world to java and $name")
}

object Challenge2{
    fun doMath(x: Int, y: Int) = (x + y) * (x - y)
}

class Emp2(val firstName : String, val lastName: String, var startYear: Int){

    fun takesDefault(par1: String, par2: String = "default"){
        println("$par1 and $par2")
    }
}