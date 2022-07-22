package com.futurecollars.lesson11.numbers;

public class SumOfDigitsCounter {

    public int addDigitsOfNumber(int number) {
        int sumOfDigits = 0;

        while (number > 0) {
            sumOfDigits += number % 10;
            number = number / 10;
        }
        return sumOfDigits;
    }

}