@file:JvmName("StaticCar")

package chapter09

fun topLevel() = println("I am top level function in car file")

class KotlinCar {
}

//example extension function
fun String.extendedPrint() {
    println(this)
}