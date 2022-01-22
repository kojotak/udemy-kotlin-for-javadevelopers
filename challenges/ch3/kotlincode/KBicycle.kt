package challenges.ch3.kotlincode

open class Bicycle(var cadence: Int, var speed: Int, var gear: Int) {

    fun applyBrake(decrement: Int) {
        speed -= decrement
    }

    fun speedUp(increment: Int) {
        speed += increment
    }
}