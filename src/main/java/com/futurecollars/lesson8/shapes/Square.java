package com.futurecollars.lesson8.shapes;

public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
        this.width = this.height = side;
    }

}
