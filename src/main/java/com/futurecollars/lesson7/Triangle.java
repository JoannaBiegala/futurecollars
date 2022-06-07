package com.futurecollars.lesson7;

public class Triangle {

    static boolean isRectangular(int a, int b, int c) {
        if (a > b + c)
            return checkRectangularCondition(a, b, c);
        else if (b > a + c)
            return checkRectangularCondition(b, a, c);
        else
            return checkRectangularCondition(c, a, b);
    }

    private static boolean checkRectangularCondition(int a, int b, int c) {
        return a * a == (b * b) + (c * c);
    }

}
