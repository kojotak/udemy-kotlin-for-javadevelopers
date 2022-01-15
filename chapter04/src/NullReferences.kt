fun main(args: Array<String>){

    //////// PART 1

    //val str: String = null //chyba, to v Kotlinu nejde
    val str: String? = null //otaznik = muze byt null
    val str2: String? = "foo bar"
    //str2.toUpperCase() //nejde, muze byt null
    if(str2 !=null){
        str2.toUpperCase() //ted uz jde, compiler vi, ze neni null
    }
    //safe call operator
    str?.toUpperCase() //zkraceny zapis s ifem - provede se jen pokud neni null

    println("what happens with null? ${str?.toUpperCase()}")//vypise null
    //je to tedy zkratka pro:
    //if(str == null) { null } else { str.toUpperCase() }

    val str3 = str ?: "This is the default value" //elvis operator, ma jiny vyznam v Kotlinu
    println(str3)
    //je to zkratka pro
    //if(str2 == null) { str3 = "..." } else {str3 = str2}

    //tip: ?.operator?.se?.da?.retezit takze se nemusi vnorovat if-else bloky

    //////// PART 2

    val something: Any = arrayOf(1,2,3,4)
    val str4 = something as? String //cast safe operator - pretypuje pokud sedi typ
    println(str4) //vypise null

    //not null assertion
    val str5 = str3!!.toUpperCase() //!! jsem si jisty ze neni null, muze spadnout pokud to tak neni
    //je to zkratka pro
    //if(str3 == null) { throw Exception } { str3.toUpperCase() }

    //nullTest() //zkusime vyvolat NPE

    val strTest: String? = "This is not null"
    //printText(strTest) //compiler nedovoli, protoze je strTest to deklarovany jako mozny null
    printText(strTest!!) //!! je zde vhodny zpusob jak "potlacit" nullovost z deklarace strTest
    str?.let{ printText(it) } //alternativni zpusob, co dela to same

    val strTest4: String? = null
    val anotherStr = "This isn't nullable"
    println(strTest4 == anotherStr) //false, ale zde se neprovede equals

}

fun nullTest(){
    val nullStr: String? = null
    val nullStr2 = nullStr!!  //tady vylitne vyjimka
    val nullStr3 = nullStr2.toUpperCase() //sem se to vubec nedostane
}

fun printText(text: String){
    println(text)
}