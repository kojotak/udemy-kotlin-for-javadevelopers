

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

    println("for loops...")
    for(i in range){
        print("$i ") //1 2 3 4 5
    }
    println()
    for(n in stepRange){
        print("$n ") //3 4 5 6 ... 14 15
    }
    println()
    for(n in stepThree){
        print("$n ") //3 6 9 12 15
    }
    println()
    for(n in reversedRange){
        print("$n ") //5 4 3 2 1
    }
    for(i in 1..3){
        print("$i ") //shorthand: 1 2 3
    }
    println("iterating strings...")
    //for(s in stringRange) //nejde, pro stringy potrebujeme iterator
    for(c in "hello world"){//muzeme ale for-cyklovat string
        print("$c ") //h e l l o  w o r l d
    }
    println()
    for(num in 1..10 step 4){
        print("$num ")//1 5 9 (skacu po 4 od 1 do 10)
    }
    println()
    for(i in 20 downTo 10 step 5){
        print("$i ")//20 15 10
    }
    println()
    //kdyz chci neco preskocit/vynechat
    for(i in 1 until 10){
        print("$i ") //1 2 ... 8 9 - bez 10
    }
    println()
}