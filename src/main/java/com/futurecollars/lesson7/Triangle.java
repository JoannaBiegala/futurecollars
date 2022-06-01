package com.futurecollars.lesson7;

public class Triangle {

    static boolean isRectangular(int a, int b, int c) {
        if (a > b + c)
            return isEqualSumOfSquaresToSquareOfNumber(a, b, c);
        else if (b > a + c)
            return isEqualSumOfSquaresToSquareOfNumber(b, a, c);
        else
            return isEqualSumOfSquaresToSquareOfNumber(c, a, b);
    }

    static boolean isEqualSumOfSquaresToSquareOfNumber(int a, int b, int c) {
        return a * a == (b * b) + (c * c);
    }
}
