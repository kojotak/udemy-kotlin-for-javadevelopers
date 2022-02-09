@file:JvmName("KotlinStuff")

package challenges.ch9

fun sayHelloToJava(name: String){
    println("Kotlin says hello world to java and $name")
}

object Challenge{
    @JvmStatic  fun doMath(x: Int, y: Int) = (x + y) * (x - y)
}

class Emp(val firstName : String, val lastName: String, @JvmField var startYear: Int){

    @JvmOverloads fun takesDefault(par1: String, par2: String = "default"){
        println("$par1 and $par2")
    }
}