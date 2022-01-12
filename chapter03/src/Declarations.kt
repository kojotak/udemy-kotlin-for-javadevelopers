fun main() {
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
    //emp1 = Employee("Tim", 600) //tohle nejde, emp1 je val

    val emp2 : Employee
    if(number < number3){
        emp2 = Employee("Jane", 400)
    }else{
        emp2 = Employee("John", 333)
    }//compiler si pohlida, ze prirazeni do emp2 probehne max jednou
}

class Employee(var name: String, val id: Int){ }