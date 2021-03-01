package com.java8.lambda.defaultfunctionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args){
        Predicate<Integer> predicate = (integer) -> integer % 2 == 0;
        System.out.println(predicate.test(10));

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        integerList.stream().filter(predicate).forEach(t-> System.out.println(String.format("Result: %b", t)));
    }
}
