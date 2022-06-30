package com.futurecollars.lesson14.task2;

import java.util.regex.Pattern;

public class PeselValidator {

    public static boolean isPeselValid(String pesel) {
        Pattern pattern = Pattern.compile("\\d{11}");
        return pattern.matcher(pesel).matches();
    }

}
