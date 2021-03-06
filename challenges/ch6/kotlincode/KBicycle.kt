package challenges.ch6.kotlincode

open class KBicycle(var cadence: Int, var speed: Int, var gear: Int = 10) {

    //cadence, speed and gear are not private - we want to access them

    fun applyBrake(decrement: Int) {
        speed -= decrement
    }

    fun speedUp(increment: Int) {
        speed += increment
    }

    open fun printDescription() {
        println(
            "Bicycle is in gear $gear with cadence of $cadence travelling at a speed of $speed."
        )
    }
}