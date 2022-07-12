package com.futurecollars.lesson15.task1;

import java.util.stream.IntStream;

public class NumbersDivisibleByThree {

    public static void filterNumbersDivisibleByThree(int rangeFrom, int rangeTo) {
        IntStream intStream = IntStream.range(rangeFrom, rangeTo);
        intStream
                .filter(num -> num % 3 == 0)
                .forEach(System.out::println);

    }

}
