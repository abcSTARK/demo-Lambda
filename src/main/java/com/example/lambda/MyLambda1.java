package com.example.lambda;
@FunctionalInterface
public interface MyLambda1 {
    //void calculate(int x);
    void calculate(int x,int y);
}

abstract class MyLambda1Impl implements MyLambda1{
    public static void main(String[] args){
        MyLambda1 m = (arg1,arg2)->{
            int ans = arg1+arg2;
            System.out.println("ans:-"+ans);
        };
        m.calculate(12,12);
    }

}
