package com.example.demo;

public class MyInterface_MyInterface1Impl implements MyInterface,MyInterface1 {


    public static void main(String[] args){
MyInterface m1 = new MyInterface_MyInterface1Impl();
m1.myCalculation();

MyInterface1 m2 = new MyInterface_MyInterface1Impl();
m2.add(2,3);

    }

    @Override
    public void display() {

    }
}
