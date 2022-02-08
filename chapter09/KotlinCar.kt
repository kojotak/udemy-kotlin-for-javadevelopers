@file:JvmName("StaticCar")

package chapter09

fun topLevel() = println("I am top level function in car file")

class KotlinCar(val color: String, @JvmField val model: String, val year: Int) {
}

//example extension function
fun String.extendedPrint() {
    println(this)
}