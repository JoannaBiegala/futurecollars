package com.futurecollars.lesson9.calculator;

public class Calculator {

    public int runCalculator(Operation operation, int... numbers) {
        return operation.addOperation(numbers);
    }

}



