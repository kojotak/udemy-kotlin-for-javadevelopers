fun main(ars: Array<String>){

    //kolekce jsou kovariantni

    val strings = listOf("spring", "summer", "fall", "winter") //mutable list as in java
    println(strings.javaClass)//class java.util.Arrays$ArrayList

    val emptyList = emptyList<String>()
    println(emptyList)//[]

    //println(emptyList[0]) //IndexOutOfBoundsException

    val notNullList = listOfNotNull("hello", null, "world")
    println(notNullList) // hello world, null is skipped

    val arrayList = arrayListOf(1,2,4)
    println(arrayList.javaClass)//class java.util.ArrayList

    val mutableList = mutableListOf<Int>(1,2,3)
    println(mutableList)//[1, 2, 3]

    val array = arrayOf("black","white","green","blue")
    val colorList = listOf(array)
    println(colorList)//[[Ljava.lang.String;@70177ecd] - zabaleny pole

    val ints = intArrayOf(1,2,3)
    println(ints.toList())//[1, 2, 3]

    println(strings.asReversed())
//    if(strings.size > 5){
//        println(strings[5])
//    }
    println(strings.getOrNull(5)) //null

    println(array.zip(strings))//creates pair elements: [(black, spring), (white, summer), (green, fall), (blue, winter)]

    val mergedLists = listOf(colorList, strings)
    println(mergedLists)//[[[Ljava.lang.String;@70177ecd], [spring, summer, fall, winter]]

    val combinedList = colorList + strings
    println(combinedList)//[[Ljava.lang.String;@70177ecd, spring, summer, fall, winter]

    println(strings.union(strings))//[spring, summer, fall, winter]

    println(arrayOf("a","a","a","a").distinct())//odstrani duplicity [a]
}