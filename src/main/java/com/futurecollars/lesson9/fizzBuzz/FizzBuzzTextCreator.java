package com.futurecollars.lesson9.fizzBuzz;

public class FizzBuzzTextCreator {

    private static final String SEPARATOR = " ";

    String addFizz(int number) {
        return (number % 3 == 0) ? "Fizz" : "";
    }

    String addBuzz(int number, String textOfNumber) {
        return (number % 5 == 0) ? textOfNumber + "Buzz" : textOfNumber;
    }

    String addNumber(int number, String textOfNumber) {
        return (textOfNumber.length() == 0) ? String.valueOf(number) : textOfNumber;
    }

    public String createFizzBuzzText(int range) {
        String text = "";
        for (int number = 1; number <= range; number++) {
            String textOfNumber = addFizz(number);
            textOfNumber = addBuzz(number, textOfNumber);
            textOfNumber = addNumber(number, textOfNumber);
            text += (number == 1) ? textOfNumber : SEPARATOR + textOfNumber;
        }
        return text;
    }

}
