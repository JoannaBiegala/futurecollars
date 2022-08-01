package com.futurecollars.lesson14.task5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter password");
        String password = scanner.next();
        System.out.println("The password is good - " + PasswordValidator.validatePassword(password));
    }

}
