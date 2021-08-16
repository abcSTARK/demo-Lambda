package com.example.lambda;

import java.util.Locale;

@FunctionalInterface
public interface MyLambda3 {
    void calculate(Employee emp);
}

class MyLambdaImpl3{
    public static void main(String[] args){
        MyLambda3 m = (arg) ->{
            System.out.println(arg);
        };

        m.calculate(new Employee(1,"Aniruddha"));

        data((e)-> {
            e.setEmpName(e.getEmpName().toUpperCase());
            System.out.println(e.toString());

        },new Employee(1,"Aniruddha"));

        data((e)-> {
            e.setEmpName(e.getEmpName().toLowerCase());
            System.out.println(e.toString());

        },new Employee(1,"Aniruddha"));

    }
static void data (MyLambda3  m , Employee emp){
        m.calculate(emp);
}


}

