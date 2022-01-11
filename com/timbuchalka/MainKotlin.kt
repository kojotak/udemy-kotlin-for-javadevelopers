package com.timbuchalka

fun main(args:Array<String>){

    val locations = readLocationInfo()
    var loc = 64

    while(true){
        val location = locations[loc] ?: LocationKotlin(0,"Sorry, something went wrong, exiting...")

        println(location.description)

        if(location.locationID ==0){
            break
        }

        print("Available exits are: ")
        location.exits.keys.forEach{
            print("$it, ")
        }

        val direction = readLine()?.toUpperCase() ?: "X" //X je fiktivni hodnota, co nemuze nastat
        if(location.exits.containsKey(direction)){
            loc = location.exits[direction]!! // !! znamena, ze urcite vim, ze to neni null
        } else {
            println("You can not go in that direction")
        }

    }
}