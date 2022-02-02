import java.math.BigDecimal

fun main(ars: Array<String>){

    val mixedList: List<Any> = listOf("string", 1, BigDecimal(3.14), "fooBar", BigDecimal(10))
    val bigDecimalOnly = getElementsOfType<BigDecimal>(mixedList)
    for(item in bigDecimalOnly){
        print("$item ")//3.140000000000000124344978758017532527446746826171875 10
    }
    println()

    val stringsOnly = getElementsOfType<String>(mixedList)
    for(item in stringsOnly){
        print("$item ")//string fooBar
    }
}

//fun <T> getElementsOfType(list: List<Any>): List<T> {
//    var newList: MutableList<T> = mutableListOf()
//    for(el in list){
//        if(el is T){//compiler error here, type erasure will replace T
//            newList.add(el)
//        }
//    }
//    return newList
//}
//there is one workaround - reified parameter and make function inline
inline fun <reified T> getElementsOfType(list: List<Any>): List<T> {
    var newList: MutableList<T> = mutableListOf()
    for(el in list){
        if(el is T){//compiler error here, type erasure will replace T
            newList.add(el)
        }
    }
    return newList
}