package com.futurecollars.lesson11.calkulator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount in PLN");
        double money = scanner.nextDouble();
        System.out.println("Enter the currency");
        Currency currency = Currency.valueOf(scanner.next());

        CurrencyRate currencyRate = null;
        switch (currency) {
            case USD:
                currencyRate = new RateUSD();
                break;
            case EUR:
                currencyRate = new RateEUR();
                break;
            case GBP:
                currencyRate = new RateGBP();
                break;
        }

        double result = new CurrencyExchange().exchangeMoney(money, currencyRate);
        System.out.println("After currency conversion: " + result);

    }

}
