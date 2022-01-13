fun main(args: Array<String>){
    var myInt = 10 //integer
    var myLong = 42L //long
    var anotherLong: Long = 42

    //Kotlin automaticky nerozsiruje typ
    //myLong = myInt //tohle nejde, musime explicitne prevest jako:
    myLong = myInt.toLong()

    val myByte: Byte = 111
    var myShort: Short
    myShort = myByte.toShort() //opet musim prevest

    val myFloat = 830.30F
    val char = 'x'
    //val myChar: Char = 65 //nejde, v jave by to bylo velke pismeno E
    val myBoolean = true

    //prevod typu z Kotlinu do Javy...
    //...nemusim delat nic, oboji se kompiluje do stejneho byte kodu
    val vacation = false;
    val status = Dummy().isVacationTime(vacation)
    println(status)

    //specialni tridy v Kotlinu:
    val anything: Any //muzu sem pouzit cokoliv
    val nothing: Nothing //sem se neda nic priradit
    //unit... bude vysvetleno pozdeni

}