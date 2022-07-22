package com.futurecollars.lesson16.task4;

import java.util.stream.IntStream;

public class Main {

    private static final int RANGE = 10;

    public static void main(String[] args) {
        Runnable firstTask = () -> System.out.println("Average "+ RANGE + " numbers is: " +
            IntStream
                    .range(0, RANGE)
                    .average()
                    .getAsDouble()
        );

        Runnable secondTask = () -> System.out.println("Sum "+ RANGE + " numbers is: " +
                IntStream
                        .range(0, RANGE)
                        .sum()
          );

        Thread firstThread = new Thread(firstTask);
        Thread secondThread = new Thread(secondTask);

        firstThread.start();
        secondThread.start();
    }

}
