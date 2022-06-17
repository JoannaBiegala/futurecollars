package com.futurecollars.lesson9.fizzBuzz;

public class FizzBuzzTextCreator {

    private static final String SEPARATOR = " ";

    String addFizz(int number) {
        return (number % 3 == 0) ? "Fizz" : "";
    }

    String addBuzz(int number) {
        return (number % 5 == 0) ? "Buzz" : "";
    }

    public String createFizzBuzzText(int range) {
        String text = "";
        for (int number = 1; number <= range; number++) {
            String textOfNumber = addFizz(number);
            textOfNumber += addBuzz(number);
            if (textOfNumber.length() == 0) {
                textOfNumber = String.valueOf(number);
            }
            text += (number == 1) ? textOfNumber : SEPARATOR + textOfNumber;
        }
        return text;
    }

}
