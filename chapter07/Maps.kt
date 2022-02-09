fun main(args: Array<String>){
    val immutableMap = mapOf<Int,Car>(
        1 to Car("green","Toyota", 2015),
        2 to Car("red","Ford", 2016),
        3 to Car("silver", "Honda", 2013)
    )
    println(immutableMap.javaClass) //class java.util.LinkedHashMap
    println(immutableMap) //{1=Car(color=green, model=Toyota, year=2015), 2=Car(color=red, model=Ford, year=2016), 3=Car(color=silver, model=Honda, year=2013)}

    val mutableMap = mutableMapOf<String,Car>(
        "John's car" to Car("red", "Range rover", 2010),
        "Jane's car" to Car("blue", "Mazda", 2012)
    )
    mutableMap.put("Mary's car", Car("red", "Corvetter", 1965))
    println(mutableMap.javaClass)//class java.util.LinkedHashMap
    println(mutableMap)//{John's car=Car(color=red, model=Range rover, year=2010), Jane's car=Car(color=blue, model=Mazda, year=2012), Mary's car=Car(color=red, model=Corvetter, year=1965)}

    val pair = Pair(10, "spades")
    val (firstValue, secondValue ) = pair //desctructuring - create a pair of variables from one instance
    println("desctructuring: $firstValue - $secondValue")//desctructuring: 10 - spades

    for( (key,value) in mutableMap ){
        println("map $key: $value") //vypise hezky celou mapu
    }

    //component function - what class needs for destructuring
    val car = Car("blue", "BMW", 1959)
    //val (cc,mm,yy) = car // we can not... yet, because car has to implement component function
    val bmw = BetterCar("blue", "BMW", 1959)
    val (color,model,year) = bmw
    println("car: $color $model from $year")//car: blue BMW from 1959
}

class Car(val color:String, val model:String, val year: Int){}

data //we don't need to declare component functions for data classes
class BetterCar(val color:String, val model:String, val year: Int){
//    operator fun component1() = color
//    operator fun component2() = model
//    operator fun component3() = year
}