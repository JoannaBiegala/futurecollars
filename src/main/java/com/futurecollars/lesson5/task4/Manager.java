package com.futurecollars.lesson5.task4;

import java.math.BigDecimal;

public class Manager extends Employee {
    private BigDecimal bonus;

    public Manager(String name, String surname) {
        super(name, surname);
    }

    public Manager(String name, String surname, int age, BigDecimal baseSalary, BigDecimal bonus) {
        super(name, surname, age, baseSalary);
        this.bonus = bonus;
    }

    public BigDecimal calculateMonthlySalary() {
        return this.getBaseSalary().add(bonus);
    }

    public void setBonus(BigDecimal bonus) {
        this.bonus = bonus;
    }

}
