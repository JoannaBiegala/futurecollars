package com.futurecollars.lesson10.pesel;

public class Main {

    public static void main(String[] args) {
        if (new PeselValidator().validatePesel()) {
            System.out.println("Pesel is correct");
        }
    }

}
