fun main(ars: Array<String>){

    println(countTo100())

    println(countTo100v2())

    println(countTo100v3())

    println(countTo100v4())
}

fun countTo100(): String{
    val numbers = StringBuilder()
    for(i in 1..99){
        numbers.append(i)
        numbers.append(", ")
    }
    numbers.append(100)//last one
    return numbers.toString()
}

//with je "receiver" object
fun countTo100v2(): String{
    val numbers = StringBuilder()
    return with(numbers) {
        for(i in 1..99) {
            append(i)
            append(", ")
        }
        //this... uvnitr with znamena numbers (v tomto pripade)
        append(100)
        toString() //call toString from numbers
    }
}

//jeste vice zkracene
fun countTo100v3(): String{
    return with(StringBuilder()) {
        for(i in 1..99) {
            append(i)
            append(", ")
        }
        append(100)
        toString()
    }
}

//jeste muzeme pouzit expression body
fun countTo100v4() = with(StringBuilder()) {
    for(i in 1..99) {
        append(i)
        append(", ")
    }
    append(100)
    toString()
}

//jeste muzeme pouzit apply misto with - nefunguje <>
//fun countTo100v5() = StringBuilder.apply(){
//    for(i in 1..99) {
//        append(i)
//        append(", ")
//    }
//    append(100)
//}.toString()