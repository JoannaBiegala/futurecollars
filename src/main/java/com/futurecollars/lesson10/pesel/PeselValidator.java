package com.futurecollars.lesson10.pesel;


import java.util.Scanner;
import java.util.regex.Pattern;

public class PeselValidator {

    boolean validatePesel() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert PESEL: ");
        String pesel = scanner.nextLine();
        if (!Pattern.matches("[0-9]+",pesel)) {
             throw new WrongTypeOfDataException(pesel);
        }
        if (pesel.length() != 11) {
            throw new IllegalLengthException(pesel.length());
         }

        return true;
    }

    private static class IllegalLengthException extends IllegalArgumentException {

        public IllegalLengthException(int length) {
            super("IllegalLengthException{" +
                    "length=" + length + "}");
        }
    }

    private static class WrongTypeOfDataException extends IllegalArgumentException{

       public WrongTypeOfDataException(String text) {
            System.out.println("Input text should be contains only digits {" +
                     text + '}');

        }

     }

}
