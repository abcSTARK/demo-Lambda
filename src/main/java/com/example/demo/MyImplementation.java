package com.example.demo;

public class MyImplementation implements One,Two{
    @Override
    public void display() {

    }

    @Override
    public int myCalculation(int x, int y) {
        //return One.super.myCalculation(x, y);
        //return Two.super.myCalculation(x, y);
        //return (x+y -300);
        int ans1= One.super.myCalculation(x, y);
        int ans2= Two.super.myCalculation(x, y);
        return ans1+ans2;


    }

    public static void myMethod(){
        System.out.println("Child imp");

    }
    public static void main (String [] args){
        Two t = new MyImplementation();
        int  ans = t.myCalculation(10,10);
        System.out.println(ans);
        Two.myMethod();

        MyImplementation.myMethod();
    }
}
