package com.futurecollars.lesson9.fizzBuzz;

public class TextCreator {

    String getText(int number) {
        String text = (number % 3 == 0) ? "Fizz" : "";
        text = (number % 5 == 0) ? text + "Buzz" : text;
        text = (text.length() == 0) ? String.valueOf(number) : text;
        return text;
    }

    String getTextForNumbers(int range) {
        String text = "";
        for (int number = 1; number <= range; number++) {
            text = (number == 1) ? getText(number) : text + " " + getText(number);
        }
        return text;
    }

}
