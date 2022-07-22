package com.futurecollars.lesson11.salary;

public class SalaryCalculator {

    private final int bonus;
    private final int numberOfWorkedSaturdays;

    public SalaryCalculator(int bonus, int numberOfWorkedSaturdays) {
        this.bonus = bonus;
        this.numberOfWorkedSaturdays = numberOfWorkedSaturdays;
    }

    public int getSalary() {
        int basicSalary = new OnlineBasicSalaryConnector().getBasicSalary();
        int paymentForSaturday = new OnlinePaymentForSaturdayConnector().getPaymentForSaturday();
        return basicSalary + bonus + paymentForSaturday * numberOfWorkedSaturdays;
    }

}
