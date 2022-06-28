package com.futurecollars.lesson9.calculator;

import java.util.Scanner;

public class Calculator {

    private final Operation[] operations;

    public Calculator(Operation[] operations) {
        this.operations = operations;
    }

    public void runCalculator() {
        boolean runApp = true;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Insert sign operation you want to perform ( 0 - terminate the calculator ) ");
            String option;
            do {
                option = scanner.nextLine();
            } while (option == null || option.isEmpty());
            if (option.equals("0")) {
                runApp = false;
                System.out.println("The calculator has stopped working");
            } else {
                System.out.println("How many numbers do you want to operate on: ");
                int range = scanner.nextInt();
                int[] numbers = new int[range];
                for (int index = 0; index < range; index++) {
                    System.out.println("Insert number: ");
                    numbers[index] = scanner.nextInt();
                }
                Calculator calculator = new Calculator(operations);
                System.out.println("Result: " + runOperation(option, numbers) + "\n");
            }
        } while (runApp);
    }

    public int runOperation(String sign, int... numbers) {
        for (Operation operation : operations) {
            if (sign.equals(operation.getSign())) {
                return operation.calculate(numbers);
            }
        }
        return 0;
    }

}



