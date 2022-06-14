package com.futurecollars.lesson5.task4;

import java.math.BigDecimal;

public class Employee {
    public static final String WHITE_SPACE = " ";
    static int amount;
    private final String name;
    private final String surname;
    private int age;
    private BigDecimal baseSalary;
    private BigDecimal bonus;

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
        amount++;
    }

    public Employee(String name, String surname, int age) {
        this.name = name;
        this.age = age;
        this.surname = surname;
        amount++;
    }

    public Employee(String name, String surname, int age, BigDecimal baseSalary) {
        this.name = name;
        this.age = age;
        this.baseSalary = baseSalary;
        this.surname = surname;
        amount++;
    }

    public Employee(String name, int age, BigDecimal baseSalary, BigDecimal bonus, String surname) {
        this.name = name;
        this.age = age;
        this.baseSalary = baseSalary;
        this.bonus = bonus;
        this.surname = surname;
        amount++;
    }

    public String getEmployeeDescription() {
        return "Employee name : " + name + WHITE_SPACE + surname;
    }

    public String getEmployeeDetailsWithAge() {
        return "Employee details : " + name + WHITE_SPACE + surname + " is " + age;
    }

    public BigDecimal getSalary() {
        return baseSalary.add(bonus);
    }

    public BigDecimal getBonus(){
        return bonus;
    }

    public BigDecimal getBaseSalary() {
        return baseSalary;
    }

}
