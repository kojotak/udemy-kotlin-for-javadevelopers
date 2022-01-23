

fun main(args: Array<String>){

    //ranges: the numbers are inclusive
    //types: it has to be comparable
    val range = 1..5
    val charRange = 'a'..'z'
    val stringRange = "ABD".."XYZ"

    println(3 in range) //true
    println('q' in charRange) //true
    println("CCC" in stringRange) //true
    println("CCCCC" in stringRange) //true
    println("ZZZ" in stringRange) //false - koncime u XYZ

    println("backward range...")
    val backwardRange = 5.downTo(1)
    val r = 5..1 //obracene poradi
    println(5 in r) //false - protoze prvni je 1
    println(5 in backwardRange) //true - protoze je pozpatku
    val stepRange = 3..15
    val stepThree = stepRange.step(3) //only for numeric ranges
    val reversedRange = range.reversed()


}