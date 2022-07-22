package com.futurecollars.lesson15.task1;

import java.util.stream.IntStream;

public class NumberOperations {

    public static void printNumbersDivisibleByThree(int rangeFrom, int rangeTo) {
        IntStream
                .range(rangeFrom, rangeTo)
                .filter(num -> num % 3 == 0)
                .forEach(System.out::println);

    }

}
