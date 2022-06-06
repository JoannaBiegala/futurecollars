package com.futurecollars.lesson7;

import java.time.LocalDate;

public abstract class BaseEmployee {
    private static final int defaultSalary = 3000;
    protected final String firstName;
    protected final String lastName;
    protected int basicSalary;
    protected final int yearOfEmployment;

    protected BaseEmployee(String firstName, String lastName, int yearOfEmployment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.basicSalary = defaultSalary;
        this.yearOfEmployment = yearOfEmployment;

    }

    protected BaseEmployee(String firstName, String lastName, int basicSalary, int yearOfEmployment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.basicSalary = basicSalary;
        this.yearOfEmployment = yearOfEmployment;
    }

    protected int getBasicSalary() {
        return basicSalary;
    }

    protected int getYearOfEmployment() {
        return yearOfEmployment;
    }

    protected int getYearsOfWork() {
        return LocalDate.now().getYear() - this.getYearOfEmployment();
    }

    protected abstract int calculateMonthlySalary();

    protected String getFirstName() {
        return firstName;
    }

    protected String getLastName() {
        return lastName;
    }
}
