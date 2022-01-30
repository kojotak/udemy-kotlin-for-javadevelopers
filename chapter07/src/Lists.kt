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

    val array = arrayOf("black","white","green")
    val colorList = listOf(array)
    println(colorList)//[[Ljava.lang.String;@70177ecd] - zabaleny pole

    val ints = intArrayOf(1,2,3)
    println(ints.toList())//[1, 2, 3]
}