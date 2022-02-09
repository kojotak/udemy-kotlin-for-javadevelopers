package challenges.ch9;

public class MainJava {

    //make this code compile only by modifiening KotlinCode
    public static void main(String...args){
        KotlinStuff.sayHelloToJava("student"); //add @file:JvmName

        Emp emp = new Emp("John", "Smith", 2010);
        emp.startYear = 2009; //change val to var and add @JvmField

        Challenge.doMath(5, 4); //doMath is not static yet, add @JvmStatic

        emp.takesDefault("arg1"); //parameters mismatch, second parameter is optional in Kotlin

    }
}
