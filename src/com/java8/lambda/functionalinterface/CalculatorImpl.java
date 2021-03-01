package com.java8.lambda.functionalinterface;

//public class CalculatorImpl implements Calculator {
//    @Override
//    public void switchOn() {
//        System.out.println("Switched On!");
//    }
//}

public class CalculatorImpl {

    public static void main(String[] args){
        Calculator calculator = () -> System.out.println("Switched On!");
        calculator.switchOn();
    }
}
