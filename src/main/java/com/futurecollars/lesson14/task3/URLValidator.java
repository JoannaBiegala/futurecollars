package com.futurecollars.lesson14.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class URLValidator {

    String[] URLs;

    public URLValidator(String[] URLs) {
        this.URLs = URLs;
    }

    public void validateURLs() {
        Pattern REGEX = Pattern.compile("^https?://\\S*.\\S*(.\\S)?");
        for (String url : URLs) {
            Matcher matcher = REGEX.matcher(url);
            if (matcher.matches()) {
                System.out.println(matcher.group() + " is correct");
            } else {
                System.out.println("URL: " + url + " is not correct");

            }
        }
    }

}
