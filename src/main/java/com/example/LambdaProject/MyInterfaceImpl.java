package com.example.LambdaProject;

public class MyInterfaceImpl implements MyInterface{
    @Override
    public void display() {

    }

    @Override
    public void myCalculation() {
        MyInterface.super.myCalculation();
        System.out.println(" i am from child");
    }
    public static void main(String args[]){
        MyInterface m =new MyInterfaceImpl();
        m.myCalculation();
    }
}
