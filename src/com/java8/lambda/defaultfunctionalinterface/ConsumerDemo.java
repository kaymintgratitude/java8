package com.java8.lambda.defaultfunctionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args){
        Consumer<Integer> consumer = integer -> System.out.println(String.format("Printing :%d", integer));
        consumer.accept(3000);

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        integerList.stream().forEach(consumer);
        integerList.stream().forEach(t -> System.out.println(String.format("Printing Lamba: %d", t)));
    }
}
