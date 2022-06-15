package com.futurecollars.lesson7;

import java.time.LocalDate;

public abstract class BaseEmployee {
    private static final int DEFAULT_SALARY = 3000;
    private final String firstName;
    private final String lastName;
    private int basicSalary;
    private final int yearOfEmployment;

    protected BaseEmployee(String firstName, String lastName, int yearOfEmployment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfEmployment = yearOfEmployment;
        setBasicSalary(DEFAULT_SALARY);
    }

    protected BaseEmployee(String firstName, String lastName, int basicSalary, int yearOfEmployment) {
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

    protected abstract int calculateMonthlySalary();

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }

}
