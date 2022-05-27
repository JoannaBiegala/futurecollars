package com.futurecollars.lesson7;

public class BaseEmployee {
    private static final int basicSalaryValue = 3000;
    protected String firstName;
    protected String lastName;
    protected int basicSalary;
    protected int yearOfEmployment;

    public BaseEmployee(String firstName, String lastName, int yearOfEmployment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.basicSalary = basicSalaryValue;
        this.yearOfEmployment = yearOfEmployment;

    }

    public BaseEmployee(String firstName, String lastName, int basicSalary, int yearOfEmployment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.basicSalary = basicSalary;
        this.yearOfEmployment = yearOfEmployment;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }

    public int getYearOfEmployment() {
        return yearOfEmployment;
    }


    @Override
    public String toString() {
        return "BaseEmployee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", basicSalary=" + basicSalary +
                ", yearOfEmployment=" + yearOfEmployment +
                '}';
    }

    public int getYearsOfWork() {
        int yearNow = java.time.LocalDate.now().getYear();
        return yearNow - this.getYearOfEmployment();
    }

    public int calculateMonthlySalary() {

        return this.getBasicSalary();
    }
}
