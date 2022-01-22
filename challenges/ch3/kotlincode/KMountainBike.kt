package challenges.ch3.kotlincode

import challenges.ch3.javacode.JBicycle

class JMountainBike(
    var seatHeight: Int,
    cadence: Int,
    speed: Int,
    gear: Int
) : KBicycle(cadence, speed, gear)