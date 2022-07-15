package com.futurecollars.lesson8;

public class BillCalculator {

    double calculate(double billValue, float serviceFee) {
        return billValue + serviceFee;
    }

    double calculate(double billValue, float serviceFee, double discount) {
        return billValue > discount ? billValue - discount + serviceFee : serviceFee;
    }

    double calculate(double billValue, float serviceFee, short takeAwayFee) {
        return billValue + serviceFee + takeAwayFee;
    }
}