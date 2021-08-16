package com.example.predef_functions;

import java.util.function.Predicate;

public class DemoPredicate {
    public static void main (String[] args){
        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer>10;
            }
        };
        System.out.println("ans:-" +predicate.test(10));

        Predicate<String> predicate1 = (name)->{
            if(name.length()>10){
                return true;
            }
            return false;
        };

        if(predicate1.test("Societe general")){
            System.out.println("Welcome");
        }
        else{
            System.out.println("try again ");
        }

        Predicate<String> predicate2 = (name)->{
            System.out.println("Checking value");
            return name.equals("Societe general");
        };
/*
        if(predicate2.test("Socgen")){
            System.out.println("matched");
        }
        else{
            System.out.println("not matching");
        }
*/
        Predicate<String> predicateAnd=predicate1.and(predicate2);
        System.out.println("and operator :-"+ predicateAnd.test("Societe general"));

        Predicate<String> predicateOr=predicate1.or(predicate2);
        System.out.println("and operator :-"+ predicateOr.test("Societe general"));

    }

}
