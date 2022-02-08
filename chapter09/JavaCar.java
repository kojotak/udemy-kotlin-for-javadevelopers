package chapter09;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class JavaCar {

    private String color;
    private String model;
    private int year;
    private Object anObject;

    public JavaCar(String color, String model, int year) {
        this.color = color;
        this.model = model;
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public @Nullable String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    //jetbrains annotation - only for Idea IDE
    public void setColor(@NotNull String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Object getAnObject() {
        return anObject;
    }

    public void setAnObject(Object anObject) {
        this.anObject = anObject;
    }

    public static String getStaticX(){
        return "X";
    }

    @Override
    public String toString() {
        return "JavaCar{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    public void variableMethod(int num, String...strings){
        for(String str : strings){
            System.out.println("" + num + " - " + str);
        }
    }

    public static void main(String... args){
        StaticCar.topLevel();//I am top level function in car file

        //! but we can not call Kotlin's extension funcion String.extendedPrint

        KotlinCar car = new KotlinCar("blue","BMW", 2020);
        System.out.println(car);//chapter09.KotlinCar@6d311334
        System.out.println(car.model); //BMW, because    @JvmField
        System.out.println(car.getColor()); //blue - generated getter
        System.out.println(KotlinCar.carComp());//i am companion fun
    }
}
