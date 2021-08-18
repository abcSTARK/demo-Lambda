package com.example.functional;

@FunctionalInterface
public interface MyFunctional {
    void data();

    //void myNewMethod();

    default int add(int x){
        return 10;
    }
    default int add(int x, int y){
        return x+y;
    }

    static void display(){ };

}

class MyDemo implements MyFunctional{

    @Override
    public void data() {
        System.out.println("data");
    }
    public static void main(String [] args){

    }
}
