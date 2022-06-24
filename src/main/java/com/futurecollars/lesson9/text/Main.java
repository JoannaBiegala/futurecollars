package com.futurecollars.lesson9.text;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert text: ");
        String text = scanner.nextLine();

        TextChecker textChecker = new TextChecker();
        if (textChecker.hasCharacters(text)) {
            System.out.println("Is palindrome: " + (textChecker.isPalindrome(text)));
            System.out.println("Length: " + text.length());
        } else {
            System.out.println("Text hasn't any character");
        }
    }
}
