package com.futurecollars.lesson14.task5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {
    private static final String REGEX = "^((?!21).)*((\\S*[A-Z]+\\S*\\d+)|(\\S*\\d+\\S*[A-Z]+\\S*)).{7,}$";

    static boolean validatePassword(String password) {
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(password);
         return matcher.matches();
    }

}
