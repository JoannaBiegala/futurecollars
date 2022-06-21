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
        if (basicSalary < 0) {
            throw new IllegalArgumentException("BasicSalary: " + basicSalary);
        }
        int paymentForSaturday = new OnlinePaymentForSaturdayConnector().getPaymentForSaturday();
        if (paymentForSaturday < 0) {
            throw new IllegalArgumentException("PaymentForSaturday: " + paymentForSaturday);
        }
        return basicSalary + bonus + paymentForSaturday * numberOfWorkedSaturdays;
    }

}
