package com.futurecollars.lesson9.fizzBuzz;

public class TextCreator {

    private static final String SEPARATOR = " ";

    public String addFizz(int number) {
        String text = (number % 3 == 0) ? "Fizz" : "";
        return text;
    }

    public String addBuzz(int number, String textOfNumber) {
        String text = (number % 5 == 0) ? textOfNumber + "Buzz" : textOfNumber;
        return text;
    }

    public String addNumber(int number, String textOfNumber) {
        String text = (textOfNumber.length() == 0) ? String.valueOf(number) : textOfNumber;
        return text;
    }

    String getTextForNumbers(int range) {
        String text = "";
        for (int number = 1; number <= range; number++) {
            String textOfNumber = addFizz(number);
            textOfNumber = addBuzz(number, textOfNumber);
            textOfNumber = addNumber(number, textOfNumber);
            text = (number == 1) ? textOfNumber : text + SEPARATOR + textOfNumber;
        }
        return text;
    }

}
