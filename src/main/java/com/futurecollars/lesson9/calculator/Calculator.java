package com.futurecollars.lesson9.calculator;

public class Calculator {

    private final Operation[] operations;

    public Calculator(Operation[] operations) {
        this.operations = operations;
    }

    public int runCalculator(char sign, int... numbers) {
        for (Operation operation : operations) {
            if (operation.getSign() == sign) {
                return operation.calculate(numbers);
            }
        }
        throw new IllegalArgumentException();
    }

}



