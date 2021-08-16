package com.example.lambda;
@FunctionalInterface
public interface MyLambda2 {
    int calculate(int x, int y);
}
class MyLambdaImpl2{
    public static void main(String args[]){
        MyLambda2 m =(x,y)->{
            int ans=x-y;
            return ans;
        };
        System.out.println("ans:-"+m.calculate(12,78));

        MyLambda2 m1 = (x,y) -> x+y;
        System.out.println("ans:-"+m1.calculate(12,78));
    }
}
