package com.java8.lambda.functionalinterface;

/**
 * Functional interfaces have only one abstract method header
 * it can have:
 *      multiple default methods
 *      multiple static methods
 */

@FunctionalInterface
public interface MyFunctionalInterface {

    void run();

    default void firstDefault(){
        System.out.println("First Default method!");
    }

    default void secondDefault(){
        System.out.println("Second Default method!");
    }

    static void firstStaticMethod(){
        System.out.println("First static method!");
    }
}
