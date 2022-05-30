package com.futurecollars.lesson7;

public class TicketSeller extends BaseEmployee {

    public TicketSeller(String firstName, String lastName, int yearOfEmployment) {
        super(firstName, lastName, yearOfEmployment);
    }

    public TicketSeller(String firstName, String lastName, int basicSalary, int yearOfEmployment) {
        super(firstName, lastName, basicSalary, yearOfEmployment);
        this.basicSalary = basicSalary;
    }

    @Override
    public int calculateMonthlySalary() {
        return this.getBasicSalary();
    }

    @Override
    public String toString() {
        return "TicketSeller{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", basicSalary=" + basicSalary +
                ", yearOfEmployment=" + yearOfEmployment +
                '}';
    }
}
