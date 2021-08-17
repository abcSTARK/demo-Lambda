package com.example.LambdaProject;

public interface MyInterface1 {
    default int add(int x , int y){
        return (x+y);
    }

    String toString();

}
