package com.example.LambdaProject;

public interface Two {
    void display();
    default int myCalculation(int x , int y){
        return (x-y+100);
    }

    static void myMethod(){
        System.out.println("I am from static");

    }


}
