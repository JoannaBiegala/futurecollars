package com.futurecollars.lesson11.calkulator;

public class CurrencyCalculator {

    private final CurrencyRateProvider currencyRateProvider;

    public CurrencyCalculator(CurrencyRateProvider currencyRateProvider) {
        this.currencyRateProvider = currencyRateProvider;
    }

    public double exchangeMoney(double money, Currency currency) {

        if (money >= 0) {
            return money * currencyRateProvider.getCurrencyRate(currency);
        } else {
            throw new IllegalArgumentException("Money: " + money);
        }
    }

}
