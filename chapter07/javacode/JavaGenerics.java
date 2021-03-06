package javacode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaGenerics {

    public static void main(String ... args){
        List<String> list = new ArrayList<>();
        list.add("foo");
        list.add("bar");
        //list.add(7) // compile time error

        //type erasure
        List<String> strings = Arrays.asList("foo", "bar");
        System.out.println("is list of string? " + (strings instanceof List<String>) );//true !
    }
}
