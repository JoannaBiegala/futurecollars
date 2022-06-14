package com.futurecollars.lesson9.calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean runApp = true;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Insert what operation you want to perform: ");
            System.out.println(" 1 - add; 2 - subtract; 3 - multiply; 4 - divide");
            System.out.println(" 0 - terminate the calculator \n");
            int option = scanner.nextInt();
            if (option == 0) {
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
                Calculator calculator = new Calculator();
                System.out.println("Result: " + calculator.runCalculator(option, numbers) + "\n");
            }
        } while (runApp);

    }

}
