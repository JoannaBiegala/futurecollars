package com.futurecollars.lesson11.season;

import java.time.Month;

public class SeasonManager {

    public Season getSeason(Month month) {
        Season season = null;
        switch (month) {
            case MARCH:
            case APRIL:
            case MAY:
                season = Season.SPRING;
                break;
            case JUNE:
            case JULY:
            case AUGUST:
                season = Season.SUMMER;
                break;
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                season = Season.AUTUMN;
                break;
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                season = Season.WINTER;
                break;
        }
        return season;
    }

}
