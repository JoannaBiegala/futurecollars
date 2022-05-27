package com.futurecollars.lesson7;

public class Kino {
    private int seatNumber;
    private int rowNumber;
    private String state;

    public Kino(int seatNumber, int rowNumber, String state) {
        this.seatNumber = seatNumber;
        this.rowNumber = rowNumber;
        this.state = state;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public void setRowNumber(int rowNumber) {
        this.rowNumber = rowNumber;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
