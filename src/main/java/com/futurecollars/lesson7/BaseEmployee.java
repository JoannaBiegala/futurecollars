package com.futurecollars.lesson7;

import java.time.LocalDate;

public abstract class BaseEmployee {
    private static final int DEFAULT_SALARY = 3000;
    private final String firstName;
    private final String lastName;
    private final int basicSalary;
    private final int yearOfEmployment;

    protected BaseEmployee(String firstName, String lastName, int basicSalary, int yearOfEmployment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.basicSalary = basicSalary;
        this.yearOfEmployment = yearOfEmployment;
    }

    protected BaseEmployee(String firstName, String lastName, int yearOfEmployment) {
        this(firstName, lastName, DEFAULT_SALARY, yearOfEmployment);
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

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

}
