package challenges.ch3.kotlincode

open class KBicycle(var cadence: Int, var speed: Int, var gear: Int) {

    //cadence, speed and gear are not private - we want to access them

    fun applyBrake(decrement: Int) {
        speed -= decrement
    }

    fun speedUp(increment: Int) {
        speed += increment
    }
}