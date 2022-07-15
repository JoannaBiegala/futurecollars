package com.futurecollars.lesson10.pesel;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PeselValidator {

    boolean validatePesel() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert PESEL: ");
        String pesel = scanner.nextLine();
        if (!Pattern.matches("[0-9]+", pesel)) {
            throw new WrongTypeOfDataException(pesel);
        }
        if (pesel.length() != 11) {
            throw new IllegalLengthException(pesel.length());
        }
        return true;
    }

}
