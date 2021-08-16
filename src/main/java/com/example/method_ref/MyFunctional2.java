package com.example.method_ref;

import java.util.function.Predicate;

@FunctionalInterface
public interface MyFunctional2 {

    Integer myMethod(int a,int b);

}

class DemoFunction{
    public Integer demoMethod(Integer a , Integer b){
        return a+b+100;
    }
    static void myDemo(Predicate<Integer> predicate, Integer value){
        System.out.println("The result is : "+ predicate.test(value));
    }
    public static void main(String args[]){
        MyFunctional2 m =(a,b)->{return a+b;};
        System.out.println(m.myMethod(12,12));

        DemoFunction d=new DemoFunction();
        MyFunctional2 m1=(a, b) ->{
            return d.demoMethod(a,b);
        };

        System.out.println(m1.myMethod(100,100));

        System.out.println("********Using Method Ref.***********");
        MyFunctional2 m2=d::demoMethod;
        System.out.println(m2.myMethod(500,500));

        Predicate<Integer> predicate = d::demoTest;
        System.out.println("Predicate : "+predicate.test(90));

        myDemo(d::demoTest,200);
        myDemo((value)->value%2==0,303);

    }
    public boolean demoTest(Integer a){
        return a>100;
    }
    public boolean demoTest1(Integer a){
        return a==100;
    }

}