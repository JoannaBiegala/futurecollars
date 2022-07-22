package com.futurecollars.lesson15.task3;

public class CinemaHall {

    private final String name;
    private final CinemaHallType cinemaHallType;

    public CinemaHall(String name, CinemaHallType cinemaHallType) {
        this.name = name;
        this.cinemaHallType = cinemaHallType;
    }

    public CinemaHallType getCinemaHallType() {
        return cinemaHallType;
    }

    @Override
    public String toString() {
        return "CinemaHall{" +
                "name='" + name + '\'' +
                ", cinemaHallType=" + cinemaHallType +
                '}';
    }

}
