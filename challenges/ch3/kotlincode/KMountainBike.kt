package challenges.ch3.kotlincode

class KMountainBike(
    //var... we are adding new property and we have getter and setter in java
    var seatHeight: Int,

    //cadence, speed and gear are passed to super class
    cadence: Int,
    speed: Int,
    gear: Int = 10
) : KBicycle(cadence, speed, gear){

    override fun printDescription() {
        super.printDescription()
        println("The mountain bike has a seat height of $seatHeight inches")
    }

    //add color as new property using secondary constructor
    constructor(seatHeight: Int, cadence: Int, speed: Int, gear: Int = 10, color: String):
        this(seatHeight, cadence, speed,gear){
        println("This is color $color")
    }

    companion object {
        val availableColors = listOf("blue", "red", "green", "black", "yellow")
    }
}