package com.futurecollars.lesson9.calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Operation[] operations = {new Addition(), new Subtraction(), new Multiplication(), new Division()};
        Calculator calculator = new Calculator(operations);
        calculator.runCalculator();
    }

}
