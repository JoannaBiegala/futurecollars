package com.futurecollars.lesson10.pesel;

public class IllegalLengthException extends IllegalArgumentException {

    public IllegalLengthException(int length) {
        super("Input number should be contains 11 digits {" +
                "length=" + length + "}");
    }

}
