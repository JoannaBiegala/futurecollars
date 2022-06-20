package com.futurecollars.lesson11.salary;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class SalaryCalculatorTest {

    @Test
    void shouldBeSalary() {
        //given
        int bonus = 500;
        int saturdayCount = 5;
        BasicSalary basicSalary = Mockito.mock(BasicSalary.class);
        Mockito
                .when(basicSalary.getBasicSalary())
                .thenReturn(3000);
        SaturdayAmount saturdayAmount = Mockito.mock(SaturdayAmount.class);
        Mockito
                .when(saturdayAmount.getAmountForSaturday(saturdayCount))
                .thenReturn(1000);
        //when
        int salary = new SalaryCalculator(bonus, saturdayCount).getSalary();
        Assertions.assertEquals(4500, salary);
    }

}