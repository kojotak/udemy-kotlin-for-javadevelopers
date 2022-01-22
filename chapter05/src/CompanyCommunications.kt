import java.time.Year

fun main(ars: Array<String>){
    topLevel("I'm private")
    println(CompanyCommunications.getTagLine())
    println(CompanyCommunications.getCopyrightLine())
    println(SomeClass.SOME.accessPrivateVar())

    val s1 = SomeClass.justAssign("foo bar")
    val s2 = SomeClass.upperOrLoweCase("foo bar", false)
    println(s1.someString)
    println(s2.someString)

    wantsSomeInterface(object: SomeInterface{
        override fun mustImplement(num: Int) = "This is from anonymous object $num"
    })

    println(Department.IT.getInfo())
}

fun topLevel(str: String) = println("Top level function: $str")

//no class keyword here
//can extend other interfaces
object CompanyCommunications {

    //no constructor, there will be only one instance, nobody can create other instance

    val currentYear = Year.now().value

    fun getTagLine() = "Our company rocks!"

    fun getCopyrightLine() = "Copyright $currentYear blah blah"
}

class SomeClass private constructor(val someString: String) {

    //how to access "equivalent java static" properties?
    companion object SOME {//SOME is optional name, the default is "Companion"
        //everything in companion object is "static"
        private val privateVar = 6
        fun accessPrivateVar(){
            println("I'm accessing privateVar:  + $privateVar")
        }

        //these are in fact (static) factory methods...

        fun justAssign(str: String) = SomeClass(str) //has expression body
        fun upperOrLoweCase(str: String, lowerCase:Boolean): SomeClass { //has block body
            if(lowerCase){
                return SomeClass(str.toLowerCase())
            }else{
                return SomeClass(str.toUpperCase())
            }
        }
    }
}

interface SomeInterface {
    fun mustImplement(num: Int):  String
}

fun wantsSomeInterface(si: SomeInterface){
    println("Printing from wantsSomeInterface ${si.mustImplement(42)}")
}

//need class keyword here
enum class Department(val fullName: String, val numOfEmps: Int) {
    HR("human resources", 5),
    IT("information technology", 10),
    SALES("sales", 15)

    ; //! need semicolumn here for the following fun...

    fun getInfo() = "The $fullName has $numOfEmps employees"
}
