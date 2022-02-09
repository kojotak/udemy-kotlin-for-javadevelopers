fun main(ars: Array<String>){

    val cars1 = mutableListOf(XCar(), XCar())
    val cars2: MutableList<XCar> = mutableListOf()
    copyCars(cars1, cars2)

    val fords1 = mutableListOf(Ford(), Ford())
    val fords2: MutableList<Ford> = mutableListOf()
    copyCars(fords1, fords2)

    //fun <T> copyCars(source:MutableList<T>, destination: MutableList<T>){
    //copyCars(fords1, cars1) //can not compile
    //Type mismatch. Required: Ford Found: XCar
    //T has to be the same

    copyCars(fords1, cars1)//now it compiles, we used site-variant by marking source:MutableList<out T>

    //we can mark destination: MutableList<in T>
    //...but we don't need it
}

fun <T: XCar> copyCars(source:MutableList<out T>, destination: MutableList<T>){
    for(car in source){
        destination.add(car)
    }
}

open class XCar {}
class Toyota: XCar(){}
class Ford: XCar(){}
