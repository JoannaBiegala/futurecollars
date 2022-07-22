package com.futurecollars.lesson14.task6;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {

    public static int calculateAge(LocalDate birthDate) {
        Period period = Period.between(birthDate, LocalDate.now());
        return period.getYears();
    }

}