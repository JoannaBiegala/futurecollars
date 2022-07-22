package com.futurecollars.lesson9.calculator;

public class Subtraction implements Operation {

    @Override
    public int calculate(int... numbers) {
        int difference = numbers[0];
        for (int index = 1; index < numbers.length; index++) {
            difference -= numbers[index];
        }
        return difference;
    }

    @Override
    public char getSign() {
        return '-';
    }

}
