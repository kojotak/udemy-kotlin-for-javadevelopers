fun main(ars: Array<String>){

    //mutable list is invariant
    //...but list is covariant... see the source code
    val shortList : MutableList<Short> = mutableListOf(1,2,3,4,5)
    convertToInt(shortList)

}

//short is subclass of number
//what about types?
//MutableList<Short> vs MutableList<Number>?
fun convertToInt(collection: MutableList<Number>){
    for(num in collection){
        print("${num.toInt()} ")
    }
    println()
}

fun waterGarden(garden: Garden<Flower>){

}

fun tendGarden(roseGarden: Garden<Rose>){
    //if: class Garden<T: Flower> //without the <out T:Flower>
    //Type mismatch. Required: Garden<Flower> Found: Garden<Rose>
    waterGarden(roseGarden)
}

open class Flower{}
class Rose: Flower(){}

//out - make this type parameter covariant
class Garden<out T: Flower>(val sample: T,//sample can not be var - it has to be (immutable) as val, because is declared as out
            private var something:T //although we can use var, if it is private and nobody can change it
    ){
    // => constructors are always covariant (but the class can not have setter)

    val flowers: List<T> = listOf()

    fun pickFlower(i: Int):T = flowers[i]

    //fun plantFlower(flower: T) {   }//Type parameter T is declared as 'out' but occurs in 'in' position in type T
}