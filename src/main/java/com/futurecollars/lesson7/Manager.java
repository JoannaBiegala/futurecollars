package com.futurecollars.lesson7;

public class Manager extends BaseEmployee {

    private static final int DEFAULT_SALARY = 5000;
    private static final int DEFAULT_BONUS = 500;
    private int bonus;

    public Manager(String firstName, String lastName, int yearOfEmployment) {
        super(firstName, lastName, DEFAULT_SALARY, yearOfEmployment);
        this.bonus = DEFAULT_BONUS;
    }

    public Manager(String firstName, String lastName, int basicSalary, int yearOfEmployment) {
        super(firstName, lastName, basicSalary, yearOfEmployment);
        this.bonus = DEFAULT_BONUS;

    }

    public Manager(String firstName, String lastName, int basicSalary, int yearOfEmployment, int bonus) {
        super(firstName, lastName, basicSalary, yearOfEmployment);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {

        this.bonus = bonus;
    }

    @Override
    public int calculateMonthlySalary() {
        return getBasicSalary() + getBonus();
    }

    @Override
    public String toString() {
        return "Manager{" +
                "bonus=" + bonus +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", basicSalary=" + getBasicSalary() +
                ", yearOfEmployment=" + getYearOfEmployment() +
                '}';
    }

}
