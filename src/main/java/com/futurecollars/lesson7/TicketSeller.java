package com.futurecollars.lesson7;

public class TicketSeller extends BaseEmployee {

    public TicketSeller(String firstName, String lastName, int yearOfEmployment) {
        super(firstName, lastName, yearOfEmployment);
    }

    public TicketSeller(String firstName, String lastName, int basicSalary, int yearOfEmployment) {
        super(firstName, lastName, basicSalary, yearOfEmployment);
    }

    @Override
    public int calculateMonthlySalary() {
        return this.getBasicSalary();
    }

    @Override
    public String toString() {
        return "TicketSeller{" +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", basicSalary=" + getBasicSalary() +
                ", yearOfEmployment=" + getYearOfEmployment() +
                '}';
    }

}
