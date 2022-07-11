package com.futurecollars.lesson9.calculator;

public class Calculator {

    private final Operation[] operations;

    public Calculator(Operation[] operations) {
        this.operations = operations;
    }

    public int runCalculator(String sign, int... numbers) {
        for (Operation operation : operations) {
            if (sign.equals(operation.getSign())) {
                return operation.calculate(numbers);
            }
        }
        return 0;
    }

}



