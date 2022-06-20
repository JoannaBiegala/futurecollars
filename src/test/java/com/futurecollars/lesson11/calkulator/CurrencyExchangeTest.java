package com.futurecollars.lesson11.calkulator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mockito;

import java.util.stream.Stream;

class CurrencyExchangeTest {

    @ParameterizedTest(name = "Currency: {0}")
    @MethodSource(value = "getParams")
    void shouldConvertCurrency(Currency currency, double money, double expected) {
        //given
        CurrencyRateProvider currencyRateProvider = Mockito.mock(CurrencyRateProvider.class);
        Mockito
                .when(currencyRateProvider.getCurrencyRate(currency))
                .thenReturn(3.2);
        //when
        double result = new CurrencyCalculator(currencyRateProvider).exchangeMoney(money, currency);
        //then
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest(name = "Currency: {0}, Money: {1}")
    @MethodSource(value = "getInvalidParams")
    void shouldThrowException(Currency currency, double money) {
        //given
        CurrencyRateProvider currencyRateProvider = Mockito.mock(CurrencyRateProvider.class);
        Mockito
                .when(currencyRateProvider.getCurrencyRate(currency))
                .thenThrow(new IllegalArgumentException());
        //when and then
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new CurrencyCalculator(currencyRateProvider).exchangeMoney(money, currency));
    }

    private static Stream<Arguments> getParams() {
        return Stream.of(Arguments.arguments(Currency.USD, 10.0, 32.0),
                Arguments.arguments(Currency.EUR, 20.0, 64.0),
                Arguments.arguments(Currency.GBP, 0, 0)
        );
    }

    private static Stream<Arguments> getInvalidParams() {
        return Stream.of(Arguments.arguments(Currency.USD, -10.0),
                Arguments.arguments(null, 20.0)
        );
    }

}