package com.example.demo;

public interface One {
    void display();
    default int myCalculation(int x , int y){
        return (x+y);
    }
}
