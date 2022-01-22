package challenges.ch3.kotlincode

class KRoadBike(
    cadence: Int,
    speed: Int,
    gear: Int,

    // In millimetres
    //val... because in java, it's final (without setter)
    val tireWidth: Int
) : KBicycle(cadence, speed, gear){

    override fun printDescription() {
        super.printDescription()
        println("The road bike has a tire width of $tireWidth MM")
    }
}