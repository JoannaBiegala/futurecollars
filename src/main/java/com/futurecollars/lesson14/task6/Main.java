package com.futurecollars.lesson14.task6;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day of birth \"RRRR-MM-DD\"");
        String dateOfBirthString = scanner.next();
        LocalDate dateOfBirth = LocalDate.parse(dateOfBirthString, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println("Age: " + AgeCalculator.calculateAge(dateOfBirth));
        System.out.println("Day of week: " + DayOfWeekOfBirthCalculator.calculateDayOfBirth(dateOfBirth));
        System.out.println("Week of year: " + WeekOfYearOfBirthCalculator.calculateWeekOfYearOfBirth(dateOfBirth));
    }

}
