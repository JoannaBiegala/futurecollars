package com.futurecollars.lesson14.task6;

import java.time.LocalDate;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class WeekOfYearOfBirthCalculator {

    public static int calculateWeekOfYearOfBirth(LocalDate birthDate) {
        return birthDate.get(WeekFields.of(Locale.ENGLISH).weekOfYear());
    }

}
