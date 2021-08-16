package com.example.lambda;

@FunctionalInterface
public interface MyLambda {
    void calculate();

}
class MyLambdaImpl {
    public static void main(String [] args){
        MyLambda m = new MyLambda() {
            @Override
            public void calculate() {
                System.out.println("I am from Inner Class");
            }
        };
        m.calculate();

        MyLambda m1=()->{System.out.println("I am from Lambda");};
        m1.calculate();
    }
}
