fun main(args: Array<String>){

    val immutableMap = mapOf<Int,Car>(
        1 to Car("green","Toyota", 2015),
        2 to Car("red","Ford", 2018),
        3 to Car("silver","Honda", 2013),
        17 to Car("red","BMW", 2015),
        8 to Car("green","Ford", 2010),
    )
    println(immutableMap.filter { it.value.model=="Ford" }.map{it.value.color})//[red, green]
    //creates one intermediate collection between filter and map

    //sequence...something like stream, because not all JVM support java 8
    //sequence is never ending

    println(immutableMap.asSequence().filter { it.value.model =="Ford" }.map { it.value.color })//kotlin.sequences.TransformingSequence@7daf6ecc

    listOf("Joe","Marry","Jane")
        .asSequence()
        .filter { println("Xfiltering $it"); it[0]=='J' }
        .map{println("Xmapping $it"); it.toUpperCase() }//nothing, without terminal operation

    listOf("Joe","Marry","Jane")
        .asSequence()
        .filter { println("filtering $it"); it[0]=='J' }
        .map{println("mapping $it"); it.toUpperCase() }
        .toList()//this is a terminal operation, it will run and print everything
    //Marry is not mapped, it is mapped out - it's faster with sequence than wihout


}