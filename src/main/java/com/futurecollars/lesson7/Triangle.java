package com.futurecollars.lesson7;

public class Triangle {


    // a,b,c are the sides of the triangle
    static boolean isTriangleRectangular(int a, int b, int c) {
        if (a > b + c)
            return a * a == (b * b) + (c * c);
        else if ((b > a + c))
            return b * b == (a * a) + (c * c);
        else
            return c * c == (a * a) + (b * b);
    }

}
