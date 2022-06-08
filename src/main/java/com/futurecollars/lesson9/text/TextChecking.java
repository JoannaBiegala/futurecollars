package com.futurecollars.lesson9.text;

import java.util.Scanner;

public class TextChecking {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj tekst: ");
        String text = scanner.nextLine();
        if (hasTextCharacters(text))
            System.out.println("Tekst \"" + text + "\" zawiera jakiekolwiek znaki");
        else
            System.out.println("Tekst nie zawiera żadnych znaków");
        if (isTextPalindrome(text))
            System.out.println("Tekst \"" + text + "\" jest palindromem");
        else
            System.out.println("Tekst \"" + text + "\" nie jest palindromem");

        System.out.println("Tekst \"" + text + "\" ma długość " + getLengthOfText(text));
    }

    public static boolean hasTextCharacters(String text) {
        return text != null && !text.isEmpty();
    }

    public static boolean isTextPalindrome(String text) {
        boolean isPalindrome = false;
        if (hasTextCharacters(text)) {
            isPalindrome = true;
            for (int i = 0; i < text.length() / 2; i++) {
                if (text.charAt(i) != text.charAt(text.length() - i - 1)) {
                    isPalindrome = false;
                    break;
                }
            }
        }
        return isPalindrome;
    }

    public static int getLengthOfText(String text) {
        return hasTextCharacters(text) ? text.length() : 0;
    }
}
