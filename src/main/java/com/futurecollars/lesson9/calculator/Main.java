package com.futurecollars.lesson9.calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean runApp = true;
        boolean correctOption;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Insert sign operation you want to perform ( 0 - terminate the calculator ) ");
            String option;
            do {
                option = scanner.nextLine();
            } while (option == null || option.isEmpty());
            correctOption = true;
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
                Operation operation = null;
                Calculator calculator = new Calculator();
                switch (option) {
                    case "+": {
                        operation = new Addition();
                        break;
                    }
                    case "-": {
                        operation = new Subtraction();
                        break;
                    }
                    case "*": {
                        operation = new Multiplication();
                        break;
                    }
                    case "/": {
                        operation = new Division();
                        break;
                    }
                    default: {
                        correctOption = false;
                        System.out.println("Option entered incorrectly");
                        break;
                    }
                }
                if (correctOption) {
                    System.out.println("Result: " + calculator.runCalculator(operation, numbers) + "\n");
                }
            }
        } while (runApp);
    }

}
