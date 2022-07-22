package com.futurecollars.lesson11.lenghtOfText.lengthOfText;

import org.junit.platform.commons.util.StringUtils;

public class LengthCalculator {

    int getLengthOfText(String text) {
        return StringUtils.isNotBlank(text) ? text.length() : 0;
    }

}
