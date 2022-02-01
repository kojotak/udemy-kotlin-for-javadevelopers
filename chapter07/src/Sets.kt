fun main(args: Array<String>){

    //linkedhashset intance under the hood

    val setInts = setOf(10,15,19,5,3,-22)
    println(setInts.plus(20))//[10, 15, 19, 5, 3, -22, 20]
    println(setInts.plus(10))//[10, 15, 19, 5, 3, -22]  because 10 is duplicated
    println(setInts.minus(19))//[10, 15, 5, 3, -22]
    println(setInts.average())//5.0
    println(setInts.drop(3))//[5, 3, -22]

    val mutableInts = mutableSetOf(1,2,3,4,5)
    println(mutableInts.plus(10))//[1, 2, 3, 4, 5, 10]
    println(mutableInts)//[1, 2, 3, 4, 5] !
}