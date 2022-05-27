package com.futurecollars.lesson7;

public class TicketSeller extends BaseEmployee{
    private static final int basicSalaryValue = 3000;

    public TicketSeller(String firstName, String lastName, int yearOfEmployment) {
        super(firstName, lastName, yearOfEmployment);
        this.basicSalary = basicSalaryValue;
    }

    public TicketSeller(String firstName, String lastName, int basicSalary, int yearOfEmployment) {
        super(firstName, lastName, basicSalary, yearOfEmployment);
        this.basicSalary = basicSalary;
    }

    @Override
    public int calculateMonthlySalary() {
        return super.calculateMonthlySalary();
    }


}
