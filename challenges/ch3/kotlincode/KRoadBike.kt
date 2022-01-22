package challenges.ch3.kotlincode

import challenges.ch3.javacode.JBicycle

class RoadBike(
    cadence: Int,
    speed: Int,
    gear: Int,

    // In millimetres
    //val... because in java, it's final (without setter)
    val tireWidth: Int
) : KBicycle(cadence, speed, gear)