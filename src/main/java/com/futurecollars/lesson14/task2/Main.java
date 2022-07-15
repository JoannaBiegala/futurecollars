package com.futurecollars.lesson14.task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter PESEL");
        String pesel = scanner.next();
        if (PeselValidator.isPeselValid(pesel)){
            System.out.println("PESEL is correct");
        }
        else {
            System.out.println("PESEL is incorrect");
        }
    }

}