public class SomeJClass {

    private static int privateVar = 6;

    public static void main(String[] args){
        new SomeJOtherClass().someOtherMethod();
    }

    public static void accessPrivateVar(){
        System.out.println("I'm accessing privateVar: " + privateVar);
    }
}
