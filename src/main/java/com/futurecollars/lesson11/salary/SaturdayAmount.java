package com.futurecollars.lesson11.salary;

public class SaturdayAmount implements SaturdayAmountCalculator{

    private static final int  AMOUNT = 200;
    public int getAmountForSaturday(int saturdayCount) {
        return  AMOUNT * saturdayCount;
    }

}
