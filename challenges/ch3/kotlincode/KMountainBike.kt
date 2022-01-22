package challenges.ch3.kotlincode

import challenges.ch3.javacode.JBicycle

class JMountainBike(
    //var... we are adding new property and we have getter and setter in java
    var seatHeight: Int,

    //cadence, speed and gear are passed to super class
    cadence: Int,
    speed: Int,
    gear: Int
) : KBicycle(cadence, speed, gear)