package com.futurecollars.lesson10.squareRoot;

public class Main {

    public static void main(String[] args) {
        double squereRootOfNumber = new SquareRootCalculator().calculateSquareRoot(4.0);
        System.out.println("Result square root: " + squereRootOfNumber);
        squereRootOfNumber = new SquareRootCalculator().calculateSquareRoot(-1.0);
        System.out.println("Result square root:: " + squereRootOfNumber);

    }

}
