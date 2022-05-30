package com.futurecollars.lesson7;

import java.time.LocalDate;

public abstract class BaseEmployee {
    private static final int defaultSalary = 3000;
    String firstName;
    String lastName;
    int basicSalary;
    int yearOfEmployment;

    public BaseEmployee(String firstName, String lastName, int yearOfEmployment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.basicSalary = defaultSalary;
        this.yearOfEmployment = yearOfEmployment;

    }

    public BaseEmployee(String firstName, String lastName, int basicSalary, int yearOfEmployment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.basicSalary = basicSalary;
        this.yearOfEmployment = yearOfEmployment;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public int getYearOfEmployment() {
        return yearOfEmployment;
    }

    public int getYearsOfWork() {
        return LocalDate.now().getYear() - this.getYearOfEmployment();
    }

    public abstract int calculateMonthlySalary();

}
