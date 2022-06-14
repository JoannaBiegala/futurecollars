package com.futurecollars.lesson10.pesel;


import java.util.Scanner;

public class PeselValidator {

    boolean validatePesel() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert PESEL: ");
        String pesel = scanner.nextLine();
        for (int index = 0; index < pesel.length() - 1; index++) {
            try {
                Integer.parseInt(pesel.substring(index, index + 1));
            } catch (NumberFormatException e) {
                new WrongTypeOfDataException(pesel);
                return false;
            }
        }
        if (pesel.length() != 11) {
            new IllegalLengthException(pesel.length());
            return false;
        }

        return true;
    }

    private static class IllegalLengthException {

        public IllegalLengthException(int length) {
            System.out.println("IllegalLengthException{" +
                    "length=" + length + '}');
        }

    }

    private static class WrongTypeOfDataException {

       public WrongTypeOfDataException(String pesel) {
            System.out.println("WrongTypeOfDataException{" +
                    "pesel=" + pesel + '}');

        }

     }

}
