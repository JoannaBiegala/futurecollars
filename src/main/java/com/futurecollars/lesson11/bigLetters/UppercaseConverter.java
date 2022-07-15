package com.futurecollars.lesson11.bigLetters;

import org.junit.platform.commons.util.StringUtils;

public class UppercaseConverter {

    String convertToUppercase(String text) {
        return (StringUtils.isBlank(text)) ? "" : text.toUpperCase();
    }

}
