package chapter09;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class JavaCar {

    private String color;
    private String model;
    private int year;

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

    @Override
    public String toString() {
        return "JavaCar{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
