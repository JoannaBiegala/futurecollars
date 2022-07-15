package com.futurecollars.lesson10.pesel;

public class WrongTypeOfDataException extends IllegalArgumentException {

    public WrongTypeOfDataException(String text) {
        super("Input text should be contains only digits {" +
                text + "}");

    }

}
