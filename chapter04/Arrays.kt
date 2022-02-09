import chapter04.javaCode.Dummy
import java.math.BigDecimal

fun main(args: Array<String>){

    val names = arrayOf("John", "Jane", "James") //compiler si odvodi, ze jsou to stringy
    val longs = arrayOf(1L, 2L, 3L) //i longy si compiler odvodi
    val ints = arrayOf(1, 2, 3) //defaultni typ pro cisla je integer

    println(ints is Array<Int>) //true

    println(names[2]) //James - indexovani jako v jave

    val evenNumbers = Array(16) { i->i*2} //pocatecni kapacita 16
    evenNumbers.forEach { n -> print(" $n" ) } //0 2 ... 28 30
    println()

    val zeros = Array(100){0} //100x 0

    //mixing types
    val mixedArray = arrayOf("hello", 22, BigDecimal(10.5), 'a')
    mixedArray.forEach {  x->print(" $x") }
    println()

    //val myIntArray = arrayOf(42, 657, 987, 6668)
    val myIntArray = intArrayOf(42, 657, 987, 6668)
    Dummy().printNumbers(myIntArray)//musime pretypovat, predat Array<Int> do javy nejde

    //val sizeOf5 = Array<Int>(5) //nejde, pletlo by se s vytvorenim jednoprvkohove pole
    val sizeOf5 = IntArray(5) //u primitivniho pole to jde

    //jak prevedu obecne pole na primitivni pole?
    Dummy().printNumbers(evenNumbers.toIntArray())

    //jde to obracene, vytvorit obecne pole z primitivniho?
    val convertedIntArray: Array<Int> = myIntArray.toTypedArray()

}