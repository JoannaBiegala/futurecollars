package com.futurecollars.lesson14.task5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {

    private static final String regexUpperCaseLetter = "[A-Z]+";
    private static final String regexDigit = "\\d+";
    private static final String regexYear = "(21)+";

    public static boolean validatePassword(String password) {
        if (password.length() < 7) {
            return false;
        } else if (!checkRegex(password, regexUpperCaseLetter)) {
            return false;
        } else if (!checkRegex(password, regexDigit)) {
            return false;
        } else return !checkRegex(password, regexYear);
    }

    private static boolean checkRegex(String password, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.find();
    }

}
