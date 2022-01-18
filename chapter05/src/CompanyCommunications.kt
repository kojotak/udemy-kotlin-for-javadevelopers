import java.time.Year

fun main(ars: Array<String>){
    println(CompanyCommunications.getTagLine())
    println(CompanyCommunications.getCopyrightLine())
}

//no class keyword here
//can extend other interfaces
object CompanyCommunications {

    //no constructor, there will be only one instance, nobody can create other instance

    val currentYear = Year.now().value

    fun getTagLine() = "Our company rocks!"

    fun getCopyrightLine() = "Copyright $currentYear blah blah"
}