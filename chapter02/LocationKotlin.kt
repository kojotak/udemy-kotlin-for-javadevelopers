package chapter02

import java.util.HashMap


class LocationKotlin(val locationID: Int, val description: String) {
    val exits: MutableMap<String, Int>

    init {
        exits = HashMap()
        exits["Q"] = 0
    }

    fun addExit(direction: String, location: Int) {
        exits[direction] = location;
    }
}