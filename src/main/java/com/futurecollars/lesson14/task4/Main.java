package com.futurecollars.lesson14.task4;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> numbers = NumbersReader.readNumbersFromFile();
        NumbersValidator validateNumbers = new NumbersValidator();
        validateNumbers.validateNumbersByPatternsInteger(numbers);
        validateNumbers.validateNumbersByPatternsFloat(numbers);
        validateNumbers.validateNumbersByPatternsScientific(numbers);
    }

}
