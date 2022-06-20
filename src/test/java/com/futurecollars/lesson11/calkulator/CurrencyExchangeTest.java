package com.futurecollars.lesson11.calkulator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class CurrencyExchangeTest {

    @Test
    void shouldBeGBPConverted() {
        //given
        double money = 10;
        RateGBP currencyRate = Mockito.mock(RateGBP.class);
        Mockito
                .when(currencyRate.getCurrencyRate())
                .thenReturn(3.2);
        //when
        double expected = money * currencyRate.getCurrencyRate();
        //then
        Assertions.assertEquals(32.0, expected);
    }

    @Test
    void shouldBeUSDConverted() {
        //given
        double money = 10;
        RateUSD currencyRate = Mockito.mock(RateUSD.class);
        Mockito
                .when(currencyRate.getCurrencyRate())
                .thenReturn(4.2);
        //when
        double expected = money * currencyRate.getCurrencyRate();
        //then
        Assertions.assertEquals(42.0, expected);
    }


    @Test
    void shouldBeEURConverted() {
        //given
        double money = 10;
        RateEUR currencyRate = Mockito.mock(RateEUR.class);
        Mockito
                .when(currencyRate.getCurrencyRate())
                .thenReturn(5.2);
        //when
        double expected = money * currencyRate.getCurrencyRate();
        //then
        Assertions.assertEquals(52.0, expected);
    }

}