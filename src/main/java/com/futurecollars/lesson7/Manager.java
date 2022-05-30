package com.futurecollars.lesson7;

public class Manager extends BaseEmployee {

    private static final int defaultBasicSalaryManager = 5000;
    private static final int defaultBonus = 500;


    private int bonus;

    public Manager(String firstName, String lastName, int yearOfEmployment) {
        super(firstName, lastName, yearOfEmployment);
        this.basicSalary = defaultBasicSalaryManager;
        this.bonus = defaultBonus;
    }

    public Manager(String firstName, String lastName, int basicSalary, int yearOfEmployment) {
        super(firstName, lastName, basicSalary, yearOfEmployment);
        this.bonus = defaultBonus;

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
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", basicSalary=" + basicSalary +
                ", yearOfEmployment=" + yearOfEmployment +
                '}';
    }
}
