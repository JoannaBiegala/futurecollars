package com.futurecollars.lesson7;

public class Film {
    private String title;
    private String directorName;
    private int durationInMinutes;
    private int yearOfProduction;

    public Film(String title, String directorName, int durationInMinutes, int yearOfProduction) {
        this.title = title;
        this.directorName = directorName;
        this.durationInMinutes = durationInMinutes;
        this.yearOfProduction = yearOfProduction;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }


}
