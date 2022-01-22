package challenges

import challenges.ch3.kotlincode.*

fun main(args: Array<String>){

    val bicycle = KBicycle(80, 20, 15)
    val road = KRoadBike(70, 15, 4, 18)
    val mountain = KMountainBike(5, 90, 30, 21)

    bicycle.printDescription()
    road.printDescription()
    mountain.printDescription()
}