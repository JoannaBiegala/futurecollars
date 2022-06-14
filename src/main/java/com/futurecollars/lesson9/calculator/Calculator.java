package com.futurecollars.lesson9.calculator;

public class Calculator {

    public String runCalculator(int option, int... numbers) {
        switch (option) {
            case 1:
                return String.valueOf(add(numbers));
            case 2:
                return String.valueOf(subtract(numbers));
            case 3:
                return String.valueOf(multiply(numbers));
            case 4:
                return String.valueOf(divide(numbers));
            default:
                return "Option entered incorrectly";
        }
    }

    private static int add(int... numbers) {
        int sum = 0;
        for (int number : numbers){
            sum += number;
        }
        return sum;
    }

    private static int subtract(int... numbers) {
        int difference = numbers[0];
        for (int index = 1; index < numbers.length; index++) {
            difference -= numbers[index];
        }
        return difference;
    }

    private static int multiply(int... numbers) {
        int product = 1;
        for (int number : numbers) {
            product *= number;
        }
        return product;
    }

    private static int divide(int... numbers) {
        int quotient = numbers[0];
        for (int index = 1; index < numbers.length; index++) {
            quotient = (numbers[index] != 0) ? quotient / numbers[index] : 0;
        }
        return quotient;
    }

}



