package challenges

import challenges.ch3.kotlincode.*

fun main(args: Array<String>){

    val bicycle = KBicycle(80, 20, 15)
    val road = KRoadBike(4,70, 15,18)
    val mountain = KMountainBike(5, 90, 30, 21)

    bicycle.printDescription()
    road.printDescription()
    mountain.printDescription()


    println("now using default gear...")

    val bicycle2 = KBicycle(80, 20)
    val road2 = KRoadBike(3, 70, 15)
    val mountain2 = KMountainBike(5, 90, 30)

    bicycle2.printDescription()
    road2.printDescription()
    mountain2.printDescription()
}