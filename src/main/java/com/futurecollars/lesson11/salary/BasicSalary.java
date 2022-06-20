package com.futurecollars.lesson11.salary;

public class BasicSalary implements BasicSalaryCalculator {

    private static final int BASIC = 3000;

    @Override
    public int getBasicSalary() {
        return BASIC;
    }

}
