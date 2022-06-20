package com.futurecollars.lesson11.calkulator;

public class CurrencyExchange {

    public double exchangeMoney(double money, CurrencyRate currencyRate) {

        return money * currencyRate.getCurrencyRate();
    }

}
