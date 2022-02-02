package javacode;

import java.util.ArrayList;
import java.util.List;

public class JavaGenerics {

    public static void main(String ... args){
        List<String> list = new ArrayList<>();
        list.add("foo");
        list.add("bar");
        //list.add(7) // compile time error
    }
}
