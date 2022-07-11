package com.futurecollars.lesson9.calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Operation[] operations = {new Addition(), new Subtraction(), new Multiplication(), new Division()};
        Calculator calculator = new Calculator(operations);
        boolean runApp = true;
        Scanner scanner = new Scanner(System.in);
        String option;
        int[] numbers = new int[0];
        do {
            System.out.println("Insert sign operation you want to perform ( 0 - terminate the calculator ) ");
            do {
                option = scanner.nextLine();
            } while (option == null || option.isEmpty());
            if (option.equals("0")) {
                runApp = false;
                System.out.println("The calculator has stopped working");
            } else {
                System.out.println("How many numbers do you want to operate on: ");
                int range = scanner.nextInt();
                numbers = new int[range];
                for (int index = 0; index < range; index++) {
                    System.out.println("Insert number: ");
                    numbers[index] = scanner.nextInt();
                }
            }
            System.out.println("Result: " + calculator.runCalculator(option, numbers) + "\n");
        } while (runApp);
    }

}
