package com.futurecollars.lesson8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BillCalculatorTest {

    @Test
    void calculate() {
        //given
        double billValue = 320.5;
        float serviceFee = 120;
        //when
        Double paymentForBillAndService = new BillCalculator().calculate(billValue, serviceFee);
        //then
        Assertions.assertEquals(440.5, paymentForBillAndService);
    }

    @Test
    void testCalculate() {
        //given
        double billValue = 320.5;
        float serviceFee = 120;
        double discount = 20.5;
        //when
        Double paymentForBillAndService = new BillCalculator().calculate(billValue, serviceFee, discount);
        //then
        Assertions.assertEquals(420.0, paymentForBillAndService);

    }

    @Test
    void testCalculate1() {
        //given
        double billValue = 320.5;
        float serviceFee = 120;
        short takeAwayFee = 100;
        //when
        Double paymentForBillAndService = new BillCalculator().calculate(billValue, serviceFee, takeAwayFee);
        //then
        Assertions.assertEquals(540.5, paymentForBillAndService);

    }
}