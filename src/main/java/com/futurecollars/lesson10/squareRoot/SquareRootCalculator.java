package com.futurecollars.lesson10.squareRoot;

public class SquareRootCalculator {

    public static double calculateSquareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be >= 0: " + number);
        }
        return Math.sqrt(number);
    }

}
