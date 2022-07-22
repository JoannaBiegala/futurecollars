package com.futurecollars.lesson11.calkulator;

public class OnlineCantorConnector implements CurrencyRateProvider {

    @Override
    public double getCurrencyRate(Currency currency) {
        switch (currency) {
            case USD:
                return 4.12;
            case EUR:
                return 4.12;
            case GBP:
                return 4.12;
            default:
                throw new IllegalArgumentException(currency.name());
        }
    }

}
