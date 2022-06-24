package com.futurecollars.lesson10.DivideBy3Eexception;

public class DivisionValidator {
    public static void validate(int[] values) {
        for (int value : values) {
            try {
                if (value % 3 != 0) {
                    throw new IllegalArgumentException("The number " + value + " is not divisible by 3");
                } else {
                    System.out.println("The number " + value + " is divisible by 3");
                }
            } catch (IllegalArgumentException illegalArgumentException) {
                System.out.println(illegalArgumentException.toString());
            }
        }
    }
}
