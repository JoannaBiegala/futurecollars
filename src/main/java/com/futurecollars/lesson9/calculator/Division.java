package com.futurecollars.lesson9.calculator;

public class Division implements Operation {

    @Override
    public int calculate(int... numbers) {
        int quotient = numbers[0];
        for (int index = 1; index < numbers.length; index++) {
            quotient = (numbers[index] != 0) ? quotient / numbers[index] : 0;
        }
        return quotient;
    }

    @Override
    public char getSign() {
        return '/';
    }

}
