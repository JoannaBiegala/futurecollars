package com.futurecollars.lesson14.task5;

import java.util.regex.Pattern;

public class PasswordValidator {
    private static final String REGEX = "^((?!21).)*((\\S*[A-Z]+\\S*\\d+)|(\\S*\\d+\\S*[A-Z]+\\S*)).{7,}$";
    private static final Pattern pattern = Pattern.compile(REGEX);

    public static boolean validatePassword(String password) {
        return pattern.matcher(password).matches();
    }

}
