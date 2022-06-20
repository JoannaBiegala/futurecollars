package com.futurecollars.lesson11.salary;

public class SalaryCalculator {
    int bonus;
    int saturdayCount;

    int basicSalary;
    int saturdayAmount;

    public SalaryCalculator(int bonus, int saturdayCount) {
        this.bonus = bonus;
        this.saturdayCount = saturdayCount;
        basicSalary = new BasicSalary().getBasicSalary();
        saturdayAmount = new SaturdayAmount().getAmountForSaturday(saturdayCount);
    }

    int getSalary(){
        return basicSalary + bonus + saturdayAmount;
    }

}
