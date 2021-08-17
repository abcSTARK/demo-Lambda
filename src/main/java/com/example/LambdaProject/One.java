package com.example.LambdaProject;

public interface One {
    void display();
    default int myCalculation(int x , int y){
        return (x+y);
    }
}
