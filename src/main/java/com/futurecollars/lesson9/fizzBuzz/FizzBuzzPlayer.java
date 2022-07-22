package com.futurecollars.lesson9.fizzBuzz;

public class FizzBuzzPlayer {

    private static final String SEPARATOR = " ";

    public String createFizzBuzzText(int range) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int number = 1; number <= range; number++) {
            stringBuilder.append(addFizz(number));
            stringBuilder.append(addBuzz(number));
            stringBuilder.append(addNumber(number));
            if (number != range) {
                stringBuilder.append(SEPARATOR);
            }
        }
        return stringBuilder.toString();
    }

    String addFizz(int number) {
        return (number % 3 == 0) ? "Fizz" : "";
    }

    String addBuzz(int number) {
        return (number % 5 == 0) ? "Buzz" : "";
    }

    String addNumber(int number) {
        if ((number % 3 != 0) && (number % 5 != 0)) {
            return String.valueOf(number);
        }
        return "";
    }

}
