package com.futurecollars.lesson7;

public class Cinema {
    private final int seatNumber;
    private final int rowNumber;
    private String state;

    public Cinema(int seatNumber, int rowNumber, String state) {
        this.seatNumber = seatNumber;
        this.rowNumber = rowNumber;
        this.state = state;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
