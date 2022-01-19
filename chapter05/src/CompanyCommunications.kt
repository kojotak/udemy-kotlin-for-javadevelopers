import java.time.Year

fun main(ars: Array<String>){
    println(CompanyCommunications.getTagLine())
    println(CompanyCommunications.getCopyrightLine())
    println(SomeClass.SOME.accessPrivateVar())
}

//no class keyword here
//can extend other interfaces
object CompanyCommunications {

    //no constructor, there will be only one instance, nobody can create other instance

    val currentYear = Year.now().value

    fun getTagLine() = "Our company rocks!"

    fun getCopyrightLine() = "Copyright $currentYear blah blah"
}

class SomeClass {

    //how to access "equivalent java static" properties?
    companion object SOME {//SOME is optional name, the default is "Companion"
        //everything in companion object is "static"
        private val privateVar = 6
        fun accessPrivateVar(){
            println("I'm accessing privateVar:  + $privateVar")
        }
    }

}