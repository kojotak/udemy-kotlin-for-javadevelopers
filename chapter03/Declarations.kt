package chapter03

typealias EmployeeSet = Set<Employee>

fun main(args: Array<String>) {
    //val je konstantni promenna (value), muzu priradit hodnotu jen jednou
    val number = 25 //prirazenim hodnoty 25 reknu compileru typ
    val number2: Int //deklaruju typ dvojteckou, kdyz zaroven nedelam definici
    val number3: Int = 35 //muzu udelat oboji, ale nikdo to nedela
    val number4: Short = 42 //smysl to dava asi jen u nestandardnich typu jako je short

    //var je zmenitelny (variable)
    var numberV: Int //jen deklarace
    numberV = 10 //definice, prvni prirazeni, fungovalo by i s val
    numberV = 20 //funguje jen u var

    val emp1 = Employee("Lynn", 500)
    emp1.name = "Flynn" //val nezabrani menit obsah
    //emp1 = chapter05.Employee("Tim", 600) //tohle nejde, emp1 je val

    val emp2 : Employee
    if(number < number3){
        emp2 = Employee("Jane", 400)
    }else{
        emp2 = Employee("John", 333)
    }//compiler si pohlida, ze prirazeni do emp2 probehne max jednou

    //StringBuilder //je to 'type alias' - ve skutecnosti se pouzije trida z javy
    val employees: EmployeeSet //muzu si definovat a pouzit vlastni type alias

    val names = arrayListOf("John", "Jame", "Mary") //compiler si domysli, ze to je konstruktor
    println(names[1]) //hranaty zavorky umoznuji pristup podle indexu anebo klice

    //kotlin nerozlisuje mezi checked a unchecked exception

    //v kotlinu neexistuje termarni elvis operator a==b ? c : d, je nahrazen ifem

    //for(i = 0;i<10;i++) // tomuhle Kotlin nerozumi

    //Kotlin nema klicove slovo static (zustal v bytekodu, ale v koltinu neni)

    //Kotlin nema operator new

    val employeeOne = Employee("Mary", 1)
    val employeeTwo = Employee("John", 2)
    val employeeThree = Employee("John", 2)

    println(employeeOne == employeeTwo)     //false
    println(employeeTwo == employeeThree)   //true -> lisi se od javy !!!
    println(employeeOne.equals(employeeTwo))//false
    println(employeeTwo.equals(employeeThree))//true
    //v Kotlinu operator == ve skutecnosti vola equals
    //takze se v Kotlinu volani equals vubec nepouziva
    //a kdyz chci to co v jave je ==, pouziji ===
    println(employeeOne === employeeTwo)     //false
    println(employeeTwo === employeeThree)   //false

    //misto operator | se pouziva or, misto & se pouziva and

    //casting
    val something: Any = employeeThree
    if(something is Employee){
        //is misto instanceof
        val newEmp = something as Employee //udela pretypovani
    }

    //smartcasting
    if(something is Employee){
        val n = something.name //Kotlin po testu povazuje something jako chapter05.Employee
    }

    val change = 4.22
    //kdyz string template nechci, musi se vyescapovat znak $
    println("To show the value of change: \$change is $change")

    //triple quoted strings - nemusim v nich nic escapovat
    val filePath = """c:\path\to\somewhere"""
    //da se pouzivat jako viceradkovy string
    val nurseryRhyme = """Humpty dumpty sat on the wall
        |Humpty Dumpty had a great fall
    """.trimMargin() //orizne zacatky radku pro hezke formatovani
}

class Employee(var name: String, val id: Int){
    //funkcim ve tride rikame metody

    override fun equals(obj: Any?) : Boolean {
        if(obj is Employee){
            //simple and naive
            return name==obj.name && id == obj.id
        }
        return false
    }

    override fun toString(): String {
        //string template: do $ se dosadi dane atributy
        return "chapter05.Employee(name=$name, id=$id)"
    }

}