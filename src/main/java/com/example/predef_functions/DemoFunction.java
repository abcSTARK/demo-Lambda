package com.example.predef_functions;

import java.util.function.Function;

public class DemoFunction {
    public static void main (String[] args){
        Function<String , Integer> function = (name)-> name.length();
        System.out.println(function.apply("SG"));

        Function<String , Boolean> function1 = (name)-> name.equals("SG");
        System.out.println(function1.apply("SG"));
    }
}
