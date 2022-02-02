import java.lang.Appendable

fun main(ars: Array<String>){

    val ints = listOf(1,2,3,4,5)
    val shorts:List<Short?> = listOf(10,20,30,40) //can be null
    val floats:List<Float> = listOf(3.14f, 42.42f, 2.87f)
    val strings:List<String> = listOf("foo","bar")

    convertToInt(ints)  //1 2 3 4 5
    convertToInt(shorts)//10 20 30 40
    convertToInt(floats)//3 42 2
    //convertToInt(strings)//compile error

    append(StringBuilder("foo"), StringBuilder("bar"))//result is foobar

    //printCollection is from Generics.kt
    ints.printCollection()//1 2 3 4 5
    shorts.printCollection()//10 20 30 40

    /////// type erasure
    if(strings is List<String>){
        println("this list contains strings")//this list contains strings
    }

    var listAny: Any = listOf("foo","bar")
    //if(listAny is List<String>){ } //compiler does not allow to check this

    //star projection syntax
    if(listAny is List<*>){//nemuzu dat 'strings is List" bez typu, tak tam dam hvezdicku
        println("yes, this is a list...")

        //listAny = listOf(1,2,3)//lass java.lang.Integer cannot be cast to class java.lang.String

        val strList = listAny as List<String>
        println(strList[0].toUpperCase())//FOO
    }
}

//bounded parameter - Numbers only, but can be null
//if you want "whatever non nullable type" - use <T: Any>
fun <T: Number?> convertToInt(collection: List<T>){
    for(num in collection){
        print("${num?.toInt()} ")
    }
    println()
}

fun <T> append(first: T, second: T)
    where T: CharSequence, T: Appendable{
        println("result is ${first.append(second)}")
    }