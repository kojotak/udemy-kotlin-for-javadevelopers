package challenges.ch9;

public class MainJava {

    public static void main(String...args){
        fixKotlinCode();
        fixJavaCode();
    }

    //make this code compile only by modifying KotlinCode
    private static void fixKotlinCode(){
        KotlinStuff.sayHelloToJava("student"); //add @file:JvmName

        Emp emp = new Emp("John", "Smith", 2010);
        emp.startYear = 2009; //change val to var and add @JvmField

        Challenge.doMath(5, 4); //doMath is not static yet, add @JvmStatic

        emp.takesDefault("arg1"); //parameters mismatch, second parameter is optional in Kotlin
    }

    //make this code compile only by modifying java code...
    private static void fixJavaCode(){
        KotlinCode2Kt.sayHelloToJava2("student");

        Emp2 emp = new Emp2("John", "Smith", 2010);
        emp.setStartYear(2009);

        Challenge2.INSTANCE.doMath(5, 4);

        //emp.takesDefault("arg1"); //we can not fix this in java code
    }
}
