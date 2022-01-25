package challenges

fun main(ars: Array<String>){

    //print 5,10,...5000
    for(i in 5..5000 step 5){
        print("$i ")
    }
    println()

    //negative range
    for(i in -500..0){
        print("$i ")
    }
    println()

    //first 15 numbers fibonacci: 0,1,1,2,3,5,...
    val fibonacci = Array(15){0}
    fibonacci[1]=1
    for(i in 2 until fibonacci.size){
        fibonacci[i] = fibonacci[i-1] + fibonacci[i-2]
    }
    fibonacci.forEach { print("$it ") }

    //skipped the last two "challenges"
}