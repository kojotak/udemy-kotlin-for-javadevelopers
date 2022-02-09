import java.math.BigDecimal

fun main(ars: Array<String>){

    val list = mutableListOf("Foo","Bar")
    list[0].toUpperCase() //Kotlin knows it is string
    //printCollection(list)
    list.printCollection()

    val bdList = mutableListOf(BigDecimal(42), BigDecimal(3.14), BigDecimal(1000000))
    //printCollection(bdList)
    bdList.printCollection()
}

//<T> type parameter declaration
//fun <T> printCollection(collection: List<T>){
//    for(item in collection){
//        print("$item ")
//    }
//    println()
//}
//we can use extension function instead
fun <T> List<T>.printCollection(){
    for(item in this){
        print("$item ")
    }
    println()
}