package com.futurecollars.lesson14.task6;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class DayOfWeekOfBirthCalculator {

    public static String calculateDayOfBirth(LocalDate birthDate) {
        DayOfWeek dayOfWeek = birthDate.getDayOfWeek();
        return dayOfWeek.getDisplayName(TextStyle.FULL, Locale.ENGLISH);
    }

}
