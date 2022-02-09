fun main(args: Array<String>){

    val setInts = setOf(10,15,19,5,3,-22)
    println(setInts.filter{ it % 2 != 0})//[15, 19, 5, 3] - jenom liche

    val immutableMap = mapOf<Int,Car>(
        1 to Car("green","Toyota", 2015),
        2 to Car("red","Mazda", 2018),
    )
    println(immutableMap.filter { it.value.year==2018 })//{2=Car@b1bc7ed}

    val mutableMap = mutableMapOf<Int,Car>(
        1 to Car("green","Toyota", 2015),
        2 to Car("red","Mazda", 2018),
    )
    println(mutableMap.filter { it.value.year==2018 })//{2=Car@7cd84586}

    val ints = arrayOf(1,2,3,4,5)
    val add20list: MutableList<Int> = mutableListOf()
    for(i in ints){
        add20list.add(i + 20)
    }
    println(add20list)//[21, 22, 23, 24, 25]
    //shorthand:
    val add10list = ints.map{ it +10 }
    println(add10list)//[11, 12, 13, 14, 15]
    println(add10list.javaClass)//class java.util.ArrayList

    println(immutableMap.map{ it.value.year })//[2015, 2018]

    //we can chain map and filter
    println(immutableMap.filter { it.value.model == "Mazda" }.map { it.value.color } )//[red]

    println(immutableMap.any{ it.value.year>2014}) //true

    println(immutableMap.count{ it.value.year>2014}) //2

    val cars = immutableMap.values
    println(cars.find{it.year > 2014})//find first car with year > 2014

    println(cars.groupBy { it.color })//{green=[Car@4edde6e5], red=[Car@b1bc7ed]}
}