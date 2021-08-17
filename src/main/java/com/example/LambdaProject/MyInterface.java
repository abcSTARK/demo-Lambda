package com.example.LambdaProject;

public interface MyInterface{
    void display();
    default void myCalculation(){
        int x= 10;
        System.out.println("def method");
    }

}