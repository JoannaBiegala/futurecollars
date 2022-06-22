package com.futurecollars.lesson11.salary;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mockito;

class SalaryCalculatorTest {

    @ParameterizedTest(name = "Bonus: {0}, Number of Saturdays: {1}")
    @CsvSource(value = {"500:5"}, delimiter = ':')
    void shouldBeSalary(int bonus, int numberOfSaturdays) {
        //given
        OnlineBasicSalaryConnector basicSalary = Mockito.mock(OnlineBasicSalaryConnector.class);
        Mockito
                .when(basicSalary.getBasicSalary())
                .thenReturn(3000);

        OnlinePaymentForSaturdayConnector onlinePaymentForSaturdayConnector = Mockito.mock(OnlinePaymentForSaturdayConnector.class);
        Mockito
                .when(onlinePaymentForSaturdayConnector.getPaymentForSaturday())
                .thenReturn(200);

        //when
        int salary = new SalaryCalculator(bonus, numberOfSaturdays).getSalary();
        //then
        Assertions.assertEquals(4500, salary);
    }

}