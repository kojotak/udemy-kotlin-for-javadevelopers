package challenges.ch3.kotlincode

class KMountainBike(
    //var... we are adding new property and we have getter and setter in java
    var seatHeight: Int,

    //cadence, speed and gear are passed to super class
    cadence: Int,
    speed: Int,
    gear: Int
) : KBicycle(cadence, speed, gear){

    override fun printDescription() {
        super.printDescription()
        println("The mountain bike has a seat height of $seatHeight inches")
    }
}