package chapter06

import java.math.BigDecimal

fun main(ars: Array<String>){

    var num = 100

    when(num){ // no breaks as in java, only one branch can be executed
        100, 600 -> println("100 or 600") //we can match multiple values by comma
        in 101..199 -> println("on hundred and something") //ranges
        200 -> println("200")
        300 -> println("300")
        else -> println("does not match anything")
    }

    val y = 10 //we can use expressions
    when(num){ // no breaks as in java, only one branch can be executed
        y + 80 -> println("90")
        y + 90 -> println("100")
        else -> println("does not match anything")
    }

    //object matching
    val obj: Any = "I'm a string"
    val obj2: Any = BigDecimal(3.14)
    val obj3: Any = 45
    val something : Any = obj2
    val z = when(something){ //can assign the result, if all branches are defined (i.e. using else)
        is String -> println("it is a string")
        is BigDecimal -> println("it is a big decimal")
        is Int -> println("it is an int")
        else -> println("I have no idea")
    }
    println(z) //it is a big decimal & kotlin.Unit

    val timeOfYear = Season.WINTER
    val str = when(timeOfYear) {
        Season.SPRING -> "flowers are blooming"
        Season.SUMMER -> "it's hot"
        Season.FALL -> "It's getting cooler"
        Season.WINTER -> {
            num = 22 + 55 //we can do somethinge else... but it's confusing
            "I need a coat"
        }
        //does not need else, all possible values were covered
    }
    println(str) //I need a coat
}

enum class Season {
    SPRING, SUMMER, FALL, WINTER
}