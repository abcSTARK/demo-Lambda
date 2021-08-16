package com.example.predef_functions;

import java.util.function.Consumer;

public class DemoConsumer {
    public static void main(String[] args){
        Consumer<String> consumer = new Consumer<String>(){
            @Override
            public void accept(String t){
                System.out.println("you eneterd :"+ t);
            }

        };
        //Consumer<String>consumer1=(name)->{System.out.println("Welcome to lamda"+ name);};
        //consumer1.accept("SG");

        Consumer<Integer> consumer2 =(value)->{
            if(value>100)
                System.out.println("great");
            else
                System.out.println("it's fine");
        };

        Consumer<Integer> consumer3 =(value)->{
            int ans=value +100;
            System.out.println(ans);
        };

        System.out.println("Using andTHEN");
        Consumer<Integer> consumerAndThen =consumer2.andThen(consumer3);
        consumerAndThen.accept(30);

    }
}
