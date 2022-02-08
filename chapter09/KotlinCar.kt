@file:JvmName("StaticCar")

package chapter09

fun topLevel() = println("I am top level function in car file")

class KotlinCar(val color: String, @JvmField val model: String, val year: Int) {

    companion object {
        @JvmStatic fun carComp() : String = "i am companion fun"
    }

}

object SingletonObject {
    fun doSomething() = println("i am in singleton")
}

//example extension function
fun String.extendedPrint() {
    println(this)
}