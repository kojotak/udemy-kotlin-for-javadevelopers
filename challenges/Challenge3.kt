package challenges

fun main(args: Array<String>){

    //declare two immutable strings 'Hello'
    val hello1 = "Hello"
    val hello2 = "Hello"

    println(hello1 === hello2) //print referential equal

    println(hello1 == hello2)  //print structurally equal

    //declare mutable variable
    var number = 2988

    //declare immutable variable of type Any and cast it to upper cased string
    val anyString : Any = "The any type is the root of Kotlin class hierarchy"
    if(anyString is String){
        println( anyString.toUpperCase())
    }

    //oneliner to print:
    //     1
    //    11
    //   111
    //  1111
    val oneliner = """
    |     1
    |    11
    |   111
    |  1111   
    """.trimMargin()
    println(oneliner)
}