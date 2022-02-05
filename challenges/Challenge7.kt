package challenges

import challenges.ch7.Box
import challenges.ch7.Paper
import challenges.ch7.Person
import challenges.ch7.Regular

fun main(ars: Array<String>){

    val joe = Person("Joe", "Jones", 45)
    val (fName, lName, age) = joe
    println("$fName, $lName, $age")

    val jane = Person("Jane", "Smith", 12)
    val mary = Person("Mary", "Wilson", 70)
    val john = Person("John", "Adams", 32)
    val jean = Person("Jean", "Smithson", 66)

    //create immutable map: lastName-> person instance
    val immutableMap = listOf(joe, jane, mary, john, jean)
        .map { it.firstName to it }
        .toMap()

    //how many people has last name starting with 's'
    println( immutableMap.filter { it.value.lastName.startsWith("S") }.count())//2

    //create list of pairs: firstName -> lastName
    val listOfNames = immutableMap.map { Pair(it.value.firstName, it.value.lastName) }
    println(listOfNames)//[(Joe, Jones), (Jane, Smith), (Mary, Wilson), (John, Adams), (Jean, Smithson)]

    //print out: Joe is 45 years old,... using receivers
    immutableMap.also {//we can uset apply with this
        it.map { println("${it.value.firstName} is ${it.value.age} old") }
    }

    val list1 = listOf(1,4,9,15,33)
    val list2 = listOf(4,55,-83,15,22,101)
    //make third list with all matching items, that is 4 and 15
    println( list1.filter { list2.contains(it) }) //[4, 15]

    var regularPaper = Box<Regular>()
    var paper = Box<Paper>()
    paper = regularPaper//fix to type mismatch>
    //we need to declare Box as covariant: class Box<out T>
    //instead of: class Box<T>


}