package challenges.ch3.kotlincode

import challenges.ch3.javacode.JBicycle

class RoadBike(
    cadence: Int,
    speed: Int,
    gear: Int,
    // In millimetres
    val tireWidth: Int
) : JBicycle(cadence, speed, gear)