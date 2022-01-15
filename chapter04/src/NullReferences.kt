fun main(args: Array<String>){

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

    val something: Any = arrayOf(1,2,3,4)
    val str4 = something as? String //cast safe operator - pretypuje pokud sedi typ
    println(str4) //vypise null
}